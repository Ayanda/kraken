var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var AccountDetail = require('./accountDetail');
var ExpenseCategory = require('./expenseCategory');

module.exports = mongoose.model('Expense', new Schema({
    description: String,
    amount: Number,
    paymentDetails: {
        type: Schema.ObjectId,
        ref: 'AccountDetail'
    },
    category: {
            type: Schema.ObjectId,
            ref: 'ExpenseCategory'
        }
}));