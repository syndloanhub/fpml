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
 * <p>Java class for LcAutoAdjustEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LcAutoAdjustEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AutoDecrease"/&gt;
 *     &lt;enumeration value="AutoIncrease"/&gt;
 *     &lt;enumeration value="AutoIncreaseOrDecrease"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LcAutoAdjustEnum")
@XmlEnum
public enum LcAutoAdjustEnum {


    /**
     * Denotes an automatic decrease.
     * 
     */
    @XmlEnumValue("AutoDecrease")
    AUTO_DECREASE("AutoDecrease"),

    /**
     * Denotes an automatic increase.
     * 
     */
    @XmlEnumValue("AutoIncrease")
    AUTO_INCREASE("AutoIncrease"),

    /**
     * Denotes an automatic increase or decrease.
     * 
     */
    @XmlEnumValue("AutoIncreaseOrDecrease")
    AUTO_INCREASE_OR_DECREASE("AutoIncreaseOrDecrease");
    private final String value;

    LcAutoAdjustEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LcAutoAdjustEnum fromValue(String v) {
        for (LcAutoAdjustEnum c: LcAutoAdjustEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
