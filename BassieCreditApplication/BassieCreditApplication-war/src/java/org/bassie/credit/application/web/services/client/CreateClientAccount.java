
package org.bassie.credit.application.web.services.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createClientAccount complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createClientAccount">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="createClientAccountRequest" type="{http://services.web.customerservice.org/}createClientAccountRequest" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createClientAccount", propOrder = {
    "createClientAccountRequest"
})
public class CreateClientAccount {

    protected CreateClientAccountRequest createClientAccountRequest;

    /**
     * Gets the value of the createClientAccountRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CreateClientAccountRequest }
     *     
     */
    public CreateClientAccountRequest getCreateClientAccountRequest() {
        return createClientAccountRequest;
    }

    /**
     * Sets the value of the createClientAccountRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CreateClientAccountRequest }
     *     
     */
    public void setCreateClientAccountRequest(CreateClientAccountRequest value) {
        this.createClientAccountRequest = value;
    }

}
