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
 *         &lt;element name="GetGoldResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "getGoldResult"
})
@XmlRootElement(name = "GetGoldResponse")
public class GetGoldResponse {

    @XmlElement(name = "GetGoldResult")
    protected String getGoldResult;

    /**
     * Gets the value of the getGoldResult property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGetGoldResult() {
        return getGoldResult;
    }

    /**
     * Sets the value of the getGoldResult property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGetGoldResult(String value) {
        this.getGoldResult = value;
    }
}
