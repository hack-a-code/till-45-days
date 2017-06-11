var parseDate = function(dateString) {
    return new Date(dateString.substr(6, 4), dateString.substr(3, 2) - 1, dateString.substr(0, 2));
};

module.exports = parseDate;
