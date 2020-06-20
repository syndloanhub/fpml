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
 * <p>Java class for MetalTitleEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MetalTitleEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="TransfersWithRiskOfLoss"/&gt;
 *     &lt;enumeration value="DoesNotTransferWithRiskOfLoss"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MetalTitleEnum")
@XmlEnum
public enum MetalTitleEnum {


    /**
     * Transfers with Risk of Loss.
     * 
     */
    @XmlEnumValue("TransfersWithRiskOfLoss")
    TRANSFERS_WITH_RISK_OF_LOSS("TransfersWithRiskOfLoss"),

    /**
     * Does Not Transfer with Risk of Loss.
     * 
     */
    @XmlEnumValue("DoesNotTransferWithRiskOfLoss")
    DOES_NOT_TRANSFER_WITH_RISK_OF_LOSS("DoesNotTransferWithRiskOfLoss");
    private final String value;

    MetalTitleEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MetalTitleEnum fromValue(String v) {
        for (MetalTitleEnum c: MetalTitleEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
