//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a commodity option product type. The product support for financially-settled exercises or exercise into physical forward contracts written on precious and non-precious metals. options in FpML is based on the creation of a 'commodityOption' product. The product references the 'commodity' underlyer in order to support the underlying asset of the option.
 * 
 * <p>Java class for CommodityOption complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CommodityOption"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Product"&gt;
 *       &lt;sequence&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}BuyerSeller.model"/&gt;
 *         &lt;element name="optionType" type="{http://www.fpml.org/FpML-5/confirmation}PutCallEnum"/&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityFinancialOption.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityPhysicalOption.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityWeatherOption.model"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element name="premium" type="{http://www.fpml.org/FpML-5/confirmation}CommodityPremium" maxOccurs="unbounded"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}CommodityContent.model" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommodityOption", propOrder = {
    "rest"
})
public class CommodityOption
    extends Product
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "buyerPartyReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "buyerAccountReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sellerPartyReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sellerAccountReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optionType", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commodity", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "effectiveDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "terminationDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "calculationPeriodsSchedule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "calculationPeriods", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pricingDates", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "averagingMethod", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "barrier", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notionalQuantitySchedule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "notionalQuantity", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "settlementPeriodsNotionalQuantity", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "totalNotionalQuantity", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "quantityReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "exercise", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strikePricePerUnit", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "strikePricePerUnitSchedule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floatingStrikePricePerUnit", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floatingStrikePricePerUnitSchedule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commoditySwap", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commodityForward", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "physicalExercise", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weatherCalculationPeriods", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weatherCalculationPeriodsReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weatherNotionalAmount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weatherIndexStrikeLevel", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "calculation", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "weatherIndexData", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "premium", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "commonPricing", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "marketDisruption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "settlementDisruption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rounding", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Barrier" is used by two different parts of a schema. See: 
     * line 4201 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-com-5-11.xsd
     * line 4195 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-com-5-11.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the rest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PutCallEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link Commodity }{@code >}
     * {@link JAXBElement }{@code <}{@link AdjustableOrRelativeDate }{@code >}
     * {@link JAXBElement }{@code <}{@link AdjustableOrRelativeDate }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityCalculationPeriodsSchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link AdjustableDates }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityPricingDates }{@code >}
     * {@link JAXBElement }{@code <}{@link AveragingMethodEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityBarrier }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityNotionalQuantitySchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityNotionalQuantity }{@code >}
     * {@link JAXBElement }{@code <}{@link CommoditySettlementPeriodsNotionalQuantity }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link QuantityReference }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityExercise }{@code >}
     * {@link JAXBElement }{@code <}{@link NonNegativeMoney }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityStrikeSchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingStrikePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityCalculationPeriodsSchedule }{@code >}
     * {@link JAXBElement }{@code <}{@link CommoditySwap }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityForward }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityPhysicalExercise }{@code >}
     * {@link JAXBElement }{@code <}{@link WeatherCalculationPeriods }{@code >}
     * {@link JAXBElement }{@code <}{@link CalculationPeriodsReference }{@code >}
     * {@link JAXBElement }{@code <}{@link NonNegativeMoney }{@code >}
     * {@link JAXBElement }{@code <}{@link WeatherIndex }{@code >}
     * {@link JAXBElement }{@code <}{@link WeatherLegCalculation }{@code >}
     * {@link JAXBElement }{@code <}{@link WeatherIndexData }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityPremium }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityMarketDisruption }{@code >}
     * {@link JAXBElement }{@code <}{@link CommodityBullionSettlementDisruptionEnum }{@code >}
     * {@link JAXBElement }{@code <}{@link Rounding }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<?>>();
        }
        return this.rest;
    }

}
