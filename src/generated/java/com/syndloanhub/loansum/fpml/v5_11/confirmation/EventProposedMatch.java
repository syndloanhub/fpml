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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * A structure that describes a proposed match between trades or post-trade event reports.
 * 
 * <p>Java class for EventProposedMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventProposedMatch"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}TradingEventsBase.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}PostTradeEventsBase.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}ChangeEventsBase.model"/&gt;
 *           &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}OptionsEventsBase.model"/&gt;
 *           &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}additionalEvent"/&gt;
 *         &lt;/choice&gt;
 *         &lt;group ref="{http://www.fpml.org/FpML-5/confirmation}ProposedMatch.model"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventProposedMatch", propOrder = {
    "content"
})
public class EventProposedMatch
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "tradePackage", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "originatingEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "trade", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "amendment", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "increase", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "terminatingEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "termination", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "novation", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "withdrawal", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "observation", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "reset", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "change", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optionExercise", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optionExpiry", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "optionEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "additionalEvent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matchId", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "difference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "matchScore", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Reset" is used by two different parts of a schema. See: 
     * line 1508 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-business-events-5-11.xsd
     * line 1506 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-business-events-5-11.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TradePackage }{@code >}
     * {@link JAXBElement }{@code <}{@link OriginatingEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link Trade }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeAmendmentContent }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeNotionalChange }{@code >}
     * {@link JAXBElement }{@code <}{@link TerminatingEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeNotionalChange }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeNovationContent }{@code >}
     * {@link JAXBElement }{@code <}{@link Withdrawal }{@code >}
     * {@link JAXBElement }{@code <}{@link ObservationEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link ResetEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeChangeContent }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionExercise }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionExpiry }{@code >}
     * {@link JAXBElement }{@code <}{@link OptionEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link AdditionalEvent }{@code >}
     * {@link JAXBElement }{@code <}{@link MatchId }{@code >}
     * {@link JAXBElement }{@code <}{@link TradeDifference }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}
