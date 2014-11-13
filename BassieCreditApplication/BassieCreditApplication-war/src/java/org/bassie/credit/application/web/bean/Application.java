/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.credit.application.web.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Ayanda
 */
@ManagedBean(name = "loanApplication")
@RequestScoped
public class Application {
    
    private ApplicationStatus status;
    private Customer customer;
    private double amount;
    private int term;

    /**
     * Creates a new instance of Application
     */
    public Application() {}

    public ApplicationStatus getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int term) {
        this.term = term;
    }
    
    @PostConstruct
    public void init() {
        customer = new Customer();
    }
}
