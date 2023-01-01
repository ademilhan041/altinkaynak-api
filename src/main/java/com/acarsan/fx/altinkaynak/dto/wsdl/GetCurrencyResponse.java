package com.acarsan.fx.altinkaynak.dto.wsdl;

import javax.xml.bind.annotation.*;

/**
 * <p>Java class for anonymous complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GetCurrencyResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getCurrencyResult"
})
@XmlRootElement(name = "GetCurrencyResponse")
public class GetCurrencyResponse {

    @XmlElement(name = "GetCurrencyResult")
    protected String getCurrencyResult;

    /**
     * Gets the value of the getCurrencyResult property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetCurrencyResult() {
        return getCurrencyResult;
    }

    /**
     * Sets the value of the getCurrencyResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetCurrencyResult(String value) {
        this.getCurrencyResult = value;
    }
}
