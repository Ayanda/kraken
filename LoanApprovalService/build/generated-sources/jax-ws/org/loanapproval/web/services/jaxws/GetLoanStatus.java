
package org.loanapproval.web.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.loanapproval.web.services.LoanApprovalRequest;

@XmlRootElement(name = "getLoanStatus", namespace = "http://services.web.loanapproval.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoanStatus", namespace = "http://services.web.loanapproval.org/")
public class GetLoanStatus {

    @XmlElement(name = "getLoanApprovalRequest", namespace = "")
    private LoanApprovalRequest getLoanApprovalRequest;

    /**
     * 
     * @return
     *     returns LoanApprovalRequest
     */
    public LoanApprovalRequest getGetLoanApprovalRequest() {
        return this.getLoanApprovalRequest;
    }

    /**
     * 
     * @param getLoanApprovalRequest
     *     the value for the getLoanApprovalRequest property
     */
    public void setGetLoanApprovalRequest(LoanApprovalRequest getLoanApprovalRequest) {
        this.getLoanApprovalRequest = getLoanApprovalRequest;
    }

}
