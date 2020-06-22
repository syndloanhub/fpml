//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure describing a novation.
 * 
 * <p>Java class for TradeNovationContent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TradeNovationContent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractEvent"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NewTrade.model"/&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}OldTrade.model"/&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FeeTrade.model" minOccurs="0"/&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NewTrade.model" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *           &lt;sequence&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}FeeTrade.model"/&gt;
 *             &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NewTrade.model" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NovationRoles.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NovationDates.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NovationAmounts.model"/&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}NovationTerms.model"/&gt;
 *         &lt;element name="payment" type="{http://www.fpml.org/FpML-5/confirmation}Payment" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeNovationContent", propOrder = {
    "rest"
})
public class TradeNovationContent
    extends AbstractEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "newTradeIdentifier", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "newTrade", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oldTradeIdentifier", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "oldTrade", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feeTradeIdentifier", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "feeTrade", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transferor", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transferorAccount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transferee", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "otherTransferee", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "transfereeAccount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "otherTransfereeAccount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingParty", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingPartyAccount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "otherRemainingParty", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "otherRemainingPartyAccount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novationDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "executionDateTime", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novationTradeDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novatedAmount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingAmount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novatedNumberOfOptions", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingNumberOfOptions", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novatedNumberOfUnits", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "remainingNumberOfUnits", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novationAmount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "fullFirstCalculationPeriod", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "firstPeriodStartDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "nonReliance", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "creditDerivativesNotices", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contractualDefinitions", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contractualTermsSupplement", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "payment", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "NewTradeIdentifier" is used by two different parts of a schema. See: 
     * line 1574 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-business-events-5-11.xsd
     * line 1574 of file:/C:/Users/jsiss/Documents/github/fpml/src/main/xsd/confirmation/fpml-business-events-5-11.xsd
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
     * {@link JAXBElement }{@code <}{@link PartyTradeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link Trade }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyTradeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link Trade }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyTradeIdentifier }{@code >}
     * {@link JAXBElement }{@code <}{@link Trade }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link PartyReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccountReference }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * {@link JAXBElement }{@code <}{@link ExecutionDateTime }{@code >}
     * {@link JAXBElement }{@code <}{@link LocalDate }{@code >}
     * {@link JAXBElement }{@code <}{@link Money }{@code >}
     * {@link JAXBElement }{@code <}{@link Money }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeLegSizeChange }{@code >}
     * {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * {@link JAXBElement }{@code <}{@link FirstPeriodStartDate }{@code >}
     * {@link JAXBElement }{@code <}{@link Empty }{@code >}
     * {@link JAXBElement }{@code <}{@link CreditDerivativesNotices }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractualDefinitions }{@code >}
     * {@link JAXBElement }{@code <}{@link ContractualTermsSupplement }{@code >}
     * {@link JAXBElement }{@code <}{@link Payment }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getRest() {
        if (rest == null) {
            rest = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.rest;
    }

}
