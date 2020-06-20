//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.20 at 01:58:16 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RealisedVarianceMethodEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RealisedVarianceMethodEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Previous"/&gt;
 *     &lt;enumeration value="Last"/&gt;
 *     &lt;enumeration value="Both"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RealisedVarianceMethodEnum")
@XmlEnum
public enum RealisedVarianceMethodEnum {


    /**
     * For a return on day T, the observed price on T-1 must be in range.
     * 
     */
    @XmlEnumValue("Previous")
    PREVIOUS("Previous"),

    /**
     * For a return on day T, the observed price on T must be in range.
     * 
     */
    @XmlEnumValue("Last")
    LAST("Last"),

    /**
     * For a return on day T, the observed prices on both T and T-1 must be in range
     * 
     */
    @XmlEnumValue("Both")
    BOTH("Both");
    private final String value;

    RealisedVarianceMethodEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RealisedVarianceMethodEnum fromValue(String v) {
        for (RealisedVarianceMethodEnum c: RealisedVarianceMethodEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
