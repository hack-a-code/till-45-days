var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createService = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Service');

    var subPackage = '/service';
    var fileEndsWith = 'Service.java';

    var serviceFileData = commonReplacer(className, subPackage, fileEndsWith);

    serviceFileData = serviceFileData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    writeFile(outputDirectory + subPackage, className + fileEndsWith, serviceFileData);
}

module.exports = createService;
