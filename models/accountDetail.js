var mongoose = require('mongoose');
var Schema = mongoose.Schema;

module.exports = mongoose.model('AccountDetail', new Schema({
   bankName: String,
   branchCode: Number,
   accountType: String,
   accountNo: String
}));