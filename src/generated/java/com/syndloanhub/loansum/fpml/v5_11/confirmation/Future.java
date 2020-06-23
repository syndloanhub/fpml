//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.2 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.06.23 at 12:19:04 PM EDT 
//


package com.syndloanhub.loansum.fpml.v5_11.confirmation;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * An exchange traded future contract.
 * 
 * <p>Java class for Future complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Future"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.fpml.org/FpML-5/confirmation}ExchangeTraded"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="multiplier" type="{http://www.fpml.org/FpML-5/confirmation}PositiveDecimal" minOccurs="0"/&gt;
 *         &lt;element name="futureContractReference" type="{http://www.fpml.org/FpML-5/confirmation}String" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="maturity" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *           &lt;element name="contractYearMonth" type="{http://www.w3.org/2001/XMLSchema}gYearMonth"/&gt;
 *         &lt;/choice&gt;
 *         &lt;sequence&gt;
 *           &lt;element name="underlyer" type="{http://www.fpml.org/FpML-5/confirmation}ExchangeTradedContractUnderlyer" minOccurs="0"/&gt;
 *           &lt;element name="settlementType" type="{http://www.fpml.org/FpML-5/confirmation}SettlementTypeEnum" minOccurs="0"/&gt;
 *         &lt;/sequence&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Future", propOrder = {
    "multiplier",
    "futureContractReference",
    "maturity",
    "contractYearMonth",
    "underlyer",
    "settlementType"
})
public class Future
    extends ExchangeTraded
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BigDecimal multiplier;
    protected String futureContractReference;
    @XmlElement(type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "date")
    protected LocalDate maturity;
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar contractYearMonth;
    protected ExchangeTradedContractUnderlyer underlyer;
    @XmlSchemaType(name = "token")
    protected SettlementTypeEnum settlementType;

    /**
     * Gets the value of the multiplier property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMultiplier() {
        return multiplier;
    }

    /**
     * Sets the value of the multiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMultiplier(BigDecimal value) {
        this.multiplier = value;
    }

    /**
     * Gets the value of the futureContractReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFutureContractReference() {
        return futureContractReference;
    }

    /**
     * Sets the value of the futureContractReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFutureContractReference(String value) {
        this.futureContractReference = value;
    }

    /**
     * Gets the value of the maturity property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getMaturity() {
        return maturity;
    }

    /**
     * Sets the value of the maturity property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaturity(LocalDate value) {
        this.maturity = value;
    }

    /**
     * Gets the value of the contractYearMonth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContractYearMonth() {
        return contractYearMonth;
    }

    /**
     * Sets the value of the contractYearMonth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContractYearMonth(XMLGregorianCalendar value) {
        this.contractYearMonth = value;
    }

    /**
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public ExchangeTradedContractUnderlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeTradedContractUnderlyer }
     *     
     */
    public void setUnderlyer(ExchangeTradedContractUnderlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public SettlementTypeEnum getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTypeEnum }
     *     
     */
    public void setSettlementType(SettlementTypeEnum value) {
        this.settlementType = value;
    }

}
