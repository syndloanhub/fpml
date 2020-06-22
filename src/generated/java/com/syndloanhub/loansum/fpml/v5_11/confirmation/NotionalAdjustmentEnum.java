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
 * <p>Java class for NotionalAdjustmentEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NotionalAdjustmentEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Execution"/&gt;
 *     &lt;enumeration value="PortfolioRebalancing"/&gt;
 *     &lt;enumeration value="Standard"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotionalAdjustmentEnum")
@XmlEnum
public enum NotionalAdjustmentEnum {


    /**
     * The adjustments to the number of units are governed by an execution clause.
     * 
     */
    @XmlEnumValue("Execution")
    EXECUTION("Execution"),

    /**
     * The adjustments to the number of units are governed by a portfolio rebalancing clause.
     * 
     */
    @XmlEnumValue("PortfolioRebalancing")
    PORTFOLIO_REBALANCING("PortfolioRebalancing"),

    /**
     * The adjustments to the number of units are not governed by any specific clause.
     * 
     */
    @XmlEnumValue("Standard")
    STANDARD("Standard");
    private final String value;

    NotionalAdjustmentEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NotionalAdjustmentEnum fromValue(String v) {
        for (NotionalAdjustmentEnum c: NotionalAdjustmentEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
