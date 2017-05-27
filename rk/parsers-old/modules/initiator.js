var createDirectories = require('./create-directories');
var createApplicationEntrypoint = require('./create-application-entrypoint');
var copyFromResources = require('./copy-from-resources');
var createAllFiles = require('./create-all-files');
var createPomXML = require('./create-pom-xml');
var createPropertiesFile = require('./create-properties-file');

var count = 0;

var initiator = function (inputDirectory, outputBaseDirectory, projectDirectory, projectName, projectApplicationName) {
    //    console.log('------------------ Inside Initiator: ', ++count, ' ------------------');

    var outputDirectory = projectDirectory + '/' + outputBaseDirectory;

    createPomXML(projectDirectory, projectName);
    createDirectories(projectDirectory, outputBaseDirectory);
    createPropertiesFile(outputDirectory, outputBaseDirectory);
    createApplicationEntrypoint(outputDirectory, outputBaseDirectory, projectApplicationName);
    copyFromResources(projectDirectory, outputDirectory);
    createAllFiles(inputDirectory, outputBaseDirectory, outputDirectory);
}

module.exports = initiator;