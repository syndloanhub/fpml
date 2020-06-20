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
 * <p>Java class for WeatherSettlementLevelEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="WeatherSettlementLevelEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Cumulative"/&gt;
 *     &lt;enumeration value="Average"/&gt;
 *     &lt;enumeration value="Mximum"/&gt;
 *     &lt;enumeration value="Minimum"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WeatherSettlementLevelEnum")
@XmlEnum
public enum WeatherSettlementLevelEnum {


    /**
     * The cumulative number of Weather Index Units for each day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Cumulative")
    CUMULATIVE("Cumulative"),

    /**
     * The cumulative number of Weather Index Units for each day in the Calculation Period divided by the number of days in the Calculation Period.
     * 
     */
    @XmlEnumValue("Average")
    AVERAGE("Average"),

    /**
     * The maximum number of Weather Index Units for any day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Mximum")
    MXIMUM("Mximum"),

    /**
     * The minimum number of Weather Index Units for any day in the Calculation Period.
     * 
     */
    @XmlEnumValue("Minimum")
    MINIMUM("Minimum");
    private final String value;

    WeatherSettlementLevelEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static WeatherSettlementLevelEnum fromValue(String v) {
        for (WeatherSettlementLevelEnum c: WeatherSettlementLevelEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}