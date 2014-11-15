
package org.bassie.credit.application.web.services.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.bassie.credit.application.web.services.client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CreateClientAccountResponse_QNAME = new QName("http://services.web.customerservice.org/", "createClientAccountResponse");
    private final static QName _Hello_QNAME = new QName("http://services.web.customerservice.org/", "hello");
    private final static QName _CreateClientAccount_QNAME = new QName("http://services.web.customerservice.org/", "createClientAccount");
    private final static QName _HelloResponse_QNAME = new QName("http://services.web.customerservice.org/", "helloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bassie.credit.application.web.services.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CreateClientAccount }
     * 
     */
    public CreateClientAccount createCreateClientAccount() {
        return new CreateClientAccount();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link CreateClientAccountResponse }
     * 
     */
    public CreateClientAccountResponse createCreateClientAccountResponse() {
        return new CreateClientAccountResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CreateClientAccountServiceResponse }
     * 
     */
    public CreateClientAccountServiceResponse createCreateClientAccountServiceResponse() {
        return new CreateClientAccountServiceResponse();
    }

    /**
     * Create an instance of {@link CreateClientAccountRequest }
     * 
     */
    public CreateClientAccountRequest createCreateClientAccountRequest() {
        return new CreateClientAccountRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientAccountResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.customerservice.org/", name = "createClientAccountResponse")
    public JAXBElement<CreateClientAccountResponse> createCreateClientAccountResponse(CreateClientAccountResponse value) {
        return new JAXBElement<CreateClientAccountResponse>(_CreateClientAccountResponse_QNAME, CreateClientAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.customerservice.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateClientAccount }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.customerservice.org/", name = "createClientAccount")
    public JAXBElement<CreateClientAccount> createCreateClientAccount(CreateClientAccount value) {
        return new JAXBElement<CreateClientAccount>(_CreateClientAccount_QNAME, CreateClientAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.customerservice.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

}
