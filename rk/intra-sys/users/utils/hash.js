const bcrypt = require('bcrypt');
const onError = require('./on-error');

// To hash (encrypt) a password
var hash = {
    encryptPassword: function(plainTextPassword, callback) {
        const saltRounds = 9;
        bcrypt.genSalt(saltRounds, function(err, salt) {
            if (err)
                onError(err);
            bcrypt.hash(plainTextPassword, salt, function(err, hash) {
                if (err)
                    onError(err);
                callback(hash);
            });
        });
    },

    // To compare user entered plain text password with hashed (encrypted) password from db
    comparePassword: function(plainTextPassword, hashedPassword, callback) {
        console.log('plainTextPassword: ', plainTextPassword, ' & hashedPassword: ', hashedPassword);
        bcrypt.compare(plainTextPassword, hashedPassword, function(err, result) {
            if (err)
                onError(err);
            callback(result);
        });
    }
}

module.exports = hash;
