/**
 * Created by Ayanda on 2015/10/23.
 */
var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var Person = require('./person');
var BudgetCategory = require('./budgetCategory');

module.exports = mongoose.model('Profile', new Schema({
    audCreate: Date,
    person: {
           type: Schema.ObjectId,
           ref: 'Person'
    },
    budgetCategories: [{type: Schema.Types.ObjectId, ref: 'BudgetCategory'}]
}));