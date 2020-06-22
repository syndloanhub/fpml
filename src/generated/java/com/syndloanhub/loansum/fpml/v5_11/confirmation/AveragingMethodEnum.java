//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.22 at 04:56:49 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AveragingMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AveragingMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Unweighted"/&gt;
 *     &lt;enumeration value="Weighted"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AveragingMethodEnum")
@XmlEnum
public enum AveragingMethodEnum {


    /**
     * The arithmetic mean of the relevant rates for each reset date.
     * 
     */
    @XmlEnumValue("Unweighted")
    UNWEIGHTED("Unweighted"),

    /**
     * The arithmetic mean of the relevant rates in effect for each day in a calculation period calculated by multiplying each relevant rate by the number of days such relevant rate is in effect, determining the sum of such products and dividing such sum by the number of days in the calculation period.
     * 
     */
    @XmlEnumValue("Weighted")
    WEIGHTED("Weighted");
    private final String value;

    AveragingMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AveragingMethodEnum fromValue(String v) {
        for (AveragingMethodEnum c: AveragingMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
