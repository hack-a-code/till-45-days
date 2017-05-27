var onError = require('./errors-handler');
var writeFile = require('./write-file');

var createPropertiesFile = function (outputDirectory, outputBaseDirectory) {
    //    console.log('Inside Create Config File');

    var propertiesFileData = '';
    try {
        propertiesFileData = fs.readFileSync('./resources/config/ApplicationProperties.java', 'utf8');
    } catch (error) {
        onError(error);
    }

    propertiesFileData = propertiesFileData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    writeFile(outputDirectory + '/config', 'ApplicationProperties.java', propertiesFileData);
}

module.exports = createPropertiesFile;
