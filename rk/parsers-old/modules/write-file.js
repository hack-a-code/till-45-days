var onError = require('./errors-handler');

var writeFile = function (directory, fileName, dataToWrite) {
    //    console.log('Inside Write File');

    try {
        fs.writeFileSync(directory + '/' + fileName, dataToWrite, { flags: 'w' });
    } catch (error) {
        onError(error);
    }
}

module.exports = writeFile;
