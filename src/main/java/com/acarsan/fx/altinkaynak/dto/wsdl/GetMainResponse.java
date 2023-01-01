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
 *         &lt;element name="GetMainResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getMainResult"
})
@XmlRootElement(name = "GetMainResponse")
public class GetMainResponse {

    @XmlElement(name = "GetMainResult")
    protected String getMainResult;

    /**
     * Gets the value of the getMainResult property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetMainResult() {
        return getMainResult;
    }

    /**
     * Sets the value of the getMainResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetMainResult(String value) {
        this.getMainResult = value;
    }
}
