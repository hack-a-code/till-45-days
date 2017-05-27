var onError = require('./errors-handler');

var createDirectories = function (projectDirectory, outputBaseDirectory) {
    //    console.log('Inside Create Directories');

    var baseDirectory = projectDirectory + '/' + outputBaseDirectory;
    var resourcesDirectory = projectDirectory.replace('java', 'resources');

    var resourcesConfig = resourcesDirectory + '/' + 'config';
    var resourcesSQL = resourcesDirectory + '/' + 'sql';
    var org = projectDirectory + '/' + outputBaseDirectory.split('/')[0];
    var egov = projectDirectory + '/' + outputBaseDirectory.split('/')[0] + '/' + outputBaseDirectory.split('/')[1];
    var eis = projectDirectory + '/' + outputBaseDirectory;
    var config = baseDirectory + '/config';
    var model = baseDirectory + '/model';
    var modelEnums = baseDirectory + '/model/enums';
    var repository = baseDirectory + '/repository';
    var repositoryBuilder = baseDirectory + '/repository/builder';
    var repositoryRowmapper = baseDirectory + '/repository/rowmapper';
    var service = baseDirectory + '/service';
    var web = baseDirectory + '/web';
    var webContract = baseDirectory + '/web/contract';
    var webContractFactory = baseDirectory + '/web/contract/factory';
    var webContractWrapper = baseDirectory + '/web/contract/wrapper';
    var webController = baseDirectory + '/web/controller';
    var webErrorhandlers = baseDirectory + '/web/errorhandlers';

    var directoriesArray = [resourcesConfig, resourcesSQL, org, egov, eis, config, model, modelEnums, repository, repositoryBuilder, repositoryRowmapper, service, web, webContract, webContractFactory, webContractWrapper, webController, webErrorhandlers];

    var dirCtr = 1;
    directoriesArray.forEach((directory) => {
        //    console.log('directory ', dirCtr++, ': ', directory);
        try {
            if (!fs.existsSync(directory))
                fs.mkdirSync(directory);
        } catch (error) {
            onError(error);
        }
    });
}

module.exports = createDirectories;
