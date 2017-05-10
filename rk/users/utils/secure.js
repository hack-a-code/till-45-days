/*
 *  bcrypt module taken from : https://github.com/kelektiv/node.bcrypt.js/
 */
const bcrypt = require('bcrypt');
const onError = require('./on-error');

// To hash (encrypt) a password
exports.encryptPassword = function(plainTextPassword, callback) {
    const saltRounds = 9;
    bcrypt.genSalt(saltRounds, function(err, salt) {
        if (err)
            onError(err);
        bcrypt.hash(myPlaintextPassword, salt, function(err, hash) {
            if (err)
                onError(err);
            callback(hash);
        });
    }
}

// To compare user entered plain text password with hashed (encrypted) password from db
exports.decryptPassword = function(plainTextPassword, hashedPassword, callback) {
    bcrypt.compare(plainTextPassword, hashedPassword, function(err, result) {
        if (err)
            onError(err);
        callback(result);
    }
}
