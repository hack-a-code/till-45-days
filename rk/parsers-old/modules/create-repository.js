var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createRepository = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Repository');

    var subPackage = '/repository';
    var fileEndsWith = 'Repository.java';

    var repositoryFileData = commonReplacer(className, subPackage, fileEndsWith);

    repositoryFileData = repositoryFileData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    writeFile(outputDirectory + subPackage, className + fileEndsWith, repositoryFileData);
}

module.exports = createRepository;
