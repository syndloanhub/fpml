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
 * A schedule that incorporates all sub-periods of an accrual calculation for the purposes of determining the cost of carry in the case of a trade with delayed settlement.
 * 
 * <p>Java class for LoanTradingCostOfCarryAccrual complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoanTradingCostOfCarryAccrual"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="utilizationPeriod" type="{http://www.fpml.org/FpML-5/confirmation}UtilizationPeriod" maxOccurs="unbounded"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="commencementAccrual" type="{http://www.fpml.org/FpML-5/confirmation}AccrualPeriod"/&gt;
 *           &lt;element name="settlementPeriodAccrual" type="{http://www.fpml.org/FpML-5/confirmation}AccrualPeriod" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "LoanTradingCostOfCarryAccrual", propOrder = {
    "utilizationPeriod",
    "commencementAccrual",
    "settlementPeriodAccrual"
})
public class LoanTradingCostOfCarryAccrual
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected List<UtilizationPeriod> utilizationPeriod;
    protected AccrualPeriod commencementAccrual;
    protected List<AccrualPeriod> settlementPeriodAccrual;

    /**
     * Gets the value of the utilizationPeriod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the utilizationPeriod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUtilizationPeriod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UtilizationPeriod }
     * 
     * 
     */
    public List<UtilizationPeriod> getUtilizationPeriod() {
        if (utilizationPeriod == null) {
            utilizationPeriod = new ArrayList<UtilizationPeriod>();
        }
        return this.utilizationPeriod;
    }

    /**
     * Gets the value of the commencementAccrual property.
     * 
     * @return
     *     possible object is
     *     {@link AccrualPeriod }
     *     
     */
    public AccrualPeriod getCommencementAccrual() {
        return commencementAccrual;
    }

    /**
     * Sets the value of the commencementAccrual property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccrualPeriod }
     *     
     */
    public void setCommencementAccrual(AccrualPeriod value) {
        this.commencementAccrual = value;
    }

    /**
     * Gets the value of the settlementPeriodAccrual property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the settlementPeriodAccrual property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSettlementPeriodAccrual().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccrualPeriod }
     * 
     * 
     */
    public List<AccrualPeriod> getSettlementPeriodAccrual() {
        if (settlementPeriodAccrual == null) {
            settlementPeriodAccrual = new ArrayList<AccrualPeriod>();
        }
        return this.settlementPeriodAccrual;
    }

}
