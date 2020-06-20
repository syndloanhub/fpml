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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A bundle of trades collected together into a single unit for reporting.
 * 
 * <p>Java class for TradePackage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradePackage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="packageHeader" type="{http://www.fpml.org/FpML-5/confirmation}PackageHeader" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="trade" type="{http://www.fpml.org/FpML-5/confirmation}Trade" maxOccurs="unbounded"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}TradeReferenceInformation.model" maxOccurs="unbounded"/&gt;
 *           &lt;element name="tradeIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}TradeIdentifier" maxOccurs="unbounded"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="approvals" type="{http://www.fpml.org/FpML-5/confirmation}Approvals" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradePackage", propOrder = {
    "packageHeader",
    "trade",
    "tradeReferenceInformationModel",
    "tradeIdentifier",
    "approvals"
})
public class TradePackage implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected PackageHeader packageHeader;
    protected List<Trade> trade;
    @XmlElement(name = "tradeReferenceInformation")
    protected List<TradeReferenceInformation> tradeReferenceInformationModel;
    protected List<TradeIdentifier> tradeIdentifier;
    protected Approvals approvals;

    /**
     * Gets the value of the packageHeader property.
     * 
     * @return
     *     possible object is
     *     {@link PackageHeader }
     *     
     */
    public PackageHeader getPackageHeader() {
        return packageHeader;
    }

    /**
     * Sets the value of the packageHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageHeader }
     *     
     */
    public void setPackageHeader(PackageHeader value) {
        this.packageHeader = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trade property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrade().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Trade }
     * 
     * 
     */
    public List<Trade> getTrade() {
        if (trade == null) {
            trade = new ArrayList<Trade>();
        }
        return this.trade;
    }

    /**
     * Gets the value of the tradeReferenceInformationModel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeReferenceInformationModel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeReferenceInformationModel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeReferenceInformation }
     * 
     * 
     */
    public List<TradeReferenceInformation> getTradeReferenceInformationModel() {
        if (tradeReferenceInformationModel == null) {
            tradeReferenceInformationModel = new ArrayList<TradeReferenceInformation>();
        }
        return this.tradeReferenceInformationModel;
    }

    /**
     * Gets the value of the tradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TradeIdentifier }
     * 
     * 
     */
    public List<TradeIdentifier> getTradeIdentifier() {
        if (tradeIdentifier == null) {
            tradeIdentifier = new ArrayList<TradeIdentifier>();
        }
        return this.tradeIdentifier;
    }

    /**
     * Gets the value of the approvals property.
     * 
     * @return
     *     possible object is
     *     {@link Approvals }
     *     
     */
    public Approvals getApprovals() {
        return approvals;
    }

    /**
     * Sets the value of the approvals property.
     * 
     * @param value
     *     allowed object is
     *     {@link Approvals }
     *     
     */
    public void setApprovals(Approvals value) {
        this.approvals = value;
    }

}
