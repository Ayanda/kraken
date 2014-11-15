
package org.bassie.credit.application.web.services.client.loanapproval;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for getLoanStatus complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="getLoanStatus">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="getLoanApprovalRequest" type="{http://services.web.loanapproval.org/}loanApprovalRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getLoanStatus", propOrder = {
    "getLoanApprovalRequest"
})
public class GetLoanStatus {

    protected LoanApprovalRequest getLoanApprovalRequest;

    /**
     * Gets the value of the getLoanApprovalRequest property.
     * 
     * @return
     *     possible object is
     *     {@link LoanApprovalRequest }
     *     
     */
    public LoanApprovalRequest getGetLoanApprovalRequest() {
        return getLoanApprovalRequest;
    }

    /**
     * Sets the value of the getLoanApprovalRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link LoanApprovalRequest }
     *     
     */
    public void setGetLoanApprovalRequest(LoanApprovalRequest value) {
        this.getLoanApprovalRequest = value;
    }

}
