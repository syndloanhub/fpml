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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * An event describing a change to an accrual option associated with a specific facility.
 * 
 * <p>Java class for AccrualOptionChangeEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccrualOptionChangeEvent"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}AbstractFacilityEvent"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;choice&gt;
 *             &lt;element name="fixedRateOption" type="{http://www.fpml.org/FpML-5/confirmation}FixedRateOption"/&gt;
 *             &lt;element name="floatingRateOption" type="{http://www.fpml.org/FpML-5/confirmation}FloatingRateOption"/&gt;
 *           &lt;/choice&gt;
 *           &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanContractReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="accruingPikOption" type="{http://www.fpml.org/FpML-5/confirmation}AccruingPikOption"/&gt;
 *           &lt;element name="loanContractReference" type="{http://www.fpml.org/FpML-5/confirmation}LoanContractReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="lcOption" type="{http://www.fpml.org/FpML-5/confirmation}LcOption"/&gt;
 *           &lt;element name="letterOfCreditReference" type="{http://www.fpml.org/FpML-5/confirmation}LetterOfCreditReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccrualOptionChangeEvent", propOrder = {
    "rest"
})
public class AccrualOptionChangeEvent
    extends AbstractFacilityEvent
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "fixedRateOption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "floatingRateOption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "loanContractReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "accruingPikOption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lcOption", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "letterOfCreditReference", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "LoanContractReference" is used by two different parts of a schema. See: 
     * line 566 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-loan-5-11.xsd
     * line 554 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-loan-5-11.xsd
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
     * {@link JAXBElement }{@code <}{@link FixedRateOption }{@code >}
     * {@link JAXBElement }{@code <}{@link FloatingRateOption }{@code >}
     * {@link JAXBElement }{@code <}{@link LoanContractReference }{@code >}
     * {@link JAXBElement }{@code <}{@link AccruingPikOption }{@code >}
     * {@link JAXBElement }{@code <}{@link LcOption }{@code >}
     * {@link JAXBElement }{@code <}{@link LetterOfCreditReference }{@code >}
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