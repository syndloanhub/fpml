//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type that shows how multiple trades have been combined into a result.
 * 
 * <p>Java class for CompressionActivity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CompressionActivity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="compressionType" type="{http://www.fpml.org/FpML-5/confirmation}CompressionType" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="replacementTradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier" minOccurs="0"/&gt;
 *             &lt;element name="originatingTradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="replacementTradeId" type="{http://www.fpml.org/FpML-5/confirmation}TradeId" minOccurs="0"/&gt;
 *             &lt;element name="originatingTradeId" type="{http://www.fpml.org/FpML-5/confirmation}TradeId" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CompressionActivity", propOrder = {
    "compressionType",
    "replacementTradeIdentifier",
    "originatingTradeIdentifier",
    "replacementTradeId",
    "originatingTradeId"
})
public class CompressionActivity
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected CompressionType compressionType;
    protected TradeIdentifier replacementTradeIdentifier;
    protected List<TradeIdentifier> originatingTradeIdentifier;
    protected TradeId replacementTradeId;
    protected List<TradeId> originatingTradeId;

    /**
     * Gets the value of the compressionType property.
     * 
     * @return
     *     possible object is
     *     {@link CompressionType }
     *     
     */
    public CompressionType getCompressionType() {
        return compressionType;
    }

    /**
     * Sets the value of the compressionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompressionType }
     *     
     */
    public void setCompressionType(CompressionType value) {
        this.compressionType = value;
    }

    /**
     * Gets the value of the replacementTradeIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link TradeIdentifier }
     *     
     */
    public TradeIdentifier getReplacementTradeIdentifier() {
        return replacementTradeIdentifier;
    }

    /**
     * Sets the value of the replacementTradeIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeIdentifier }
     *     
     */
    public void setReplacementTradeIdentifier(TradeIdentifier value) {
        this.replacementTradeIdentifier = value;
    }

    /**
     * Gets the value of the originatingTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatingTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatingTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getOriginatingTradeIdentifier() {
        if (originatingTradeIdentifier == null) {
            originatingTradeIdentifier = new ArrayList<TradeIdentifier>();
        }
        return this.originatingTradeIdentifier;
    }

    /**
     * Gets the value of the replacementTradeId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeId }
     *     
     */
    public TradeId getReplacementTradeId() {
        return replacementTradeId;
    }

    /**
     * Sets the value of the replacementTradeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeId }
     *     
     */
    public void setReplacementTradeId(TradeId value) {
        this.replacementTradeId = value;
    }

    /**
     * Gets the value of the originatingTradeId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the originatingTradeId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOriginatingTradeId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeId }
     * 
     * 
     */
    public List<TradeId> getOriginatingTradeId() {
        if (originatingTradeId == null) {
            originatingTradeId = new ArrayList<TradeId>();
        }
        return this.originatingTradeId;
    }

}
