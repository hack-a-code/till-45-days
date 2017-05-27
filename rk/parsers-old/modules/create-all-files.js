var createModelObject = require('./create-model-object');
var onError = require('./errors-handler');
var createModelData = require('./create-model-data');
var createRowMapperData = require('./create-rowmapper-data');
var createQueryBuilderData = require('./create-querybuilder-data');
var createEnums = require('./create-enums');
var writeFile = require('./write-file');
var commonReplacer = require('./common-replacer');
var createController = require('./create-controller');
var createRepository = require('./create-repository');
var createService = require('./create-service');
var createQueryParamsWrapper = require('./create-query-params-wrapper');
var createContract = require('./create-contract');
var createFactory = require('./create-factory');
var createErrorHandlers = require('./create-error-handlers');

var createAllFiles = function (inputDirectory, outputBaseDirectory, outputDirectory) {
    //    console.log('Inside Create All Files');


    fs.readdir(inputDirectory, (err, fileNames) => {
        if (err) {
            onError(err);
            return;
        }

        var headComment = '';
        try {
            headComment = fs.readFileSync('./resources/headComment', 'utf8');
        } catch (error) {
            onError(error);
        }

        fileNames.forEach((fileName) => {
            if (path.extname(inputDirectory + fileName) == '.java')
                fs.readFile(inputDirectory + fileName, 'utf8', function (err, content) {
                    if (err) {
                        onError(err);
                        return;
                    }
                    if (fileName.includes('Res.java'))
                        fileName = fileName.replace('Res', 'Response');
                    if (fileName.includes('Req.java'))
                        fileName = fileName.replace('Req', 'Request');

                    var className = fileName.substr(0, fileName.indexOf('.'));
                    var modelObject = createModelObject(outputBaseDirectory, fileName, content, headComment);
                    var modelFileData = createModelData(modelObject, fileName);

                    if(modelObject.enums.length > 0)
                        createEnums(outputDirectory, modelObject);

                    if(fileName.includes('Error'))
                        return;

                    if (fileName.includes('Response') || fileName.includes('Request')) {
                        writeFile(outputDirectory + '/web/contract', fileName, modelFileData);
                    } else {
                        writeFile(outputDirectory + '/model', fileName, modelFileData);

                        var rowMapperFileData = createRowMapperData(modelObject, className, outputBaseDirectory);
                        var queryBuilderFileData = createQueryBuilderData(modelObject, className, outputDirectory, outputBaseDirectory);

                        createController(outputDirectory, outputBaseDirectory, className);
                        createRepository(outputDirectory, outputBaseDirectory, className);
                        createService(outputDirectory, outputBaseDirectory, className);
                        createContract(outputDirectory, outputBaseDirectory, className);
                        createFactory(outputDirectory, outputBaseDirectory, className);
                        createErrorHandlers(outputDirectory, outputBaseDirectory, className);

                        createQueryParamsWrapper(outputDirectory, outputBaseDirectory, modelObject, className);

                        writeFile(outputDirectory + '/repository/rowmapper', className + 'RowMapper.java', rowMapperFileData);
                        writeFile(outputDirectory + '/repository/builder', className + 'QueryBuilder.java', queryBuilderFileData);
                    }
                });
        });
    });
}

module.exports = createAllFiles;
