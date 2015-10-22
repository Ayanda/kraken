var express = require('express');
var router = express.Router();

var Bear = require('../models/bear');

/* GET home page. */
router.get('/', function(req, res, next) {
  res.json({message: 'hooray! welcome to our api!'});
});

/* GET all bears. */
router.get('/bears', function(req, res) {
  Bear.find(function(err, bears){
    if(err)
        res.send(err);
    res.json(bears);
  });
});

/* GET a bear. */
router.get('/bears/:bearId', function(req, res) {
  console.log('Querying with string ' + req.params.bearId);
  Bear.findById(req.params.bearId, function(err, bear){
    if(err)
        res.send(err);
    res.json(bear);
  });
});

/* POST save a bear. */
router.post('/bears',function(req, res, next){
    var bear = new Bear();      // create a new instance of the Bear model
    bear.name = req.body.name;  // set the bears name (comes from the request)

    // save the bear and check for errors
    bear.save(function(err){
        if(err)
            res.send(err);
        res.json({message: 'Bear created!'});
    });
});

router.put('/bears/:bearId', function(req, res) {
  Bear.findById(req.params.bearId, function(err, bear){
    if(err)
        res.send(err);
    bear.name = req.body.name;  // update the bears info

    bear.save(function(err){
        if(err)
            res.send(err);
        res.json({message: 'Bear updated'});
    });
  });
});

router.delete('/bears/:bearId', function(req, res) {
  Bear.remove({ _id: req.params.bearId}, function(err, bear){
     if(err)
       res.send(err);
     res.json({message: 'Successfully deleted'});
  });
});

module.exports = router;
