var camelCase = require('camelcase');
var initCaps = require('./../utility/initCaps');

var createRowMapperData = function (modelObject, className, outputBaseDirectory) {
    //    console.log('Inside Create Row Mapper Data');

    var package = 'package ' + outputBaseDirectory.replace(new RegExp('/', 'g'), '.') + '.repository.rowmapper;';

    var importsArray = [
        'import java.sql.ResultSet;',
        'import java.sql.SQLException;',
        'import ' + outputBaseDirectory.replace(new RegExp('/', 'g'), '.') + '.model.' + className + ';',
        'import org.springframework.jdbc.core.RowMapper;',
        'import org.springframework.stereotype.Component;'
    ];
    var imports = '';
    for(var i = 0; i < importsArray.length; i++) {
        var importSignature = importsArray[i].substr(0, importsArray[i].indexOf('.'));
        var previousImportSignature = '';
        if(i != 0)
            previousImportSignature = importsArray[i - 1].substr(0, importsArray[i].indexOf('.'));
        if(importSignature != previousImportSignature)
            imports += '\n';

        imports += importsArray[i] + '\n';
    }

    var classAnnotation = '@Component' + '\n';
    var functionAnnotation = '\n\t' + '@Override' + '\n';

    var setters = '';
    modelObject.attributes.forEach((attribute) => {
        var attributeType = attribute.type != 'Integer' ? attribute.type : 'Int';
        setters += '\n\t\t' + camelCase(className) + '.set' + initCaps(attribute.name) + '(rs.get' + attributeType + '("' + attribute.name + '"));';
    });

    var rowMapperFileData = modelObject.headComment +
        '\n' + package + '\n' + imports +
        '\n' + classAnnotation +
        'public class ' + className + 'RowMapper implements RowMapper<' + className + '>' + ' {' +
        '\n' + functionAnnotation +
        '\tpublic ' + className + ' mapRow(ResultSet rs, int rowNum) throws SQLException {' +
		'\n\t\t' + className + ' ' + camelCase(className) + ' = new ' + className + '();' + setters +
        '\n\t\t' + 'return ' + camelCase(className) + ';' +
        '\n\t' + '}' + '\n' + '}';

    return rowMapperFileData;
}

module.exports = createRowMapperData;
