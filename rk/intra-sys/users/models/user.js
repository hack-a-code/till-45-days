// get an instance of mongoose and mongoose.Schema
const mongoose = require('mongoose');
const Schema = mongoose.Schema;
const timestamps = require('mongoose-timestamp');
const pagination = require("mongoose-paginate");
const hash = require('./../utils/hash');
const SALT_WORK_FACTOR = 9;

// set up a mongoose model and pass it using module.exports
var UsersSchema = new Schema({
    id: Schema.Types.ObjectId,
    salutation: { type: String, enum: ['Mr', 'Ms', 'Mrs'], default: 'Mr' },
    firstName: { type: String, minlength: 2, maxlength: 25, trim: true, required: true },
    middleName: { type: String, minlength: 1, maxlength: 25, trim: true },
    lastName: { type: String, minlength: 1, maxlength: 25, trim: true },
    gender: { type: String, enum: ['M', 'F', 'O'], default: 'M'},
    dob: { type: Date, required: true },
    email: { type: String, minlength: 5, maxlength: 100, trim: true, required: true, index: { unique: true } },
    altEmail: { type: String, minlength: 5, maxlength: 100, trim: true },
    mobileNo: { type: Number, max: 9999999999, required: true, index: { unique: true } },
    altMobileNos: [{ type: Number, max: 9999999999 }],
    username: { type: String, minlength: 5, maxlength: 25, trim: true, required: true, index: { unique: true } },
    password: { type: String, minlength: 5, maxlength: 50, trim: true, required: true },
    userType: { type: String, minlength: 5, maxlength: 50, trim: true },
    isActive: { type: Boolean, default: true }
});

UsersSchema.static('register', function (fields, cb) {
    var user;

    fields.hashed_password = hash.encryptPassword(fields.password);
    delete fields.password;
    user = new OAuthUsersModel(fields);
    user.save(function (err, user) {
        if (err || !user)
            return cb(boom.badRequest('Email already exists. Please login').output.payload, null);
        return cb(null, Utils.pick(user, ['firstname', 'lastname', 'email', 'createdAt', 'updatedAt']));
    });
});

UsersSchema.static('authenticate', function (email, password, cb) {
    this.findOne({email: email}, function (err, user) {
        if (err || !user)
            return cb(boom.unauthorized('Invalid username or password').output.payload);
        var userProjection = Utils.pick(user, ['firstname', 'lastname', 'email', 'createdAt', 'updatedAt']);
        var token = jwt.sign(userProjection, secret, {
            expiresIn: 1440 * 60// expires in 24 hours
        });
        if (bcrypt.compareSync(password, user.hashed_password))
            return cb(null, {
                user: userProjection,
                token: token
            });

        cb(boom.unauthorized('Invalid username or password').output.payload);
    });
});

UsersSchema.plugin(timestamps);
pagination(UsersSchema);

mongoose.model('users', UsersSchema);
const OAuthUsersModel = mongoose.model('users');

module.exports = OAuthUsersModel;
