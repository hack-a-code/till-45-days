const express = require('express');
const router = express.Router();
const User = require('./../models/users');

/* Authenticate users */
router.post('/authenticate', function(req, res, next) {
    var user = req.body.user;

    if (!(user && (user.username || user.email) && user.password))
        res.boom.badRequest('Missing fields');
});

module.exports = router;
