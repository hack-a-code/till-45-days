const jwt = require('jsonwebtoken');
const config = require('./../config');

var verifyAuthReq = function (req, res, next) {
    // check headers or query parameters or post body for token
    var token = req.body.token || req.query.token || req.headers['x-access-token'];

    // decode token
    if (token) {
        // verifies secret and checks expiry
        jwt.verify(token, config.secret, function (err, decoded) {
            if (err) {
                return res.boom.unauthorized('invalid token');
            } else {
                // if everything is good, save to request for use in other routes
                req.decoded = decoded;
                next();
            }
        });
    } else {
        // if there is no token, return an error
        return res.boom.unauthorized('missing authentication token');
    }
}

module.exports.verifyAuthReq = verifyAuthReq;
