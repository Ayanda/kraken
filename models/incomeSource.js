var mongoose = require('mongoose');
var Schema = mongoose.Schema;

module.exports = mongoose.model('IncomeSource', new Schema({
    description: String,
    amount: Number
}, { collection: 'income-source' }));