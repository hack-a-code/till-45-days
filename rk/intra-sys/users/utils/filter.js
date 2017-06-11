/**
* Function Module which takes an object[src] and an Array[keys]
* and returns a new object with / without the keys specified in the Array[keys]
*
* @param src
* @param keys
* @returns {*}
*/
var filter = {
    pick: function(src, keys) {
        return keys.reduce((init, curr) => {
            init[curr] = src[curr];
            return init;
        }, {});
    }
};

module.exports = filter;
