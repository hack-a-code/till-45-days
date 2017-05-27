var onError = require('./errors-handler');
var writeFile = require('./write-file');

var createEnums = function (outputDirectory, modelObject) {
    //    console.log('Inside Create Enums');

    var enumData = '';
    try {
        enumData = fs.readFileSync('./resources/model/enums/Enums.java', 'utf8');
    } catch (error) {
        onError(error);
    }

    //    console.log('Total enums : ', modelObject.enums.length);
    //    console.log('Enums Are :\n', modelObject.enums);

    var enumObjects = '';
    modelObject.enums.forEach((e) => {
        for (var i = 0; i < e.objects.length; i++) {
            enumObjects = enumObjects + '' + e.objects[i] + '("' + e.objects[i] + '")';
            if (i < e.objects.length - 1)
                enumObjects = enumObjects + ', ';
            else
                enumObjects = enumObjects + ';';
        }
        enumData = enumData.replace(new RegExp('~~EnumName~~', 'g'), e.name);
        enumData = enumData.replace(new RegExp('~~!~~INSERT_ENUM_OBJECTS~~!~~', 'g'), enumObjects);

        writeFile(outputDirectory + '/model/enums', e.name + '.java', enumData);
    });
}

module.exports = createEnums;
