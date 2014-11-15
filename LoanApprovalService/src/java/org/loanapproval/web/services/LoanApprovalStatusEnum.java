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
public enum LoanApprovalStatusEnum {
    
    ACCEPTED("ACCEPTED"),
    REJECTED("REJECTED");
    
    LoanApprovalStatusEnum(String value){
        this.value = value;
    }
    
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
