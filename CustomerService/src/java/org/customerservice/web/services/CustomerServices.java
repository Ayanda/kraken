/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.customerservice.web.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ayanda
 */
@WebService(serviceName = "CustomerServices")
public class CustomerServices {

    /**
     * This is a sample web service operation
     * @param txt
     * @return 
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     * @param createClientAccountRequest
     * @return 
     */
    @WebMethod(operationName = "createClientAccount")
    public CreateClientAccountServiceResponse createClientAccount(@WebParam(name = "createClientAccountRequest") CreateClientAccountRequest createClientAccountRequest) {
        CreateClientAccountServiceResponse response = new CreateClientAccountServiceResponse(858585858L);
        return response;
    }
}
