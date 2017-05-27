var onError = require('./errors-handler');
var writeFile = require('./write-file');

var createApplicationEntrypoint = function (outputDirectory, outputBaseDirectory, projectApplicationName) {
    //    console.log('Inside Create Application Entrypoint');

    var applicationFileData = '';
    try {
        applicationFileData = fs.readFileSync('./resources/EgovApplication.java', 'utf8');
    } catch (error) {
        onError(error);
    }
    applicationFileData = applicationFileData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));
    applicationFileData = applicationFileData.replace(new RegExp('EgovApplication', 'g'), projectApplicationName);
    writeFile(outputDirectory, projectApplicationName + '.java', applicationFileData);
}

module.exports = createApplicationEntrypoint;
