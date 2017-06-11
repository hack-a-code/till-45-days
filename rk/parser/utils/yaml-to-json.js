const YAML = require('yamljs');
const onError = require('./on-error');

exports.parseFile = function(file) {
    try {
        return YAML.load(file);
    } catch (err) {
        onError(err);
    }
}
