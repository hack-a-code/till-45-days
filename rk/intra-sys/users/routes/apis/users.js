const express = require('express');
const router = express.Router();
const User = require('./../../models/user');
const Utils = require('./../../utils');
const filter = Utils.filter;

/* GET users */
router.get('/', function (req, res, next) {
    var userInfoFields = ['_id', 'salutation', 'firstName', 'lastName', 'email', 'username', 'userType'];
    var options = req.query || {};

    options.page = options.page ? +options.page : 1;
    options.limit = options.limit ? +options.limit : 10;
    options.select = options.select ? options.select.split(',') : {};
    options.sort = options.sort ? options.sort : { firstName : 1, lastname : 1 };

    // Use the User model to find all entities
    User.paginate({}, options, function (err, result) {
        if (err || !result) {
            Utils.onError(err);
            res.boom.badImplementation();
        }
        else {
            var d = {};
            d['users'] = result.docs;
            d['meta'] = filter.pick(result, ['total', 'limit', 'page', 'pages']);
            res.json(d);
        }
    });
});

router.get('/:id', function(req, res) {
    var id = req.params.id;

    User.findById(id, function(err, result) {
        if (err || !result) {
            Utils.onError(err);
            res.boom.badImplementation();
        }
        else {
            var d = {};
            d['users'] = filter.drop(result, ['hashedPassword']);
            res.json(d);
        }
    });
});

module.exports = router;
