/**
 * Created by Ayanda on 2015/10/22.
 */
var express = require('express');
var router = express.Router();
var jwt = require('jsonwebtoken');

var User = require('../models/user');

/* GET home page. */
router.get('/setup', function (req, res, next) {
    var ayanda = new User({
        username: 'developer',
        password: 'password',
        email: 'developer@gmail.com',
        admin: false
    });

    ayanda.save(function (err) {
        if (err)
            res.send(err);
        res.json({success: true});
    });
});

/* GET home page. */
router.post('/', function (req, res, next) {
    User.findOne({username: req.body.username}, function (err, user) {

        if (err) {
            res.send(err);
        }

        if (!user) {
            res.status(401).json({
                success: false,
                message: 'Authentication failed. User not found.'
            });
        } else if (user) {
            if (user.password != req.body.password) {
                res.status(401).json({message: 'Authentication failed. Wrong password.'});
            } else {

                // if user is found and password is right
                // create a token
                var token = jwt.sign(user, 'superSecret', {
                    expiresInMinutes: 1440
                });

                res.cookie('x-access-token',{token: token}).status(200).json({
                    success: true,
                    message: 'Enjoy your token!',
                    token: token
                });
            }
        }
    });

});

module.exports = router;


