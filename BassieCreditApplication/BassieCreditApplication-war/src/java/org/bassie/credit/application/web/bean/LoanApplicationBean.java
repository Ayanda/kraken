/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.credit.application.web.bean;

import java.io.IOException;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Ayanda
 */
@ManagedBean
@RequestScoped
public class LoanApplicationBean {

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
        context.addMessage(null, new FacesMessage("Message", "Please give permission for a credit check."));
        //FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.APPLY_PAGE);
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

    public void startApplication() throws IOException {
        FacesContext context = FacesContext.getCurrentInstance();
        if (permissions.length <= 0) {
            context.addMessage(null, new FacesMessage("Message", "Please give permission for a credit check."));
            FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.START_PAGE);
        }
        if (acceptedTerms.length <= 0) {
            context.addMessage(null, new FacesMessage("Message", "Please accept our terms and conditions."));
            FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.START_PAGE);
        }
        FacesContext.getCurrentInstance().getExternalContext().redirect(LoanApplicationConstants.APPLY_PAGE);
    }

    @PostConstruct
    public void init() {
        application = new Application();
        application.setCustomer(new Customer());
        application.getCustomer().setRemuneration(new Remuneration());
    }

    public String cancelApplication() {
        return "success";
    }
}
