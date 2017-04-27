// get an instance of mongoose and mongoose.Schema
var mongoose = require('mongoose');
var Schema = mongoose.Schema;
var timestamps = require('mongoose-timestamp');
var pagination = require("mongoose-paginate");

// set up a mongoose model and pass it using module.exports
var usersSchema = new Schema({
    id: Schema.Types.ObjectId,
    salutation: { type: String, enum: ['Mr', 'Ms', 'Mrs'], default: 'Mr' },
    firstName: { type: String, minlength: 2, maxlength: 25, trim: true, required: true },
    middleName: { type: String, minlength: 1, maxlength: 25, trim: true },
    lastName: { type: String, minlength: 1, maxlength: 25, trim: true },
    gender: { type: String, enum: ['M', 'F', 'O'], default: 'M'},
    dob: { type: Date, required: true },
    email: { type: String, minlength: 5, maxlength: 100, trim: true, required: true },
    altEmail: { type: String, minlength: 5, maxlength: 100, trim: true },
    mobileNo: { type: Number, max: 9999999999, required: true },
    altMobileNos: [{ type: Number, max: 9999999999 }],
    username: { type: String, minlength: 5, maxlength: 25, trim: true, required: true },
    password: { type: String, minlength: 5, maxlength: 50, trim: true, required: true },
    userType: { type: String, minlength: 5, maxlength: 50, trim: true },
    isActive: { type: Boolean, default: true }
});

usersSchema.plugin(timestamps);
pagination(usersSchema);

module.exports = mongoose.model('users', usersSchema);
