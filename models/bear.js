var mongoose = require('mongoose');
mongoose.connect('mongodb://localhost/bears');

var Schema = mongoose.Schema;

var BearSchema = new Schema({
    name: String
});

module.exports = mongoose.model('Bear', BearSchema);