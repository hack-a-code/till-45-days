fs = require('fs');
path = require('path');
var initiator = require('./modules/initiator');

var inputPathFileDate = fs.readFileSync('./input-paths.txt', 'utf8');
var lines = inputPathFileDate.split('\n');

//    console.log('Inside App');
//    console.log('Total projects: ', lines.length);

for(var i = 0; i < lines.length; i++) {
    var paths = lines[i].split(' ');
    initiator(paths[0], paths[1], paths[2], paths[3], paths[4]);
}
