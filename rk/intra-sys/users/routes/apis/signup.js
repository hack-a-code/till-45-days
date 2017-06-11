var express = require('express');
var User = require('./../../models/user');
var Utils = require('./../../utils');
var router = express.Router();

router.post('/', function(req, res, next) {
    var user = req.body.user;

    if (!(user && user.firstName && user.password && user.email && user.dob && user.mobileNo)) {
        var requiredFields = ['firstname', 'password', 'email', 'dob', 'mobileNo'];
        var errorFields = Utils.missingFields(user, requiredFields);
        res.boom.badRequest('Missing fields : ' + errorFields);
    }

    User.validate(user, function(errorField) {
        if (errorField) {
            res.boom.conflict(errorField);
        } else {
            User.register(user, function(err, user) {
                if (err)
                    res.status(500).json(err);
                else if (!user)
                    res.boom.badRequest();
                else
                    res.status(201).json({user: user});
            });
        }
    });
});

module.exports = router;
