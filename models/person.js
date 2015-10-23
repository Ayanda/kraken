var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var Account = require('./account');

module.exports = mongoose.model('Person', new Schema({
    firstName: String,
    lastName: String,
    email: String,
    accounts: [{type: Schema.Types.ObjectId, ref: 'Account'}]
}, { collection: 'person' }));