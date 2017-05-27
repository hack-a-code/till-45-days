var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createController = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Controller');

    var subPackage = '/web/controller';
    var fileEndsWith = 'Controller.java';

    var controllerFileData = commonReplacer(className, subPackage, fileEndsWith);

    controllerFileData = controllerFileData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    writeFile(outputDirectory + subPackage, className + fileEndsWith, controllerFileData);
}

module.exports = createController;
