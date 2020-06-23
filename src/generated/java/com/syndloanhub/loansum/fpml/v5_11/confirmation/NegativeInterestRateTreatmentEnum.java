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
 * <p>Java class for NegativeInterestRateTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NegativeInterestRateTreatmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="NegativeInterestRateMethod"/&gt;
 *     &lt;enumeration value="ZeroInterestRateMethod"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NegativeInterestRateTreatmentEnum")
@XmlEnum
public enum NegativeInterestRateTreatmentEnum {


    /**
     * Negative Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4 Negative Interest Rates, paragraphs (b) and (c).
     * 
     */
    @XmlEnumValue("NegativeInterestRateMethod")
    NEGATIVE_INTEREST_RATE_METHOD("NegativeInterestRateMethod"),

    /**
     * Zero Interest Rate Method. Per 2000 ISDA Definitions, Section 6.4. Negative Interest Rates, paragraphs (d) and (e).
     * 
     */
    @XmlEnumValue("ZeroInterestRateMethod")
    ZERO_INTEREST_RATE_METHOD("ZeroInterestRateMethod");
    private final String value;

    NegativeInterestRateTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NegativeInterestRateTreatmentEnum fromValue(String v) {
        for (NegativeInterestRateTreatmentEnum c: NegativeInterestRateTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
