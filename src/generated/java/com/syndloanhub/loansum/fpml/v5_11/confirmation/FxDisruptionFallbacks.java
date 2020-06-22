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
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * A container for the disruption fallback set
 * 
 * <p>Java class for FxDisruptionFallbacks complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FxDisruptionFallbacks"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}fxDisruptionFallback" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FxDisruptionFallbacks", propOrder = {
    "fxDisruptionFallback"
})
public class FxDisruptionFallbacks
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRef(name = "fxDisruptionFallback", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class)
    protected List<JAXBElement<? extends FxDisruptionFallback>> fxDisruptionFallback;

    /**
     * Gets the value of the fxDisruptionFallback property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxDisruptionFallback property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFxDisruptionFallback().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link FxFallbackReferencePrice }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * {@link JAXBElement }{@code <}{@link Postponement }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * {@link JAXBElement }{@code <}{@link Postponement }{@code >}
     * {@link JAXBElement }{@code <}{@link NonDeliverableSubstitute }{@code >}
     * {@link JAXBElement }{@code <}{@link FxDisruptionFallback }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends FxDisruptionFallback>> getFxDisruptionFallback() {
        if (fxDisruptionFallback == null) {
            fxDisruptionFallback = new ArrayList<JAXBElement<? extends FxDisruptionFallback>>();
        }
        return this.fxDisruptionFallback;
    }

}
