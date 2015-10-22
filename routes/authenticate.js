var express = require('express');
var router = express.Router();
var jwt = require('jsonwebtoken');
var User  = require('../models/user'); // get our mongoose model

/* GET home page. */
router.get('/', function(req, res, next) {
  res.send('Security goes hear');
});

router.post('/', function(req, res){
console.log('Name : ' + req.body.name);
    User.findOne({name: req.body.name}, function(err, user){
      if(err) res.send(err);

      if(!user){
        res.json({
            success: false,
            message: 'Authentication failed. User not found.'
        });
      }else if(user){
        console.log('Password : ' + req.body.password + 'for user ' + user._id);
        if(user.password != req.body.password){
            res.json({ success: false, message: 'Authentication failed. Wrong password.' });
        }else{
                 // if user is found and password is right create a token
                 console.log('Creating user token');
                 var token = jwt.sign(user, 'supersecret', {
                     expiresInMinutes: 1440 // expires in 24 hours
                 });

                 res.json({
                     success: true,
                     message: 'Enjoy your token!',
                     token: token
                 });
               }
      }
    });
});

module.exports = router;