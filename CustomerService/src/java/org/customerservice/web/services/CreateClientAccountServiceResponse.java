/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customerservice.web.services;

/**
 *
 * @author Ayanda
 */
public class CreateClientAccountServiceResponse {
    
    private Long clientAccountNumber;
    
    public CreateClientAccountServiceResponse(){}

    public CreateClientAccountServiceResponse(Long clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }

    public Long getClientAccountNumber() {
        return clientAccountNumber;
    }

    public void setClientAccountNumber(Long clientAccountNumber) {
        this.clientAccountNumber = clientAccountNumber;
    }
}
