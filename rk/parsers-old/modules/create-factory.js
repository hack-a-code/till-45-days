var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createFactory = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Controller');

    var subPackage = '/web/contract/factory';
    var fileName = 'ResponseInfoFactory.java';
    var factoryContent = '';

    try {
        factoryContent = fs.readFileSync('./resources' + subPackage + '/' + fileName, 'utf8');
    } catch (err) {
        onError(err);
        return;
    }
    factoryContent = factoryContent.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    writeFile(outputDirectory + subPackage, fileName, factoryContent);
}

module.exports = createFactory;
