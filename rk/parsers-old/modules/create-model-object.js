var getRequestConstructor = require('./request-constructor');


var createModelObject = function (outputBaseDirectory, fileName, content, headComment) {
    //    console.log('Inside Create Model Object');

    var neglectFilesList = ['Error', 'ErrorResponse', 'ErrorResponseponse', 'PagingInfo', 'RequestuestInfo', 'ResponseponseInfo'];
    neglectFilesList.forEach((neglectFile) => {
        if(fileName.substr(0, fileName.indexOf('.')) == neglectFile)
            return null;
    })
    

    var baseDirectory = outputBaseDirectory.replace(new RegExp('/', 'g'), '.');
    var className = fileName.substr(0, fileName.indexOf('.'));
    var modelObject = {
        headComment: headComment,
        package: 'package ' + baseDirectory + '.model;',
        imports: [
            'import javax.validation.constraints.Max;',
            'import javax.validation.constraints.Min;',
            'import javax.validation.constraints.NotNull;',
            'import javax.validation.constraints.Size;',
            'import com.fasterxml.jackson.annotation.JsonFormat;',
            'import com.fasterxml.jackson.annotation.JsonProperty;'
        ],
        validations: [
        	'@NotNull',
            '@Size(min=1, max=100)',
            '@Min(1)',
            '@Max(100)',
            '@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "IST")'
        ],
        lombok: ['@AllArgsConstructor', '@EqualsAndHashCode', '@Getter', '@NoArgsConstructor', '@Setter', '@ToString'],
        class: 'public class ' + className,
        attributes: [],
        RequestResponseConst: '',
        enums: []
    };

    var primitives = ['byte', 'short', 'char', 'character', 'int', 'Integer', 'long', 'float', 'double', 'string'];
    var lines = content.split('\n');

    var isEnumContent = false;
    var curlyCounter = 0;
    var enumObject = {
        name: '',
        objects: []
    };
    for (var i = 0; i < lines.length; i++) {
        if (lines[i].includes('public enum')) {
            isEnumContent = true;
            var baseIndexOfEnumName = lines[i].indexOf('enum ') + 'enum '.length;
            var endIndexOfEnumName = lines[i].indexOf(' ', baseIndexOfEnumName);
            enumObject.name = lines[i].substring(baseIndexOfEnumName, endIndexOfEnumName);
            if(enumObject.name.includes('Enum'))
                enumObject.name = enumObject.name.substring(0, enumObject.name.indexOf('Enum'));
        }

        if (lines[i].includes('{')) {
            curlyCounter++;
        }
        if (lines[i].includes('}')) {
            curlyCounter--;
        }
        if(curlyCounter > 0 && lines[i].includes('("')){
            enumObject.objects.push(lines[i].match(/[a-zA-Z]+/)[0]);
        }
        if (curlyCounter == 0) {
            modelObject.enums.push(enumObject);
            isEnumContent = false;
        }

        if (!isEnumContent) {
            if (lines[i].includes('private') && lines[i].includes(';')) {
                var baseIndexOfDataType = lines[i].indexOf('private ') + 'private '.length;
                var endIndexOfDataType = lines[i].indexOf(' ', baseIndexOfDataType);
                var baseIndexOfAttribute = endIndexOfDataType + 1; // adding 1 for space after dataType
                var endIndexOfAttribute = lines[i].indexOf(' ', baseIndexOfAttribute);
                var dataType = lines[i].substring(baseIndexOfDataType, endIndexOfDataType);
                var attributeName = lines[i].substring(baseIndexOfAttribute, endIndexOfAttribute);

                if (dataType == 'LocalDate') {
                    if (modelObject.imports.indexOf('import java.util.Date;') < 0)
                        modelObject.imports.push('import java.util.Date;');
                    dataType = 'Date';
                } else if (dataType.match(/[a-zA-Z]+/) == 'List' && (modelObject.imports.indexOf('import java.util.List;') < 0)) {
                    modelObject.imports.push('import java.util.List;');
                }

                if (fileName.includes('Request') && !fileName.includes('Info')) {
                    modelObject.package = 'package ' + baseDirectory + '.web.contract;';
                    var reqImport = 'import ' + baseDirectory + '.model.' + className.replace('Request', '') + ';';
                    if (modelObject.imports.indexOf(reqImport) < 0)
                        modelObject.imports.push(reqImport);
                } else if (fileName.includes('Response') && !fileName.includes('Info')) {
                    modelObject.package = 'package ' + baseDirectory + '.web.contract;';
                    var resImport = 'import ' + baseDirectory + '.model.' + className.replace('Response', '') + ';';
                    if (modelObject.imports.indexOf(resImport) < 0)
                        modelObject.imports.push(resImport);
                }

                var initAttribute = '';
                if (lines[i].includes('new')) {
                    initAttribute = ' ' + lines[i].substring(lines[i].indexOf('='), lines[i].indexOf(';'));

                    if (initAttribute.match(/[a-zA-Z]+/) == 'ArrayList' && (modelObject.imports.indexOf('import java.util.ArrayList;') < 0)) {
                        modelObject.imports.push('import java.util.ArrayList;');
                    }
                }

                modelObject.attributes.push({
                    name: attributeName + initAttribute,
                    type: dataType
                });
            }
        }
    }

    modelObject.attributes.push({
        name: 'tenantId',
        type: 'String'
    });

    if (fileName.includes('Request') && !fileName.includes('Info')) {
        modelObject.RequestResponseConst = getRequestConstructor(className.replace('Request', ''), modelObject.attributes);
    }

    modelObject.lombok.forEach((annotation) => {
        modelObject.imports.push('import lombok.' + annotation.substr(1) + ';');
    });

    modelObject.imports.sort();

    return modelObject;
}

module.exports = createModelObject;
