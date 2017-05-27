var camelCase = require('camelcase');
var onError = require('./errors-handler');
var createQueryBuilderConditions = require('./create-querybuilder-conditions');

var createQueryBuilderData = function (modelObject, className, outputDirectory, outputBaseDirectory) {
    //    console.log('Inside Create Query Builder Data');

    var queryBuilderData = '';
    try {
        queryBuilderData = fs.readFileSync('./resources/repository/querybuilder/QueryBuilder.java', 'utf8');
    } catch (error) {
        onError(error);
    }
    queryBuilderData = queryBuilderData.replace(new RegExp('org.egov.eis', 'g'), outputBaseDirectory.replace(new RegExp('/', 'g'), '.'));

    if (outputDirectory.includes('common') || outputDirectory.includes('user'))
        queryBuilderData = queryBuilderData.replace(new RegExp('eg_', 'g'), 'eg');
    else
        queryBuilderData = queryBuilderData.replace(new RegExp('eg_', 'g'), 'egeis_');
    queryBuilderData = queryBuilderData.replace(new RegExp('Language', 'g'), className);
    queryBuilderData = queryBuilderData.replace(new RegExp('language', 'g'), camelCase(className));

    var ifConditions = createQueryBuilderConditions(modelObject, className);
    queryBuilderData = queryBuilderData.replace(new RegExp('~~!~~addAllChecksHere~~!~~', 'g'), ifConditions);

    return queryBuilderData;
}

module.exports = createQueryBuilderData;
