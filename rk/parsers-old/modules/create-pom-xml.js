var onError = require('./errors-handler');
var writeFile = require('./write-file');

var createPomXML = function (projectDirectory, projectName) {
    //    console.log('Inside Create Pom XML');

    var pomXMLData = '';
    try {
        pomXMLData = fs.readFileSync('./resources/pom.xml', 'utf8');
    } catch (error) {
        onError(error);
    }

    pomXMLData = pomXMLData.replace(new RegExp('<name></name>', 'g'), '<name>' + projectName + '</name>');
    pomXMLData = pomXMLData.replace(new RegExp('<artifactId></artifactId>', 'g'), '<artifactId>' + projectName + '</artifactId>');

    writeFile(projectDirectory.replace('/src/main/java', ''), 'pom.xml', pomXMLData);
}

module.exports = createPomXML;
