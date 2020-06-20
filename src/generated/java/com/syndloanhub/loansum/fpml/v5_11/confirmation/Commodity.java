//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A type describing a commodity underlying asset.
 * 
 * <p>Java class for Commodity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Commodity"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}IdentifiedAsset"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityProduct.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Commodity", propOrder = {
    "commodityBase",
    "commodityDetails",
    "unit",
    "currency",
    "exchangeId",
    "publication",
    "specifiedPrice",
    "deliveryDates",
    "deliveryNearby",
    "deliveryDate",
    "deliveryDateYearMonth",
    "deliveryDateRollConvention",
    "deliveryDateExpirationConvention",
    "multiplier"
})
public class Commodity
    extends IdentifiedAsset
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected CommodityBase commodityBase;
    protected CommodityDetails commodityDetails;
    protected QuantityUnit unit;
    protected Currency currency;
    protected ExchangeId exchangeId;
    protected CommodityInformationSource publication;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected SpecifiedPriceEnum specifiedPrice;
    @XmlSchemaType(name = "token")
    protected DeliveryDatesEnum deliveryDates;
    protected DeliveryNearby deliveryNearby;
    protected AdjustableDate deliveryDate;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar deliveryDateYearMonth;
    protected Offset deliveryDateRollConvention;
    protected Offset deliveryDateExpirationConvention;
    protected BigDecimal multiplier;

    /**
     * Gets the value of the commodityBase property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityBase }
     *     
     */
    public CommodityBase getCommodityBase() {
        return commodityBase;
    }

    /**
     * Sets the value of the commodityBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityBase }
     *     
     */
    public void setCommodityBase(CommodityBase value) {
        this.commodityBase = value;
    }

    /**
     * Gets the value of the commodityDetails property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityDetails }
     *     
     */
    public CommodityDetails getCommodityDetails() {
        return commodityDetails;
    }

    /**
     * Sets the value of the commodityDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityDetails }
     *     
     */
    public void setCommodityDetails(CommodityDetails value) {
        this.commodityDetails = value;
    }

    /**
     * Gets the value of the unit property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityUnit }
     *     
     */
    public QuantityUnit getUnit() {
        return unit;
    }

    /**
     * Sets the value of the unit property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityUnit }
     *     
     */
    public void setUnit(QuantityUnit value) {
        this.unit = value;
    }

    /**
     * Gets the value of the currency property.
     * 
     * @return
     *     possible object is
     *     {@link Currency }
     *     
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Currency }
     *     
     */
    public void setCurrency(Currency value) {
        this.currency = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the publication property.
     * 
     * @return
     *     possible object is
     *     {@link CommodityInformationSource }
     *     
     */
    public CommodityInformationSource getPublication() {
        return publication;
    }

    /**
     * Sets the value of the publication property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommodityInformationSource }
     *     
     */
    public void setPublication(CommodityInformationSource value) {
        this.publication = value;
    }

    /**
     * Gets the value of the specifiedPrice property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPriceEnum }
     *     
     */
    public SpecifiedPriceEnum getSpecifiedPrice() {
        return specifiedPrice;
    }

    /**
     * Sets the value of the specifiedPrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPriceEnum }
     *     
     */
    public void setSpecifiedPrice(SpecifiedPriceEnum value) {
        this.specifiedPrice = value;
    }

    /**
     * Gets the value of the deliveryDates property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryDatesEnum }
     *     
     */
    public DeliveryDatesEnum getDeliveryDates() {
        return deliveryDates;
    }

    /**
     * Sets the value of the deliveryDates property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryDatesEnum }
     *     
     */
    public void setDeliveryDates(DeliveryDatesEnum value) {
        this.deliveryDates = value;
    }

    /**
     * Gets the value of the deliveryNearby property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryNearby }
     *     
     */
    public DeliveryNearby getDeliveryNearby() {
        return deliveryNearby;
    }

    /**
     * Sets the value of the deliveryNearby property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryNearby }
     *     
     */
    public void setDeliveryNearby(DeliveryNearby value) {
        this.deliveryNearby = value;
    }

    /**
     * Gets the value of the deliveryDate property.
     * 
     * @return
     *     possible object is
     *     {@link AdjustableDate }
     *     
     */
    public AdjustableDate getDeliveryDate() {
        return deliveryDate;
    }

    /**
     * Sets the value of the deliveryDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdjustableDate }
     *     
     */
    public void setDeliveryDate(AdjustableDate value) {
        this.deliveryDate = value;
    }

    /**
     * Gets the value of the deliveryDateYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDeliveryDateYearMonth() {
        return deliveryDateYearMonth;
    }

    /**
     * Sets the value of the deliveryDateYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDeliveryDateYearMonth(XMLGregorianCalendar value) {
        this.deliveryDateYearMonth = value;
    }

    /**
     * Gets the value of the deliveryDateRollConvention property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getDeliveryDateRollConvention() {
        return deliveryDateRollConvention;
    }

    /**
     * Sets the value of the deliveryDateRollConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setDeliveryDateRollConvention(Offset value) {
        this.deliveryDateRollConvention = value;
    }

    /**
     * Gets the value of the deliveryDateExpirationConvention property.
     * 
     * @return
     *     possible object is
     *     {@link Offset }
     *     
     */
    public Offset getDeliveryDateExpirationConvention() {
        return deliveryDateExpirationConvention;
    }

    /**
     * Sets the value of the deliveryDateExpirationConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link Offset }
     *     
     */
    public void setDeliveryDateExpirationConvention(Offset value) {
        this.deliveryDateExpirationConvention = value;
    }

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

}
