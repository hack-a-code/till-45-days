// get an instance of mongoose and mongoose.Schema
const mongoose = require('mongoose');
const Schema = mongoose.Schema;
const timestamps = require('mongoose-timestamp');
const pagination = require("mongoose-paginate");
const jwt = require('jsonwebtoken');
const boom = require('boom');
const Utils = require('./../utils');
const config = require('./../config');

// set up a mongoose model and pass it using module.exports
var UsersSchema = new Schema({
    id: Schema.Types.ObjectId,
    salutation: { type: String, enum: ['Mr', 'Ms', 'Mrs'] },
    firstName: { type: String, minlength: 2, maxlength: 25, trim: true, required: true },
    middleName: { type: String, minlength: 1, maxlength: 25, trim: true },
    lastName: { type: String, minlength: 1, maxlength: 25, trim: true },
    gender: { type: String, enum: ['M', 'F', 'O'] },
    dob: { type: Date, required: true },
    email: { type: String, minlength: 5, maxlength: 100, trim: true, required: true, index: { unique: true } },
    altEmail: { type: String, minlength: 5, maxlength: 100, trim: true },
    mobileNo: { type: Number, max: 9999999999, required: true, index: { unique: true } },
    altMobileNos: [{ type: Number, max: 9999999999 }],
    username: { type: String, minlength: 5, maxlength: 25, trim: true, required: true, index: { unique: true } },
    hashedPassword: { type: String, maxlength: 60, trim: true, required: true },
    userType: { type: String, minlength: 5, maxlength: 50, trim: true },
    role: { type: String, enum: ['ADMIN', 'MANAGER', 'EMPLOYEE', 'CLIENT', 'USER'], default: 'USER' },
    isActive: { type: Boolean, default: true }
});

UsersSchema.statics.validate = function (userData, cb) {
    this.findOne({$or: [
        { email: userData.email },
        { mobileNo: userData.mobileNo },
        { username: userData.username }
    ]}, function(error, user) {
        if(!user)
            return cb(null);
        if (user.email == userData.email)
            return cb("email '" + user.email + "' already exists");
        else if (user.mobileNo == userData.mobileNo)
            return cb("mobileNo '" + user.mobileNo + "' already exists");
        else if (user.username == userData.username)
            return cb("username '" + user.username + "' already exists");
    });
};

UsersSchema.statics.register = function (userData, cb) {
    Utils.hash.encryptPassword(userData.password, function (hashedPassword) {
        userData.hashedPassword = hashedPassword;
        delete userData.password;
        userData.dob = Utils.parseDate(userData.dob);
        var User = new OAuthUsersModel(userData);
        User.save(function (error, user) {
            if (error || !user) {
                Utils.onError(error);
                return cb(boom.badRequest('Email already exists. Please login').output.payload, null);
            }
            return cb(null, Utils.pick(user, ['firstName', 'lastName', 'email', 'createdAt', 'updatedAt']));
        });
    });
};

UsersSchema.statics.authenticate = function (username, password, cb) {
    this.findOne({username: username}, function (error, user) {
        if (error || !user) {
            Utils.onError(error)
            return cb(boom.unauthorized('Invalid username').output.payload);
        }
        var userDetails = Utils.pick(user, ['firstName', 'lastName', 'username', 'email', 'createdAt', 'updatedAt']);
        var token = jwt.sign(userDetails, config.secret, {
            expiresIn: 24 * 60 * 60 // expires in 1 day
        });
        Utils.hash.comparePassword(password, user.hashedPassword, function (result) {
            if (result) {
                return cb(null, {
                    statusCode: 200,
                    username: userDetails.username,
                    token: token
                });
            }
            cb(boom.unauthorized('Invalid password').output.payload);
        })
    });
}

UsersSchema.plugin(timestamps);
pagination(UsersSchema);

mongoose.model('users', UsersSchema);
const OAuthUsersModel = mongoose.model('users');

module.exports = OAuthUsersModel;
