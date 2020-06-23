//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The abstract base class for all types which define intra-document pointers.
 * 
 * <p>Java class for Reference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Reference"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reference")
@XmlSeeAlso({
    AccountReference.class,
    AmountReference.class,
    BusinessCentersReference.class,
    BusinessDayAdjustmentsReference.class,
    BusinessUnitReference.class,
    DateReference.class,
    DeterminationMethodReference.class,
    IdentifiedCurrencyReference.class,
    LegalEntityReference.class,
    NotionalAmountReference.class,
    NotionalReference.class,
    NumberOfOptionsReference.class,
    NumberOfUnitsReference.class,
    PartyReference.class,
    PersonReference.class,
    PartyTradeIdentifierReference.class,
    PaymentReference.class,
    PricingStructureReference.class,
    ProductReference.class,
    ReturnSwapNotionalAmountReference.class,
    ScheduleReference.class,
    SpreadScheduleReference.class,
    SwapStreamReference.class,
    AnyAssetReference.class,
    AssetReference.class,
    CreditEventsReference.class,
    FixedRateReference.class,
    ProtectionTermsReference.class,
    SettlementTermsReference.class,
    CalculationPeriodsDatesReference.class,
    CalculationPeriodsReference.class,
    CalculationPeriodsScheduleReference.class,
    CommodityNotionalAmountReference.class,
    LagReference.class,
    QuantityReference.class,
    SettlementPeriodsReference.class,
    StrikePriceBasketReference.class,
    StrikePriceUnderlyingReference.class,
    FloatingRateCalculationReference.class,
    InterestLegCalculationPeriodDatesReference.class,
    UnderlyerReference.class,
    CashflowObservationReference.class,
    DealReference.class,
    FacilityReference.class,
    LetterOfCreditReference.class,
    LoanAllocationReference.class,
    LoanContractReference.class,
    LoanTradeReference.class
})
public abstract class Reference implements Serializable
{

    private final static long serialVersionUID = 54L;

}
