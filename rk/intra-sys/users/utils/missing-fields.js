var missingFields = function (src, fields) {
    return fields.reduce((fields, currField) => {
        if (src[currField] == null || src[currField].length == 0) {
            if (fields.length > 0)
                fields += ', ' + currField;
            else
                fields += currField;
        }
        return fields;
    }, '');
}

module.exports = missingFields;
