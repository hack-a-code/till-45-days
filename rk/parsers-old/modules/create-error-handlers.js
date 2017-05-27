var onError = require('./errors-handler');
var commonReplacer = require('./common-replacer');
var writeFile = require('./write-file');

var createErrorHandlers = function (outputDirectory, outputBaseDirectory, className) {
    //    console.log('Inside Create Controller');

    var subPackage = '/web/errorhandlers';
    fs.readdir('./resources' + subPackage, (err, fileNames) => {
        if (err) {
            onError(err);
            return;
        }
        fileNames.forEach((file) => {
            try {
                var errorHandlerContent = '';
                if (fs.lstatSync('./resources' + subPackage + '/' + file).isFile()) {
                    try {
                        errorHandlerContent = fs.readFileSync('./resources' + subPackage + '/' + file, 'utf8');
                    } catch (err) {
                        onError(err);
                        return;
                    }
                    errorHandlerContent = errorHandlerContent.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

                    writeFile(outputDirectory + subPackage, file, errorHandlerContent);
                }
            } catch (error) {
                onError(error);
            }
        });
    });
}

module.exports = createErrorHandlers;
