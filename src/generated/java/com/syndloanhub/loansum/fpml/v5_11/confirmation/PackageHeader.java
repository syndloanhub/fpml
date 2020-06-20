//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identifying information for a tradePackage (a bundle of trades).
 * 
 * <p>Java class for PackageHeader complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PackageHeader"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}IssuerTradeId" minOccurs="0"/&gt;
 *         &lt;element name="orderIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}OrderIdentifier" minOccurs="0"/&gt;
 *         &lt;element name="packageType" type="{http://www.fpml.org/FpML-5/confirmation}PackageType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="size" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="originatingEvent" type="{http://www.fpml.org/FpML-5/confirmation}OriginatingEvent" minOccurs="0"/&gt;
 *         &lt;element name="packageInformation" type="{http://www.fpml.org/FpML-5/confirmation}PackageInformation" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageHeader", propOrder = {
    "packageIdentifier",
    "orderIdentifier",
    "packageType",
    "size",
    "originatingEvent",
    "packageInformation"
})
public class PackageHeader
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected IssuerTradeId packageIdentifier;
    protected OrderIdentifier orderIdentifier;
    protected List<PackageType> packageType;
    protected BigDecimal size;
    protected OriginatingEvent originatingEvent;
    protected PackageInformation packageInformation;

    /**
     * Gets the value of the packageIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link IssuerTradeId }
     *     
     */
    public IssuerTradeId getPackageIdentifier() {
        return packageIdentifier;
    }

    /**
     * Sets the value of the packageIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link IssuerTradeId }
     *     
     */
    public void setPackageIdentifier(IssuerTradeId value) {
        this.packageIdentifier = value;
    }

    /**
     * Gets the value of the orderIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link OrderIdentifier }
     *     
     */
    public OrderIdentifier getOrderIdentifier() {
        return orderIdentifier;
    }

    /**
     * Sets the value of the orderIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderIdentifier }
     *     
     */
    public void setOrderIdentifier(OrderIdentifier value) {
        this.orderIdentifier = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageType }
     * 
     * 
     */
    public List<PackageType> getPackageType() {
        if (packageType == null) {
            packageType = new ArrayList<PackageType>();
        }
        return this.packageType;
    }

    /**
     * Gets the value of the size property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSize() {
        return size;
    }

    /**
     * Sets the value of the size property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSize(BigDecimal value) {
        this.size = value;
    }

    /**
     * Gets the value of the originatingEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OriginatingEvent }
     *     
     */
    public OriginatingEvent getOriginatingEvent() {
        return originatingEvent;
    }

    /**
     * Sets the value of the originatingEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginatingEvent }
     *     
     */
    public void setOriginatingEvent(OriginatingEvent value) {
        this.originatingEvent = value;
    }

    /**
     * Gets the value of the packageInformation property.
     * 
     * @return
     *     possible object is
     *     {@link PackageInformation }
     *     
     */
    public PackageInformation getPackageInformation() {
        return packageInformation;
    }

    /**
     * Sets the value of the packageInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageInformation }
     *     
     */
    public void setPackageInformation(PackageInformation value) {
        this.packageInformation = value;
    }

}
