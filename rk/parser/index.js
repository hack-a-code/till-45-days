const path = require('path');
const fsOps = require('./utils/fs-ops');
const yamlToJSON = require('./utils/yaml-to-json');

var inputDirectory = 'yamls';
var files = fsOps.readDirSync(inputDirectory);

var finalObject = files.reduce((initObj, currFile) => {
    var filePath = inputDirectory + '/' + currFile;
    var fileNameKey = path.basename(currFile, path.extname(currFile));
    initObj[fileNameKey] = yamlToJSON.parseFile(filePath);
    return initObj;
}, {});

console.log(JSON.stringify(finalObject.User.paths['/_create']));

// const fs = require('fs');
// const initCaps = require('./utils/init-caps')
// const initSmall = require('./utils/init-small')
// const pick = require('./utils/pick')
//
// var readFiles = function (dirname, callbackOnFileContent, callbackOnError) {
//     fs.readdir(dirname, function(err, filenames) {
//         if (err) {
//             callbackOnError(err);
//             return;
//         }
//         filenames.forEach(function(filename) {
//     var filename = 'User.json';
//             fs.readFile(dirname + '/' + filename, 'utf-8', function(err, content) {
//                 if (err) {
//                     callbackOnError(err);
//                     return;
//                 }
//                 callbackOnFileContent(filename, content);
//             });
//         });
//     });
// }
//
// var onFileContent = function (filename, content) {
//     content = JSON.parse(content);
//     Object.keys(content.paths).forEach( path => {
//         Object.keys(content.paths[path]).forEach( methodType => {
//             console.log('Above path contains : ', methodType, ' method');
//         });
//     });
// }
//
// var onError = function (error) {
//     console.error('Following error occurred : ' + error);
// }
//
// readFiles('jsons', onFileContent, onError);
