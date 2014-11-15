
package org.loanapproval.web.services.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.loanapproval.web.services.LoanApprovalServiceResponse;

@XmlRootElement(name = "getLoanStatusResponse", namespace = "http://services.web.loanapproval.org/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoanStatusResponse", namespace = "http://services.web.loanapproval.org/")
public class GetLoanStatusResponse {

    @XmlElement(name = "return", namespace = "")
    private LoanApprovalServiceResponse _return;

    /**
     * 
     * @return
     *     returns LoanApprovalServiceResponse
     */
    public LoanApprovalServiceResponse getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(LoanApprovalServiceResponse _return) {
        this._return = _return;
    }

}
