var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createContract = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Controller');

    var subPackage = '/web/contract';
    fs.readdir('./resources' + subPackage, (err, fileNames) => {
        if (err) {
            onError(err);
            return;
        }
        fileNames.forEach((file) => {
            try {
                var contractContent = '';
                if (fs.lstatSync('./resources' + subPackage + '/' + file).isFile()) {
                    try {
                        contractContent = fs.readFileSync('./resources' + subPackage + '/' + file, 'utf8');
                    } catch (err) {
                        onError(err);
                        return;
                    }
                    contractContent = contractContent.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

                    writeFile(outputDirectory + subPackage, file, contractContent);
                }
            } catch (error) {
                onError(error);
            }
        });
    });
}

module.exports = createContract;
