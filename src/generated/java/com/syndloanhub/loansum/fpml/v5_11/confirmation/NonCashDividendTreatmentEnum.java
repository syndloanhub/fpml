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
 * <p>Java class for NonCashDividendTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonCashDividendTreatmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PotentialAdjustmentEvent"/&gt;
 *     &lt;enumeration value="CashEquivalent"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NonCashDividendTreatmentEnum")
@XmlEnum
public enum NonCashDividendTreatmentEnum {


    /**
     * The treatment of any non-cash dividend shall be determined in accordance with the Potential Adjustment Event provisions.
     * 
     */
    @XmlEnumValue("PotentialAdjustmentEvent")
    POTENTIAL_ADJUSTMENT_EVENT("PotentialAdjustmentEvent"),

    /**
     * Any non-cash dividend shall be treated as a Declared Cash Equivalent Dividend.
     * 
     */
    @XmlEnumValue("CashEquivalent")
    CASH_EQUIVALENT("CashEquivalent");
    private final String value;

    NonCashDividendTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonCashDividendTreatmentEnum fromValue(String v) {
        for (NonCashDividendTreatmentEnum c: NonCashDividendTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
