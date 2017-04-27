const fs = require('fs');

var readFiles = function (dirname, callbackOnFileContent, callbackOnError) {
    fs.readdir(dirname, function(err, filenames) {
        if (err) {
            callbackOnError(err);
            return;
        }
        filenames.forEach(function(filename) {
            fs.readFile(dirname + filename, 'utf-8', function(err, content) {
                if (err) {
                    callbackOnError(err);
                    return;
                }
                callbackOnFileContent(filename, content);
            });
        });
    });
}

var onFileContent = function (filename, content) {
    console.log('File ', filename, ' contains : ', content);
}

var onError = function (error) {
    console.error('Following error occurred : ' + error);
}

readFiles('jsons/', onFileContent, onError);
