var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var Expense = require('./expense');
var IncomeSource = require('./incomeSource');

module.exports = mongoose.model('Budget', new Schema({
    totalExpensesAmount: Number,
    totalIncomeAmount: Number,
    expenses: [{type: Schema.Types.ObjectId, ref: 'Expense'}],
    incomeSources: [{type: Schema.Types.ObjectId, ref: 'IncomeSource'}]
}, { collection: 'budget' }));