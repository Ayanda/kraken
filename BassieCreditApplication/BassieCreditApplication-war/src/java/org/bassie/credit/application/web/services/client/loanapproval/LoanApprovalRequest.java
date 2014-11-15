
package org.bassie.credit.application.web.services.client.loanapproval;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for loanApprovalRequest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="loanApprovalRequest">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="clientAccountNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="debtFlag" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="expenses" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="income" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="term" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loanApprovalRequest", propOrder = {
    "clientAccountNo",
    "debtFlag",
    "expenses",
    "income",
    "term"
})
public class LoanApprovalRequest {

    protected long clientAccountNo;
    protected String debtFlag;
    protected double expenses;
    protected double income;
    protected int term;

    /**
     * Gets the value of the clientAccountNo property.
     * 
     */
    public long getClientAccountNo() {
        return clientAccountNo;
    }

    /**
     * Sets the value of the clientAccountNo property.
     * 
     */
    public void setClientAccountNo(long value) {
        this.clientAccountNo = value;
    }

    /**
     * Gets the value of the debtFlag property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebtFlag() {
        return debtFlag;
    }

    /**
     * Sets the value of the debtFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebtFlag(String value) {
        this.debtFlag = value;
    }

    /**
     * Gets the value of the expenses property.
     * 
     */
    public double getExpenses() {
        return expenses;
    }

    /**
     * Sets the value of the expenses property.
     * 
     */
    public void setExpenses(double value) {
        this.expenses = value;
    }

    /**
     * Gets the value of the income property.
     * 
     */
    public double getIncome() {
        return income;
    }

    /**
     * Sets the value of the income property.
     * 
     */
    public void setIncome(double value) {
        this.income = value;
    }

    /**
     * Gets the value of the term property.
     * 
     */
    public int getTerm() {
        return term;
    }

    /**
     * Sets the value of the term property.
     * 
     */
    public void setTerm(int value) {
        this.term = value;
    }

}
