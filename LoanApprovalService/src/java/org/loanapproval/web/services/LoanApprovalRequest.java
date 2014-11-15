/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.loanapproval.web.services;

/**
 *
 * @author Ayanda
 */
public class LoanApprovalRequest {
    
    private String debtFlag;
    private double income;
    private double expenses;
    private long clientAccountNo;
    private int term;
    
    public LoanApprovalRequest() {
    }

    public LoanApprovalRequest(String debtFlag, double income, double expenses, long clientAccountNo) {
        this.debtFlag = debtFlag;
        this.income = income;
        this.expenses = expenses;
        this.clientAccountNo = clientAccountNo;
    }

    public String getDebtFlag() {
        return debtFlag;
    }

    public void setDebtFlag(String debtFlag) {
        this.debtFlag = debtFlag;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }

    public long getClientAccountNo() {
        return clientAccountNo;
    }

    public void setClientAccountNo(long clientAccountNo) {
        this.clientAccountNo = clientAccountNo;
    }
    
    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
}
