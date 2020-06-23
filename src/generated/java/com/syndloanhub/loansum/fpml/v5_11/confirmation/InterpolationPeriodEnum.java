//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InterpolationPeriodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="InterpolationPeriodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Initial"/&gt;
 *     &lt;enumeration value="InitialAndFinal"/&gt;
 *     &lt;enumeration value="Final"/&gt;
 *     &lt;enumeration value="AnyPeriod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "InterpolationPeriodEnum")
@XmlEnum
public enum InterpolationPeriodEnum {


    /**
     * Interpolation is applicable to the initial period only.
     * 
     */
    @XmlEnumValue("Initial")
    INITIAL("Initial"),

    /**
     * Interpolation is applicable to the initial and final periods only.
     * 
     */
    @XmlEnumValue("InitialAndFinal")
    INITIAL_AND_FINAL("InitialAndFinal"),

    /**
     * Interpolation is applicable to the final period only.
     * 
     */
    @XmlEnumValue("Final")
    FINAL("Final"),

    /**
     * Interpolation is applicable to any non-standard period.
     * 
     */
    @XmlEnumValue("AnyPeriod")
    ANY_PERIOD("AnyPeriod");
    private final String value;

    InterpolationPeriodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static InterpolationPeriodEnum fromValue(String v) {
        for (InterpolationPeriodEnum c: InterpolationPeriodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
