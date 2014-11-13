/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.web.home.affairs.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ayanda
 */
@WebService(serviceName = "HomeAffairsService")
public class HomeAffairsService {

    /**
     * Web service operation
     * @param createClientAccountRequest
     * @return 
     */
    @WebMethod(operationName = "createClientAccount")
    public CreateClientAccountResponse createClientAccount(@WebParam(name = "createClientAccountRequest") CreateClientAccountRequest createClientAccountRequest) {
        CreateClientAccountResponse response = new CreateClientAccountResponse(8585858585L);
        return response;
    }
}
