const express = require('express');
const router = express.Router();
const User = require('./../../models/user');

/* Authenticate users */
router.post('/', function(req, res, next) {
    var user = req.body.user;

    if (!(user && user.username && user.password))
        res.boom.badRequest('Missing fields');

    User.authenticate(user.username, user.password, function(err, response) {
        if (err)
            res.status(403).json(err);
        else if (!response)
            res.boom.unauthorized();
        else {
            res.json(response);
        }
    });
});

module.exports = router;
