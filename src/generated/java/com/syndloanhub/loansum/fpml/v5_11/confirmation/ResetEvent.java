//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
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
 * <p>Java class for ResetEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResetEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tradeReference" type="{http://www.fpml.org/FpML-5/confirmation}PartyTradeIdentifiers"/&gt;
 *         &lt;element name="legIdentifier" type="{http://www.fpml.org/FpML-5/confirmation}LegIdentifier" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="date" type="{http://www.fpml.org/FpML-5/confirmation}RequiredIdentifierDate"/&gt;
 *         &lt;element name="resetValue" type="{http://www.fpml.org/FpML-5/confirmation}IdentifiedRate"/&gt;
 *         &lt;element name="calculationDetails" type="{http://www.fpml.org/FpML-5/confirmation}ResetCalculationDetails" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResetEvent", propOrder = {
    "tradeReference",
    "legIdentifier",
    "date",
    "resetValue",
    "calculationDetails"
})
public class ResetEvent
    extends AbstractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected PartyTradeIdentifiers tradeReference;
    protected List<LegIdentifier> legIdentifier;
    @XmlElement(required = true)
    protected RequiredIdentifierDate date;
    @XmlElement(required = true)
    protected IdentifiedRate resetValue;
    protected ResetCalculationDetails calculationDetails;

    /**
     * Gets the value of the tradeReference property.
     * 
     * @return
     *     possible object is
     *     {@link PartyTradeIdentifiers }
     *     
     */
    public PartyTradeIdentifiers getTradeReference() {
        return tradeReference;
    }

    /**
     * Sets the value of the tradeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyTradeIdentifiers }
     *     
     */
    public void setTradeReference(PartyTradeIdentifiers value) {
        this.tradeReference = value;
    }

    /**
     * Gets the value of the legIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the legIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLegIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LegIdentifier }
     * 
     * 
     */
    public List<LegIdentifier> getLegIdentifier() {
        if (legIdentifier == null) {
            legIdentifier = new ArrayList<LegIdentifier>();
        }
        return this.legIdentifier;
    }

    /**
     * Gets the value of the date property.
     * 
     * @return
     *     possible object is
     *     {@link RequiredIdentifierDate }
     *     
     */
    public RequiredIdentifierDate getDate() {
        return date;
    }

    /**
     * Sets the value of the date property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredIdentifierDate }
     *     
     */
    public void setDate(RequiredIdentifierDate value) {
        this.date = value;
    }

    /**
     * Gets the value of the resetValue property.
     * 
     * @return
     *     possible object is
     *     {@link IdentifiedRate }
     *     
     */
    public IdentifiedRate getResetValue() {
        return resetValue;
    }

    /**
     * Sets the value of the resetValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentifiedRate }
     *     
     */
    public void setResetValue(IdentifiedRate value) {
        this.resetValue = value;
    }

    /**
     * Gets the value of the calculationDetails property.
     * 
     * @return
     *     possible object is
     *     {@link ResetCalculationDetails }
     *     
     */
    public ResetCalculationDetails getCalculationDetails() {
        return calculationDetails;
    }

    /**
     * Sets the value of the calculationDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResetCalculationDetails }
     *     
     */
    public void setCalculationDetails(ResetCalculationDetails value) {
        this.calculationDetails = value;
    }

}
