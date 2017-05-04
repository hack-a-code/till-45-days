const fs = require('fs');
const onError = require('./on-error');

exports.readDirSync = function(directory) {
    try {
        return fs.readdirSync(directory);
    } catch (err) {
        onError(err);
    }
}

exports.readFileSync = function(file) {
    try {
        return fs.readFileSync(file, 'utf8');
    } catch (err) {
        onError(err);
    }
}

exports.writeFileSync = function(file, data) {
    try {
        fs.writeFileSync(file, data, 'utf8');
    } catch (err) {
        onError(err);
    }
}
