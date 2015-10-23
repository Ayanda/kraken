/**
 * Created by Ayanda on 2015/10/22.
 */
var mongoose = require('mongoose');
var Schema = mongoose.Schema;

var Profile = require('./profile')

module.exports = mongoose.model('User', new Schema({
    username: String,
    password: String,
    email: String,
    admin: Boolean,
    profiles: [{ type: Schema.Types.ObjectId, ref: 'Profile' }]
}));