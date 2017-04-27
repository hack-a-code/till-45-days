var express = require('express');
var router = express.Router();
var User = require('./../models/users');
var pick = require('./../utils/pick');

/* GET users listing. */

var userInfoFields = ['_id', 'salutation', 'firstname', 'lastname', 'email', 'username', 'userType'];

router.get('/', function (req, res, next) {
    var options = req.query || {};

    options.page = options.page ? +options.page : 1;
    options.limit = options.limit ? +options.limit : 10;
    options.select = options.select ? options.select : userInfoFields.join(' ');
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

router.get('/userInfo', function (req, res, next) {
    var options = req.query || {};

    options.page = options.page ? +options.page : 1;
    options.limit = options.limit ? +options.limit : 10;
    options.select = options.select ? options.select : userInfoFields.join(' ');
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

/* GET users listing. */
router.get('/', function(req, res, next) {
    // create a sample user
    var nick = new User({
        firstName: 'Nick',
        lastName: 'Cerminara',
        password: 'password',
        dob: new Date('01/06/1964'),
        email: 'rk@gmail.com',
        mobileNo: 9999999999,
        username: 'nclwf',
        password: 'a.b.c'
    });

    // save the sample user
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
