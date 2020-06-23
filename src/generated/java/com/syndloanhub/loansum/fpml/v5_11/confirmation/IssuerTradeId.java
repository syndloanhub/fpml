//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A complex type for a two part identifier such as a USI.
 * 
 * <p>Java class for IssuerTradeId complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IssuerTradeId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}IssuerTradeId.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IssuerTradeId", propOrder = {
    "issuer",
    "tradeId"
})
public class IssuerTradeId implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected IssuerId issuer;
    @XmlElement(required = true)
    protected TradeId tradeId;

    /**
     * Gets the value of the issuer property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerId }
     *     
     */
    public IssuerId getIssuer() {
        return issuer;
    }

    /**
     * Sets the value of the issuer property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerId }
     *     
     */
    public void setIssuer(IssuerId value) {
        this.issuer = value;
    }

    /**
     * Gets the value of the tradeId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeId }
     *     
     */
    public TradeId getTradeId() {
        return tradeId;
    }

    /**
     * Sets the value of the tradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeId }
     *     
     */
    public void setTradeId(TradeId value) {
        this.tradeId = value;
    }

}
