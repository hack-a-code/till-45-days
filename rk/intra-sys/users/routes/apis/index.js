const express = require('express');
const router = express.Router();

const jwtAuthVerify = require('./../../middlewares/jwt-auth-verify');
const verifyAuthReq = jwtAuthVerify.verifyAuthReq;
const users = require('./users');


// API home
router.get('/', function (req, res, next) {
    res.send('API home');
});

router.use(verifyAuthReq);

router.use('/users', users);

module.exports = router;
