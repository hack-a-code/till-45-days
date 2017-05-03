const fs = require('fs');
const onError = require('./on-error');

exports.readDir = function(directory) {
    try {
        return fs.readdirSync(directory);
    } catch (err) {
        onError(err);
    }
}

exports.readFiles = function(directory, fileNames) {
    fileNames.reduce((initObj, fileName) => {
        var fileNameKey = fileName.substring(0, fileName.length - 3);
        var fileContent;
        try {
            console.log(directory + '/' + fileName);
            fileContent = fs.readFileSync(directory + '/' + fileName);
        } catch (err) {
            onError(err);
        }
        initObj[fileNameKey] = fileContent;
        console.log(fileContent);
        return initObj;
    }, {});
}
