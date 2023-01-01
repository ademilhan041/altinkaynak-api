package com.acarsan.fx.altinkaynak.dto.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "DataServiceSoap", targetNamespace = "http://data.altinkaynak.com/")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface DataServiceSoap {


    /**
     * Anlık döviz kuru bilgileri
     *
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetCurrency", action = "http://data.altinkaynak.com/GetCurrency")
    @WebResult(name = "GetCurrencyResult", targetNamespace = "http://data.altinkaynak.com/")
    @RequestWrapper(localName = "GetCurrency", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetCurrency")
    @ResponseWrapper(localName = "GetCurrencyResponse", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetCurrencyResponse")
    String getCurrency();

    /**
     * Anlık altın kuru bilgileri
     *
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetGold", action = "http://data.altinkaynak.com/GetGold")
    @WebResult(name = "GetGoldResult", targetNamespace = "http://data.altinkaynak.com/")
    @RequestWrapper(localName = "GetGold", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetGold")
    @ResponseWrapper(localName = "GetGoldResponse", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetGoldResponse")
    String getGold();

    /**
     * Anlık seçilmiş doviz kuru altın kuru ve parite bilgileri
     *
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetMain", action = "http://data.altinkaynak.com/GetMain")
    @WebResult(name = "GetMainResult", targetNamespace = "http://data.altinkaynak.com/")
    @RequestWrapper(localName = "GetMain", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetMain")
    @ResponseWrapper(localName = "GetMainResponse", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetMainResponse")
    String getMain();

    /**
     * Anlık parite bilgileri
     *
     * @return returns java.lang.String
     */
    @WebMethod(operationName = "GetParity", action = "http://data.altinkaynak.com/GetParity")
    @WebResult(name = "GetParityResult", targetNamespace = "http://data.altinkaynak.com/")
    @RequestWrapper(localName = "GetParity", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetParity")
    @ResponseWrapper(localName = "GetParityResponse", targetNamespace = "http://data.altinkaynak.com/", className = "wsclient.GetParityResponse")
    String getParity();
}