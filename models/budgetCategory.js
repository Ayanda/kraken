var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var Budget = require('./budget');

module.exports = mongoose.model('BudgetCategory', new Schema({
      description: String,
      budgets: [{type: Schema.Types.ObjectId, ref: 'Budget'}]
    }, {collection: 'budget-categories'
}));