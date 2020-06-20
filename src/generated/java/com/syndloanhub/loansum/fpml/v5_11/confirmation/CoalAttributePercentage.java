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
 * The different options for specifying the attributes of a coal quality measure as a percentage of the measured value.
 * 
 * <p>Java class for CoalAttributePercentage complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoalAttributePercentage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="standardContent" type="{http://www.fpml.org/FpML-5/confirmation}Percentage"/&gt;
 *           &lt;element name="rejectionLimit" type="{http://www.fpml.org/FpML-5/confirmation}Percentage" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="rejectionLimit" type="{http://www.fpml.org/FpML-5/confirmation}Percentage"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoalAttributePercentage", propOrder = {
    "content"
})
public class CoalAttributePercentage
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElementRefs({
        @XmlElementRef(name = "standardContent", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "rejectionLimit", namespace = "http://www.fpml.org/FpML-5/confirmation", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<BigDecimal>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "RejectionLimit" is used by two different parts of a schema. See: 
     * line 181 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-com-5-11.xsd
     * line 174 of file:/C:/Users/jsiss/Documents/github/fpml/fpml/src/main/xsd/confirmation/fpml-com-5-11.xsd
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
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * 
     */
    public List<JAXBElement<BigDecimal>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<BigDecimal>>();
        }
        return this.content;
    }

}