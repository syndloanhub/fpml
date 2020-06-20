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
 * <p>Java class for MarketDisruptionEventsEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MarketDisruptionEventsEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Applicable"/&gt;
 *     &lt;enumeration value="NotApplicable"/&gt;
 *     &lt;enumeration value="AsSpecifiedInMasterAgreement"/&gt;
 *     &lt;enumeration value="AsSpecifiedInConfirmation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MarketDisruptionEventsEnum")
@XmlEnum
public enum MarketDisruptionEventsEnum {


    /**
     * Market Disruption Events are applicable.
     * 
     */
    @XmlEnumValue("Applicable")
    APPLICABLE("Applicable"),

    /**
     * Market Disruption Events are not applicable.
     * 
     */
    @XmlEnumValue("NotApplicable")
    NOT_APPLICABLE("NotApplicable"),

    /**
     * The Market Disruption Event(s) are determined by reference to the relevant Master Agreement.
     * 
     */
    @XmlEnumValue("AsSpecifiedInMasterAgreement")
    AS_SPECIFIED_IN_MASTER_AGREEMENT("AsSpecifiedInMasterAgreement"),

    /**
     * The Market Disruption Event(s) are determined by reference to the relevant Confirmation.
     * 
     */
    @XmlEnumValue("AsSpecifiedInConfirmation")
    AS_SPECIFIED_IN_CONFIRMATION("AsSpecifiedInConfirmation");
    private final String value;

    MarketDisruptionEventsEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MarketDisruptionEventsEnum fromValue(String v) {
        for (MarketDisruptionEventsEnum c: MarketDisruptionEventsEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}