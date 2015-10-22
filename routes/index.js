var express = require('express');
var router = express.Router();
var User   = require('../models/user'); // get our mongoose model

/* GET home page. */
router.get('/setup', function(req, res, next) {

  // create a sample user
  var nick = new User({
    name: "Nick Cerminara",
    password: "password",
    admin: true
  });

  // save the sample user
  nick.save(function(err){
     if(err)
      res.send(err);
     res.json({success: true});
  });
});

/* GET home page. */
router.get('/', function(req, res, next) {
  res.send('Hello! The API is at http://localhost:300/api');
});

module.exports = router;
