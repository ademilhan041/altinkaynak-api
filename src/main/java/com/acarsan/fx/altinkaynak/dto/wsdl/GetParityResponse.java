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
 *         &lt;element name="GetParityResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getParityResult"
})
@XmlRootElement(name = "GetParityResponse")
public class GetParityResponse {

    @XmlElement(name = "GetParityResult")
    protected String getParityResult;

    /**
     * Gets the value of the getParityResult property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetParityResult() {
        return getParityResult;
    }

    /**
     * Sets the value of the getParityResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetParityResult(String value) {
        this.getParityResult = value;
    }
}
