/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.web.home.affairs.services;

/**
 *
 * @author Ayanda
 */
public class CreateClientAccountRequest {
    
    private long IdNumber;
    private long contactNumber;
    private String firstName;
    private String lastName;
    private String emailAddress;

    public CreateClientAccountRequest(long IdNumber, long contactNumber, String firstName, String lastName, String emailAddress) {
        this.IdNumber = IdNumber;
        this.contactNumber = contactNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
    }

    public long getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(long IdNumber) {
        this.IdNumber = IdNumber;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
