var initCaps = require('./../utility/initCaps');

var createModelData = function (modelObject, fileName) {
    //    console.log('Inside Create Model Data');

    var imports = '';
    for(var i = 0; i < modelObject.imports.length; i++) {
        var importSignature = modelObject.imports[i].substr(0, modelObject.imports[i].indexOf('.'));
        var previousImportSignature = '';
        if(i != 0)
            previousImportSignature = modelObject.imports[i - 1].substr(0, modelObject.imports[i].indexOf('.'));
        if(importSignature != previousImportSignature)
            imports += '\n';
        imports += modelObject.imports[i] + '\n';
    }
    var annotations = '';
    modelObject.lombok.forEach((annotation) => {
        annotations += annotation + '\n';
    });
    var validations = '';
    modelObject.validations.forEach((validation) => {
        validations += '\n\t' + validation;
    });
    var attributes = '';
    modelObject.attributes.forEach((attribute) => {
        if(attribute.name == 'id' || attribute.name == 'code' || attribute.name == 'tenantId')
            attributes += '\n\t' + '@NotNull';
        if(attribute.type == 'Date')
            attributes += '\n\t' + '@JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss", timezone = "IST")';
        if (fileName.includes('Response') || fileName.includes('Request$'))
            attributes += '\n\t' + '@JsonProperty("' + initCaps(attribute.name) + '")';
        attributes += '\n\t' + 'private ' + attribute.type + ' ' + attribute.name + ';' + '\n';
    });

    var modelFileData = modelObject.headComment +
        '\n' + modelObject.package + '\n' + imports +
        '\n' + annotations + modelObject.class + ' {' +
        '\n\n' + validations +
        '\n' + attributes + ((modelObject.RequestResponseConst != '') ? '\n' + modelObject.RequestResponseConst : '') +
        '\n' +'}';

    return modelFileData;
}

module.exports = createModelData;