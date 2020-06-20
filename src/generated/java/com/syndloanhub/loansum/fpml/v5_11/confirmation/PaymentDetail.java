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
 * <p>Java class for PaymentDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}PaymentBase"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="paymentDate" type="{http://www.fpml.org/FpML-5/confirmation}AdjustableOrRelativeDate" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money"/&gt;
 *           &lt;sequence&gt;
 *             &lt;element name="paymentRule" type="{http://www.fpml.org/FpML-5/confirmation}PaymentRule"/&gt;
 *             &lt;element name="paymentAmount" type="{http://www.fpml.org/FpML-5/confirmation}Money" minOccurs="0"/&gt;
 *           &lt;/sequence&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDetail", propOrder = {
    "rest"
})
public class PaymentDetail
    extends PaymentBase
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "paymentDate", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paymentAmount", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "paymentRule", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> rest;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "PaymentAmount" is used by two different parts of a schema. See: 
     * line 2810 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-shared-5-11.xsd
     * line 2799 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-shared-5-11.xsd
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
     * {@link JAXBElement }{@code <}{@link AdjustableOrRelativeDate }{@code >}
     * {@link JAXBElement }{@code <}{@link Money }{@code >}
     * {@link JAXBElement }{@code <}{@link PaymentRule }{@code >}
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
