var onError = require('./errors-handler');
var writeFile = require('./write-file');

var createQueryParamsWrapper = function (outputDirectory, outputBaseDirectory, modelObject, className) {
    //    console.log('Inside Create Params Wrapper Contract');

    var paramsWrapperData = '';
    try {
        paramsWrapperData = fs.readFileSync('./resources/web/contract/query-params-wrapper/QueryParamsWrapper.java', 'utf8');
    } catch (error) {
        onError(error);
    }
    paramsWrapperData = paramsWrapperData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    var attributes = '';
    modelObject.attributes.forEach((attribute) => {
        if (attribute.name == 'tenantId')
            attributes += '\n\t' + '@NotNull';
        attributes += '\n\t' + 'private ' + attribute.type + ' ' + attribute.name + ';' + '\n';
    });

    paramsWrapperData = paramsWrapperData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));
    paramsWrapperData = paramsWrapperData.replace(new RegExp('Language', 'g'), className);
    paramsWrapperData = paramsWrapperData.replace(new RegExp('~~!~~Insert Params Here~~!~~', 'g'), attributes);

    writeFile(outputDirectory + '/web/contract/wrapper', className + 'QueryParamsWrapper.java', paramsWrapperData);
}

module.exports = createQueryParamsWrapper;
