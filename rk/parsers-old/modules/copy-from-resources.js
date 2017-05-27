var onError = require('./errors-handler');

var copyFromResources = function (projectDirectory, outputDirectory) {

    fs.createReadStream('./resources/resources/application.properties')
        .pipe(fs.createWriteStream(projectDirectory.replace('java', 'resources') + '/application.properties', { flags: 'w' }));

    fs.createReadStream('./resources/resources/config/application-config.properties')
        .pipe(fs.createWriteStream(projectDirectory.replace('java', 'resources') + '/config/application-config.properties', { flags: 'w' }));
}

module.exports = copyFromResources;
