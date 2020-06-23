//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining the way in which interests are accrued: the applicable rate (fixed or floating reference) and the compounding method.
 * 
 * <p>Java class for InterestAccrualsCompoundingMethod complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InterestAccrualsCompoundingMethod"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}InterestAccrualsMethod"&gt;
 *       &lt;sequence minOccurs="0"&gt;
 *         &lt;element name="compoundingMethod" type="{http://www.fpml.org/FpML-5/confirmation}CompoundingMethodEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestAccrualsCompoundingMethod", propOrder = {
    "compoundingMethod"
})
public class InterestAccrualsCompoundingMethod
    extends InterestAccrualsMethod
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlSchemaType(name = "token")
    protected CompoundingMethodEnum compoundingMethod;

    /**
     * Gets the value of the compoundingMethod property.
     * 
     * @return
     *     possible object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public CompoundingMethodEnum getCompoundingMethod() {
        return compoundingMethod;
    }

    /**
     * Sets the value of the compoundingMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link CompoundingMethodEnum }
     *     
     */
    public void setCompoundingMethod(CompoundingMethodEnum value) {
        this.compoundingMethod = value;
    }

}
