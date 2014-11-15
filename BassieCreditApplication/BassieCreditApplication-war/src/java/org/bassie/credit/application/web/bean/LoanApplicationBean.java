/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.credit.application.web.bean;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import org.bassie.credit.application.web.mail.Notifications;
import org.bassie.credit.application.web.services.client.CreateClientAccountRequest;
import org.bassie.credit.application.web.services.client.CreateClientAccountServiceResponse;
import org.bassie.credit.application.web.services.client.CustomerServices;
import org.bassie.credit.application.web.services.client.CustomerServices_Service;
import org.bassie.credit.application.web.services.client.loanapproval.LoanApprovalRequest;
import org.bassie.credit.application.web.services.client.loanapproval.LoanApprovalServiceResponse;
import org.bassie.credit.application.web.services.client.loanapproval.LoanApprovalServices;
import org.bassie.credit.application.web.services.client.loanapproval.LoanApprovalServices_Service;

/**
 *
 * @author Ayanda
 */
@ManagedBean
@SessionScoped
public class LoanApplicationBean {

    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/LoanApprovalService/LoanApprovalServices.wsdl")
    private LoanApprovalServices_Service service_1;
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/CustomerService/CustomerServices.wsdl")
    private CustomerServices_Service service;

    private Application application;
    private String[] acceptedTerms;
    private String[] permissions;

    /**
     * Creates a new instance of LoanApplicationBean
     */
    public LoanApplicationBean() {
    }

    public void apply() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        CreateClientAccountRequest request = new CreateClientAccountRequest();
        CreateClientAccountServiceResponse response = createClientAccount(request);
        application.getCustomer().setClientAccountNumber(response.getClientAccountNumber());
        
        LoanApprovalRequest loanApprovalRequest = new LoanApprovalRequest();
        loanApprovalRequest.setClientAccountNo(application.getCustomer().getClientAccountNumber());
        loanApprovalRequest.setExpenses(application.getCustomer().getRemuneration().getExpenses());
        loanApprovalRequest.setIncome(application.getCustomer().getRemuneration().getSalary());
        loanApprovalRequest.setTerm(application.getTerm());
        loanApprovalRequest.setDebtFlag(application.getCustomer().getUnderDebtCounseling());
        LoanApprovalServiceResponse loanResponse = getLoanStatus(loanApprovalRequest);
        application.setApplicationId(loanResponse.getApplicationId());
        application.setStatus(loanResponse.getStatus());
        application.setRepayment(loanResponse.getRepayment());
        FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.APPROVE_PAGE);
    }

    public void acceptApplication() throws IOException {
        new Notifications().generateNotification(application);
        FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.HOME_PAGE);
    }

    public void startApplication() throws IOException {
        FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.APPLY_PAGE);
    }

    private CreateClientAccountServiceResponse createClientAccount(CreateClientAccountRequest createClientAccountRequest) {
        CustomerServices port = service.getCustomerServicesPort();
        return port.createClientAccount(createClientAccountRequest);
    }

    private LoanApprovalServiceResponse getLoanStatus(LoanApprovalRequest getLoanApprovalRequest) {
        LoanApprovalServices port = service_1.getLoanApprovalServicesPort();
        return port.getLoanStatus(getLoanApprovalRequest);
    }

    public void cancelApplication() throws IOException {
        acceptedTerms = new String[1];
        permissions = new String[1];
        application = new Application();
        application.setCustomer(new Customer());
        application.getCustomer().setRemuneration(new Remuneration());
        FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.HOME_PAGE);
    }

    public Application getApplication() {
        return application;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public String[] getAcceptedTerms() {
        return acceptedTerms;
    }

    public void setAcceptedTerms(String[] acceptedTerms) {
        this.acceptedTerms = acceptedTerms;
    }

    public String[] getPermissions() {
        return permissions;
    }

    public void setPermissions(String[] permissions) {
        this.permissions = permissions;
    }

    @PostConstruct
    public void init() {
        application = new Application();
        application.setCustomer(new Customer());
        application.getCustomer().setRemuneration(new Remuneration());
    }
}
