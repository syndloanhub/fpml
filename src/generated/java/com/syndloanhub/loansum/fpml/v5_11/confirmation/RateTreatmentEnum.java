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
 * <p>Java class for RateTreatmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RateTreatmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BondEquivalentYield"/&gt;
 *     &lt;enumeration value="MoneyMarketYield"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RateTreatmentEnum")
@XmlEnum
public enum RateTreatmentEnum {


    /**
     * Bond Equivalent Yield. Per Annex to the 2000 ISDA Definitions (June 2000 Version), Section 7.3. Certain General Definitions Relating to Floating Rate Options, paragraph (g).
     * 
     */
    @XmlEnumValue("BondEquivalentYield")
    BOND_EQUIVALENT_YIELD("BondEquivalentYield"),

    /**
     * Money Market Yield. Per Annex to the 2000 ISDA Definitions (June 2000 Version), Section 7.3. Certain General Definitions Relating to Floating Rate Options, paragraph (h).
     * 
     */
    @XmlEnumValue("MoneyMarketYield")
    MONEY_MARKET_YIELD("MoneyMarketYield");
    private final String value;

    RateTreatmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RateTreatmentEnum fromValue(String v) {
        for (RateTreatmentEnum c: RateTreatmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
