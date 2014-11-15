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
public class LoanApprovalServiceResponse {
    
    private long applicationId;
    private double repayment;
    private String status;

    public LoanApprovalServiceResponse(long applicationId, double repayment, String status) {
        this.applicationId = applicationId;
        this.repayment = repayment;
        this.status = status;
    }

    public LoanApprovalServiceResponse() {
        
    }

    public long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(long applicationId) {
        this.applicationId = applicationId;
    }

    public double getRepayment() {
        return repayment;
    }

    public void setRepayment(double repayment) {
        this.repayment = repayment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
