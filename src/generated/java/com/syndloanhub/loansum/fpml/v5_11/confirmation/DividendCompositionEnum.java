//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DividendCompositionEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DividendCompositionEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="EquityAmountReceiverElection"/&gt;
 *     &lt;enumeration value="CalculationAgentElection"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DividendCompositionEnum")
@XmlEnum
public enum DividendCompositionEnum {


    /**
     * The Equity Amount Receiver determines the composition of dividends (subject to conditions).
     * 
     */
    @XmlEnumValue("EquityAmountReceiverElection")
    EQUITY_AMOUNT_RECEIVER_ELECTION("EquityAmountReceiverElection"),

    /**
     * The Calculation Agent determines the composition of dividends (subject to conditions).
     * 
     */
    @XmlEnumValue("CalculationAgentElection")
    CALCULATION_AGENT_ELECTION("CalculationAgentElection");
    private final String value;

    DividendCompositionEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DividendCompositionEnum fromValue(String v) {
        for (DividendCompositionEnum c: DividendCompositionEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
