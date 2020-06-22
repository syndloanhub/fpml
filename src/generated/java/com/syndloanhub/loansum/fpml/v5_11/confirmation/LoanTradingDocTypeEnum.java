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
 * <p>Java class for LoanTradingDocTypeEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanTradingDocTypeEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Distressed"/&gt;
 *     &lt;enumeration value="Par"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanTradingDocTypeEnum")
@XmlEnum
public enum LoanTradingDocTypeEnum {


    /**
     * Distressed loan trade documentation.
     * 
     */
    @XmlEnumValue("Distressed")
    DISTRESSED("Distressed"),

    /**
     * Par loan trade documentation.
     * 
     */
    @XmlEnumValue("Par")
    PAR("Par");
    private final String value;

    LoanTradingDocTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanTradingDocTypeEnum fromValue(String v) {
        for (LoanTradingDocTypeEnum c: LoanTradingDocTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
