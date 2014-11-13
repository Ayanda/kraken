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
public class ApplicationStatus {

    private int statusCode;
    /**
     * Creates a new instance of ApplicationStatus
     */
    public ApplicationStatus() {
    }

    public ApplicationStatus(int statusCode) {
        this.statusCode = statusCode;
    }
    
    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
}
