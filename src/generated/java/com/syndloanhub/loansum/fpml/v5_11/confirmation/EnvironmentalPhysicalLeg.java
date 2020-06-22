//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvironmentalPhysicalLeg complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvironmentalPhysicalLeg"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PhysicalSwapLeg"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="numberOfAllowances" type="{http://www.fpml.org/FpML-5/confirmation}UnitQuantity"/&gt;
 *         &lt;element name="environmental" type="{http://www.fpml.org/FpML-5/confirmation}EnvironmentalProduct"/&gt;
 *         &lt;element name="abandonmentOfScheme" type="{http://www.fpml.org/FpML-5/confirmation}EnvironmentalAbandonmentOfSchemeEnum" minOccurs="0"/&gt;
 *         &lt;element name="deliveryDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate"/&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/confirmation}DateOffset"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BusinessCentersOrReference.model" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;element name="failureToDeliverApplicable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="eEPParameters" type="{http://www.fpml.org/FpML-5/confirmation}EEPParameters" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvironmentalPhysicalLeg", propOrder = {
    "numberOfAllowances",
    "environmental",
    "abandonmentOfScheme",
    "deliveryDate",
    "paymentDate",
    "businessCentersReference",
    "businessCenters",
    "failureToDeliverApplicable",
    "eepParameters"
})
public class EnvironmentalPhysicalLeg
    extends PhysicalSwapLeg
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    protected UnitQuantity numberOfAllowances;
    @XmlElement(required = true)
    protected EnvironmentalProduct environmental;
    @XmlSchemaType(name = "token")
    protected EnvironmentalAbandonmentOfSchemeEnum abandonmentOfScheme;
    @XmlElement(required = true)
    protected AdjustableOrRelativeDate deliveryDate;
    @XmlElement(required = true)
    protected DateOffset paymentDate;
    protected BusinessCentersReference businessCentersReference;
    protected BusinessCenters businessCenters;
    protected Boolean failureToDeliverApplicable;
    @XmlElement(name = "eEPParameters")
    protected EEPParameters eepParameters;

    /**
     * Gets the value of the numberOfAllowances property.
     * 
     * @return
     *     possible object is
     *     {@link UnitQuantity }
     *     
     */
    public UnitQuantity getNumberOfAllowances() {
        return numberOfAllowances;
    }

    /**
     * Sets the value of the numberOfAllowances property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitQuantity }
     *     
     */
    public void setNumberOfAllowances(UnitQuantity value) {
        this.numberOfAllowances = value;
    }

    /**
     * Gets the value of the environmental property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalProduct }
     *     
     */
    public EnvironmentalProduct getEnvironmental() {
        return environmental;
    }

    /**
     * Sets the value of the environmental property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalProduct }
     *     
     */
    public void setEnvironmental(EnvironmentalProduct value) {
        this.environmental = value;
    }

    /**
     * Gets the value of the abandonmentOfScheme property.
     * 
     * @return
     *     possible object is
     *     {@link EnvironmentalAbandonmentOfSchemeEnum }
     *     
     */
    public EnvironmentalAbandonmentOfSchemeEnum getAbandonmentOfScheme() {
        return abandonmentOfScheme;
    }

    /**
     * Sets the value of the abandonmentOfScheme property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvironmentalAbandonmentOfSchemeEnum }
     *     
     */
    public void setAbandonmentOfScheme(EnvironmentalAbandonmentOfSchemeEnum value) {
        this.abandonmentOfScheme = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public AdjustableOrRelativeDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableOrRelativeDate }
     *     
     */
    public void setDeliveryDate(AdjustableOrRelativeDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link DateOffset }
     *     
     */
    public DateOffset getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOffset }
     *     
     */
    public void setPaymentDate(DateOffset value) {
        this.paymentDate = value;
    }

    /**
     * Gets the value of the businessCentersReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCentersReference }
     *     
     */
    public BusinessCentersReference getBusinessCentersReference() {
        return businessCentersReference;
    }

    /**
     * Sets the value of the businessCentersReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCentersReference }
     *     
     */
    public void setBusinessCentersReference(BusinessCentersReference value) {
        this.businessCentersReference = value;
    }

    /**
     * Gets the value of the businessCenters property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenters }
     *     
     */
    public BusinessCenters getBusinessCenters() {
        return businessCenters;
    }

    /**
     * Sets the value of the businessCenters property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenters }
     *     
     */
    public void setBusinessCenters(BusinessCenters value) {
        this.businessCenters = value;
    }

    /**
     * Gets the value of the failureToDeliverApplicable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFailureToDeliverApplicable() {
        return failureToDeliverApplicable;
    }

    /**
     * Sets the value of the failureToDeliverApplicable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFailureToDeliverApplicable(Boolean value) {
        this.failureToDeliverApplicable = value;
    }

    /**
     * Gets the value of the eepParameters property.
     * 
     * @return
     *     possible object is
     *     {@link EEPParameters }
     *     
     */
    public EEPParameters getEEPParameters() {
        return eepParameters;
    }

    /**
     * Sets the value of the eepParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link EEPParameters }
     *     
     */
    public void setEEPParameters(EEPParameters value) {
        this.eepParameters = value;
    }

}
