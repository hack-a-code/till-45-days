var camelCase = require('camelcase');
var initCaps = require('./../utility/initCaps');

var createQueryBuilderConditions = function(modelObject, className) {
    //    console.log('Inside Create Query Builder Conditions');

    var getters = [];
    var queryConditions = [];
    modelObject.attributes.forEach((attribute) => {
        if(!(attribute.name.includes('description') || attribute.name.includes('ArrayList'))) {
            getters.push(camelCase(className) + 'QueryParamsWrapper.get' + initCaps(attribute.name) + '()');
            queryConditions.push(camelCase(className + 'QueryParamsWrapper') + '.' + attribute.name + '=?');
        }
    });

    var whereAndisAppendAndClause = '\n\n\t\t\t' + 'selectQuery.append(" WHERE");' +
        '\n\t\t\t' + 'boolean isAppendAndClause = false;';
    var innerIfs = '\n\n\t\t';

    var ifCondition = '';
    for (var i = 0; i < getters.length; i++) {
        ifCondition = ifCondition + getters[i] + ' == null || ';
        innerIfs = innerIfs + '\t' + 'if (' + getters[i] + ' != null) {' +
            '\n\t\t\t' + 'selectQuery.append(" ' + queryConditions[i] + '");' +
            '\n\t\t\t' + 'preparedStatementValues.add(' + getters[i] + ');';
        if (i == 0)
            innerIfs = innerIfs + '\n\t\t\t' + 'isAppendAndClause = true;';
        else
            innerIfs = innerIfs + '\n\t\t\t' + 'isAppendAndClause = addAndClauseIfRequired(isAppendAndClause, selectQuery);';
        innerIfs = innerIfs + '\n\t\t\t' + '}' + '\n\n\t\t';
    }
    var middleContent = '\n\t\t' + 'if (' + ifCondition.substr(0, ifCondition.length - 4) + ')' +
        '\n\t\t\t' + 'return;' +
        '\t\t' + whereAndisAppendAndClause +
        '\t\t' + innerIfs;

    return middleContent;
}

module.exports = createQueryBuilderConditions;