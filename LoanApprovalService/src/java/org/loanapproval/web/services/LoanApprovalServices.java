/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.loanapproval.web.services;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Ayanda
 */
@WebService(serviceName = "LoanApprovalServices")
public class LoanApprovalServices {

    private static final String NO = "No";
    private static final double ALLOWEDPERCENT = 20.0;
    
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
     * @param getLoanApprovalRequest
     * @return 
     */
    @WebMethod(operationName = "getLoanStatus")
    public LoanApprovalServiceResponse getLoanStatus(@WebParam(name = "getLoanApprovalRequest") LoanApprovalRequest getLoanApprovalRequest) {
        LoanApprovalServiceResponse response = new LoanApprovalServiceResponse();
        response.setApplicationId(4444444444L);
        if(getLoanApprovalRequest.getDebtFlag().equalsIgnoreCase(NO) && clientQualifies(getLoanApprovalRequest)){
            response.setStatus(LoanApprovalStatusEnum.ACCEPTED.getValue());
            double disposableIncome = getLoanApprovalRequest.getIncome() - getLoanApprovalRequest.getExpenses();
            double repayment = disposableIncome / getLoanApprovalRequest.getTerm();
            response.setRepayment(repayment);
        }else{
            response.setStatus(LoanApprovalStatusEnum.REJECTED.getValue());
        }
        return response;
    }

    private boolean clientQualifies(LoanApprovalRequest loanApprovalRequest) {
        boolean qualifies = false;
        double disposableIncome = loanApprovalRequest.getIncome() - loanApprovalRequest.getExpenses();
        double income = ((loanApprovalRequest.getIncome() * 100) / ALLOWEDPERCENT);
        if(disposableIncome > income){
            qualifies = true;
        }
        return qualifies;
    }
        
}
