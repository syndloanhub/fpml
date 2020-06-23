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
 * A type that supports the division of a gross settlement amount into a number of split settlements, each requiring its own settlement instruction.
 * 
 * <p>Java class for SplitSettlement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SplitSettlement"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="splitSettlementAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/&gt;
 *         &lt;element name="beneficiaryBank" type="{http://www.fpml.org/FpML-5/confirmation}Routing" minOccurs="0"/&gt;
 *         &lt;element name="beneficiary" type="{http://www.fpml.org/FpML-5/confirmation}Routing"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SplitSettlement", propOrder = {
    "splitSettlementAmount",
    "beneficiaryBank",
    "beneficiary"
})
public class SplitSettlement
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected Money splitSettlementAmount;
    protected Routing beneficiaryBank;
    @XmlElement(required = true)
    protected Routing beneficiary;

    /**
     * Gets the value of the splitSettlementAmount property.
     * 
     * @return
     *     possible object is
     *     {@link Money }
     *     
     */
    public Money getSplitSettlementAmount() {
        return splitSettlementAmount;
    }

    /**
     * Sets the value of the splitSettlementAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Money }
     *     
     */
    public void setSplitSettlementAmount(Money value) {
        this.splitSettlementAmount = value;
    }

    /**
     * Gets the value of the beneficiaryBank property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getBeneficiaryBank() {
        return beneficiaryBank;
    }

    /**
     * Sets the value of the beneficiaryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setBeneficiaryBank(Routing value) {
        this.beneficiaryBank = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link Routing }
     *     
     */
    public Routing getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Routing }
     *     
     */
    public void setBeneficiary(Routing value) {
        this.beneficiary = value;
    }

}
