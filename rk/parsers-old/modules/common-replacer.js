var pluralize = require('pluralize');
var camelCase = require('camelcase');
var writeFile = require('./write-file');
var onError = require('./errors-handler');

var commonReplacer = function (className, subPackage, fileEndsWith) {
    //    console.log('Inside Common Creator');

    var commonContent = '';

    try {
        commonContent = fs.readFileSync('./resources' + subPackage + '/' + fileEndsWith, 'utf8');
    } catch (err) {
        onError(err);
        return;
    }
    commonContent = commonContent.replace(new RegExp('Languages', 'g'), pluralize.plural(className));
    commonContent = commonContent.replace(new RegExp('Language', 'g'), className);
    commonContent = commonContent.replace(new RegExp('/languages', 'g'), '/' + pluralize.plural(className.toLowerCase()));
    commonContent = commonContent.replace(new RegExp('languages', 'g'), pluralize.plural(camelCase(className)));
    commonContent = commonContent.replace(new RegExp('language', 'g'), camelCase(className));


    return commonContent;
}

module.exports = commonReplacer;
