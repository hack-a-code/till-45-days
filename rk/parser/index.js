const fsOps = require('./utils/fs-ops');

var files = fsOps.readDir('jsons');
console.log(files);
var fileContents = fsOps.readFiles('jsons', files);
console.log(fileContents);



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
