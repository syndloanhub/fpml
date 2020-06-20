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
 * <p>Java class for DealtCurrencyEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DealtCurrencyEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ExchangedCurrency1"/&gt;
 *     &lt;enumeration value="ExchangedCurrency2"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DealtCurrencyEnum")
@XmlEnum
public enum DealtCurrencyEnum {

    @XmlEnumValue("ExchangedCurrency1")
    EXCHANGED_CURRENCY_1("ExchangedCurrency1"),
    @XmlEnumValue("ExchangedCurrency2")
    EXCHANGED_CURRENCY_2("ExchangedCurrency2");
    private final String value;

    DealtCurrencyEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DealtCurrencyEnum fromValue(String v) {
        for (DealtCurrencyEnum c: DealtCurrencyEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}