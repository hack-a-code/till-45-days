const YAML = require('yamljs');
const onError = require('./on-error');

exports.parseFile = function(file, parsedContent) {
    try {
        YAML.load(file, parsedContent);
    } catch (err) {
        onError(err);
    }
}
