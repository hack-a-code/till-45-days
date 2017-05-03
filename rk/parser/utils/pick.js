var pick = function (passedObject, keys) {
    return keys.reduce((initObj, currKey) => {
        initObj[currKey] = passedObject[currKey];
        return initObj;
    }, {});
}

module.exports = pick;
