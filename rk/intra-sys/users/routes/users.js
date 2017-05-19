const express = require('express');
const router = express.Router();
const User = require('./../models/users');
const pick = require('./../utils/pick');

/* GET users */
router.get('/', function (req, res, next) {
    var userInfoFields = ['_id', 'salutation', 'firstName', 'lastName', 'email', 'username', 'userType'];
    var options = req.query || {};

    options.page = options.page ? +options.page : 1;
    options.limit = options.limit ? +options.limit : 10;
    options.select = options.select ? options.select : {};
    options.sort = options.sort ? options.sort : { firstName : 1, lastname : 1 };

    // Use the User model to find all entities
    User.paginate({}, options, function (err, result) {
        if (!err) {
            var d = {};
            d['users'] = result.docs;
            d['meta'] = pick(result, ['total', 'limit', 'page', 'pages']);
            res.json(d);
        }
        else {
            console.error(err);
            res.boom.badImplementation();
        }
    });
});

/* Save (post) users */
router.post('/', function(req, res, next) {
    var user = req.body.user;

    if (user && user.username && user.firstName && user.email && user.password)
    nick.save(function(err) {
        if (err) {
            console.log('error: ', err);
        }

        console.log('User saved successfully');
        res.json({
            success: true
        });
    });
});

router.get('/users', function(req, res) {
    User.find({}, function(err, users) {
        res.json(users);
    });
});

module.exports = router;
