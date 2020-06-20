//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A type defining an offset used in calculating a date when this date is defined in reference to another date through a date offset. The type includes the convention for adjusting the date and an optional sequence element to indicate the order in a sequence of multiple date offsets.
 * 
 * <p>Java class for DateOffset complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOffset"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}Offset"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="businessDayConvention" type="{http://www.fpml.org/FpML-5/confirmation}BusinessDayConventionEnum"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOffset", propOrder = {
    "businessDayConvention"
})
public class DateOffset
    extends Offset
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected BusinessDayConventionEnum businessDayConvention;

    /**
     * Gets the value of the businessDayConvention property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public BusinessDayConventionEnum getBusinessDayConvention() {
        return businessDayConvention;
    }

    /**
     * Sets the value of the businessDayConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDayConventionEnum }
     *     
     */
    public void setBusinessDayConvention(BusinessDayConventionEnum value) {
        this.businessDayConvention = value;
    }

}
