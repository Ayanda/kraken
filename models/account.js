var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var AccountDetail = require('./accountDetail');

module.exports = mongoose.model('Account', new Schema({
   name: String,
   description: String,
   bankingDetails: {type: Schema.Types.ObjectId, ref: 'AccountDetail'}
}));