/**
 * Created by Ayanda on 2015/10/22.
 */
var express = require('express');
var router = express.Router();
var jwt = require('jsonwebtoken');

var AccountDetail = require('../models/accountDetail');
var Account = require('../models/account');
var ExpenseCategory = require('../models/expenseCategory');
var Expense = require('../models/expense');
var IncomeSource = require('../models/incomeSource');
var Budget = require('../models/budget');
var BudgetCategory = require('../models/budgetCategory');
var Person = require('../models/person');
var Profile = require('../models/profile');
var User = require('../models/user');

/* GET home page. */
router.get('/setup', function (req, res, next) {

   var fnbAccountDetail = new AccountDetail({
      bankName: 'First National Bank',
      branchCode: 2355689,
      accountType: 'Current Account',
      accountNo: '62222222222222'
   });

    var fnbAccount = new Account({
      name: 'Primary Account',
      description: 'FNB primary account',
      bankingDetails: fnbAccountDetail
    });

    var nedbankAccountDetail = new AccountDetail({
       bankName: 'Nedbank',
       branchCode: 2355689,
       accountType: 'Current Account',
       accountNo: '235562222222'
    });

    var nedbankAccount = new Account({
       name: 'Secondary Account',
       description: 'Secondary cheap account',
       bankingDetails: nedbankAccountDetail
    });

    var person = new Person({
        firstName: 'Thandake',
        lastName: 'Msane',
        email: 'thandeka@gmail.com',
        accounts: [fnbAccount, nedbankAccount]
    });

    var expenseCategory = new ExpenseCategory({
       description: 'Personal Loan'
    });

    var fnbLoan = new Expense({
       description: 'FNB personal loan',
       amount: 150000,
       category: expenseCategory,
       paymentDetails : fnbAccountDetail
    });

    var nedbankLoan = new Expense({
        description: 'Nedbank personal loan',
        amount: 150000,
        category: expenseCategory,
        paymentDetails: nedbankAccountDetail
    });

    var salary = new IncomeSource({
      description: 'Main Salary',
      amount: 2000
    });

    var weddBudget = new Budget({
       totalExpensesAmount: 5000,
       totalIncomeAmount: 100000,
       expenses: [fnbLoan, nedbankLoan],
       incomeSources: [salary]
    });

    var profileCategory = new BudgetCategory({
      description: '2014',
      budgets: [weddBudget]
    });

    var profile = new Profile({
        person : person,
        budgetCategories: [profileCategory]
    });

    var ayanda = new User({
        username: 'thandeka',
        password: 'password',
        email: 'thandeka@gmail.com',
        admin: false,
        profiles: [profile]
    });

    ayanda.save(function (err) {
        if (err) res.send(err);
        profile.save(function(err){
            if (err) res.send(err);
            person.save(function(err){
                if (err) res.send(err);
                fnbAccount.save(function(err){
                  if (err) res.send(err);
                });
            });
            profileCategory.save(function(err){
                            if (err) res.send(err);
                            weddBudget.save(function(err){
                               if (err) res.send(err);
                               salary.save(function(err){
                                  if (err) res.send(err);
                               });
                               fnbLoan.save(function(err){
                                 if (err) res.send(err);
                                 expenseCategory.save(function(err){
                                     if (err) res.send(err);
                                 });
                               });
                               nedbankLoan.save(function(err){
                                 if (err) res.send(err);
                               });
                            });
                        });
        });
        res.json({success: true});
    });
});

/* GET home page. */
router.post('/', function (req, res, next) {
    User.findOne({username: req.body.username}, function (err, user) {

        if (err) {
            res.send(err);
        }

        if (!user) {
            res.status(401).json({
                success: false,
                message: 'Authentication failed. User not found.'
            });
        } else if (user) {
            if (user.password != req.body.password) {
                res.status(401).json({message: 'Authentication failed. Wrong password.'});
            } else {

                // if user is found and password is right
                // create a token
                var token = jwt.sign(user, 'superSecret', {
                    expiresInMinutes: 1440
                });

                res.cookie('x-access-token',{token: token}).status(200).json({
                    success: true,
                    message: 'Enjoy your token!',
                    token: token
                });
            }
        }
    });

});

module.exports = router;


