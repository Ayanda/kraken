
package org.bassie.credit.application.web.services.client.loanapproval;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.bassie.credit.application.web.services.client.loanapproval package. 
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

    private final static QName _HelloResponse_QNAME = new QName("http://services.web.loanapproval.org/", "helloResponse");
    private final static QName _GetLoanStatus_QNAME = new QName("http://services.web.loanapproval.org/", "getLoanStatus");
    private final static QName _GetLoanStatusResponse_QNAME = new QName("http://services.web.loanapproval.org/", "getLoanStatusResponse");
    private final static QName _Hello_QNAME = new QName("http://services.web.loanapproval.org/", "hello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.bassie.credit.application.web.services.client.loanapproval
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetLoanStatus }
     * 
     */
    public GetLoanStatus createGetLoanStatus() {
        return new GetLoanStatus();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link GetLoanStatusResponse }
     * 
     */
    public GetLoanStatusResponse createGetLoanStatusResponse() {
        return new GetLoanStatusResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link LoanApprovalServiceResponse }
     * 
     */
    public LoanApprovalServiceResponse createLoanApprovalServiceResponse() {
        return new LoanApprovalServiceResponse();
    }

    /**
     * Create an instance of {@link LoanApprovalRequest }
     * 
     */
    public LoanApprovalRequest createLoanApprovalRequest() {
        return new LoanApprovalRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.loanapproval.org/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.loanapproval.org/", name = "getLoanStatus")
    public JAXBElement<GetLoanStatus> createGetLoanStatus(GetLoanStatus value) {
        return new JAXBElement<GetLoanStatus>(_GetLoanStatus_QNAME, GetLoanStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetLoanStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.loanapproval.org/", name = "getLoanStatusResponse")
    public JAXBElement<GetLoanStatusResponse> createGetLoanStatusResponse(GetLoanStatusResponse value) {
        return new JAXBElement<GetLoanStatusResponse>(_GetLoanStatusResponse_QNAME, GetLoanStatusResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://services.web.loanapproval.org/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

}
