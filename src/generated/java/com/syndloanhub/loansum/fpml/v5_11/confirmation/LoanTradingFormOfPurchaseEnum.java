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
 * <p>Java class for LoanTradingFormOfPurchaseEnum.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="LoanTradingFormOfPurchaseEnum"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="Assignment"/&gt;
 *     &lt;enumeration value="AssignmentOnly"/&gt;
 *     &lt;enumeration value="Other"/&gt;
 *     &lt;enumeration value="LMAFundedParticipation"/&gt;
 *     &lt;enumeration value="LMAFundedRiskParticipation"/&gt;
 *     &lt;enumeration value="LMARiskParticipation"/&gt;
 *     &lt;enumeration value="LMARiskToFundedParticipation"/&gt;
 *     &lt;enumeration value="LMATransferAgreement"/&gt;
 *     &lt;enumeration value="LMATransferCertificate"/&gt;
 *     &lt;enumeration value="Participation"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "LoanTradingFormOfPurchaseEnum")
@XmlEnum
public enum LoanTradingFormOfPurchaseEnum {

    @XmlEnumValue("Assignment")
    ASSIGNMENT("Assignment"),
    @XmlEnumValue("AssignmentOnly")
    ASSIGNMENT_ONLY("AssignmentOnly"),
    @XmlEnumValue("Other")
    OTHER("Other"),
    @XmlEnumValue("LMAFundedParticipation")
    LMA_FUNDED_PARTICIPATION("LMAFundedParticipation"),
    @XmlEnumValue("LMAFundedRiskParticipation")
    LMA_FUNDED_RISK_PARTICIPATION("LMAFundedRiskParticipation"),
    @XmlEnumValue("LMARiskParticipation")
    LMA_RISK_PARTICIPATION("LMARiskParticipation"),
    @XmlEnumValue("LMARiskToFundedParticipation")
    LMA_RISK_TO_FUNDED_PARTICIPATION("LMARiskToFundedParticipation"),
    @XmlEnumValue("LMATransferAgreement")
    LMA_TRANSFER_AGREEMENT("LMATransferAgreement"),
    @XmlEnumValue("LMATransferCertificate")
    LMA_TRANSFER_CERTIFICATE("LMATransferCertificate"),
    @XmlEnumValue("Participation")
    PARTICIPATION("Participation");
    private final String value;

    LoanTradingFormOfPurchaseEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LoanTradingFormOfPurchaseEnum fromValue(String v) {
        for (LoanTradingFormOfPurchaseEnum c: LoanTradingFormOfPurchaseEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
