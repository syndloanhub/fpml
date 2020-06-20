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
 * <p>Java class for BreakageCalculatedByEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BreakageCalculatedByEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Agent Bank"/&gt;
 *     &lt;enumeration value="Lender"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BreakageCalculatedByEnum")
@XmlEnum
public enum BreakageCalculatedByEnum {


    /**
     * Breakage cost is calculated by the agent bank.
     * 
     */
    @XmlEnumValue("Agent Bank")
    AGENT_BANK("Agent Bank"),

    /**
     * Breakage cost is calculated by the lender.
     * 
     */
    @XmlEnumValue("Lender")
    LENDER("Lender");
    private final String value;

    BreakageCalculatedByEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static BreakageCalculatedByEnum fromValue(String v) {
        for (BreakageCalculatedByEnum c: BreakageCalculatedByEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
