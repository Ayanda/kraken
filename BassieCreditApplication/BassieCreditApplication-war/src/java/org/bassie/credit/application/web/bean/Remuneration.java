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
public class Remuneration {
    
    private double salary;
    private double expenses;

    /**
     * Creates a new instance of Remuneration
     */
    public Remuneration(double salary, double expenses) {
        this.salary = salary;
        this.expenses = expenses;
    }
    
    /**
     * Creates a new instance of Remuneration
     */
    public Remuneration() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getExpenses() {
        return expenses;
    }

    public void setExpenses(double expenses) {
        this.expenses = expenses;
    }
}
