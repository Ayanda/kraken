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
public class CreateClientAccountResponse {
    
    private Long clientAccountNumber;

    public CreateClientAccountResponse(Long clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public Long getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(Long clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }
}
