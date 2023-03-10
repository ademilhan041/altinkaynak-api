package com.acarsan.fx.altinkaynak.dto.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the wsclient package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AuthHeader_QNAME = new QName("http://data.altinkaynak.com/", "AuthHeader");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: wsclient
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AuthHeader }
     */
    public AuthHeader createAuthHeader() {
        return new AuthHeader();
    }

    /**
     * Create an instance of {@link GetMain }
     */
    public GetMain createGetMain() {
        return new GetMain();
    }

    /**
     * Create an instance of {@link GetGoldResponse }
     */
    public GetGoldResponse createGetGoldResponse() {
        return new GetGoldResponse();
    }

    /**
     * Create an instance of {@link GetParity }
     */
    public GetParity createGetParity() {
        return new GetParity();
    }

    /**
     * Create an instance of {@link GetParityResponse }
     */
    public GetParityResponse createGetParityResponse() {
        return new GetParityResponse();
    }

    /**
     * Create an instance of {@link GetCurrency }
     */
    public GetCurrency createGetCurrency() {
        return new GetCurrency();
    }

    /**
     * Create an instance of {@link GetMainResponse }
     */
    public GetMainResponse createGetMainResponse() {
        return new GetMainResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyResponse }
     */
    public GetCurrencyResponse createGetCurrencyResponse() {
        return new GetCurrencyResponse();
    }

    /**
     * Create an instance of {@link GetGold }
     */
    public GetGold createGetGold() {
        return new GetGold();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthHeader }{@code >}}
     */
    @XmlElementDecl(namespace = "http://data.altinkaynak.com/", name = "AuthHeader")
    public JAXBElement<AuthHeader> createAuthHeader(AuthHeader value) {
        return new JAXBElement<AuthHeader>(_AuthHeader_QNAME, AuthHeader.class, null, value);
    }
}
