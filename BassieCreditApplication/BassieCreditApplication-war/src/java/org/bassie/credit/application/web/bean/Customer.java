/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.credit.application.web.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ayanda
 */
@ManagedBean
@RequestScoped
public class Customer {
    
    private Long clientAccountNumber;
    private long identityNo;
    private String cellPhoneNumber;
    private String underDebtCounseling;
    private String emailAddress;
    private Remuneration remuneration;
    private String firstName;
    private String lastName;
    

    public Customer(long identityNo, String cellPhoneNumber, String underDebtCounseling) {
        this.identityNo = identityNo;
        this.cellPhoneNumber = cellPhoneNumber;
        this.underDebtCounseling = underDebtCounseling;
    }
    
    /**
     * Creates a new instance of Customer
     */
    public Customer() {
    }

    public long getIdentityNo() {
        return identityNo;
    }

    public void setIdentityNo(long identityNo) {
        this.identityNo = identityNo;
    }

    public String getCellPhoneNumber() {
        return cellPhoneNumber;
    }

    public void setCellPhoneNumber(String cellPhoneNumber) {
        this.cellPhoneNumber = cellPhoneNumber;
    }

    public String getUnderDebtCounseling() {
        return underDebtCounseling;
    }

    public void setUnderDebtCounseling(String underDebtCounseling) {
        this.underDebtCounseling = underDebtCounseling;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public Remuneration getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(Remuneration remuneration) {
        this.remuneration = remuneration;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Long getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(Long clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }
   
    public String toStrin(){
        return "Customer";
    }
}
