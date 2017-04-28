const fs = require('fs');

var readFiles = function (dirname, callbackOnFileContent, callbackOnError) {
    // fs.readdir(dirname, function(err, filenames) {
    //     if (err) {
    //         callbackOnError(err);
    //         return;
    //     }
    //     filenames.forEach(function(filename) {
    var filename = 'User.json';
            fs.readFile(dirname + '/' + filename, 'utf-8', function(err, content) {
                if (err) {
                    callbackOnError(err);
                    return;
                }
                callbackOnFileContent(filename, content);
            });
    //     });
    // });
}

var onFileContent = function (filename, content) {
    content = JSON.parse(content);
    Object.keys(content.paths).forEach( path => {
        console.log('File ', filename, ' contains : ', path, ' route');
        Object.keys(content.paths[path]).forEach( methodType => {
            console.log('Above path contains : ', methodType, ' method');
        });
    });
}

var onError = function (error) {
    console.error('Following error occurred : ' + error);
}

readFiles('jsons', onFileContent, onError);
