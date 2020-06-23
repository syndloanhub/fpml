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
import javax.xml.bind.annotation.XmlType;


/**
 * Weather Station.
 * 
 * <p>Java class for WeatherStation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeatherStation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element name="weatherStationCity" type="{http://www.fpml.org/FpML-5/confirmation}BusinessCenter"/&gt;
 *           &lt;element name="weatherStationAirport" type="{http://www.fpml.org/FpML-5/confirmation}WeatherStationAirport"/&gt;
 *           &lt;element name="weatherStationWBAN" type="{http://www.fpml.org/FpML-5/confirmation}WeatherStationWBAN"/&gt;
 *           &lt;element name="weatherStationWMO" type="{http://www.fpml.org/FpML-5/confirmation}WeatherStationWMO"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherStation", propOrder = {
    "weatherStationCity",
    "weatherStationAirport",
    "weatherStationWBAN",
    "weatherStationWMO"
})
public class WeatherStation
    implements Serializable
{

    private final static long serialVersionUID = 54L;
    protected BusinessCenter weatherStationCity;
    protected WeatherStationAirport weatherStationAirport;
    protected WeatherStationWBAN weatherStationWBAN;
    protected WeatherStationWMO weatherStationWMO;

    /**
     * Gets the value of the weatherStationCity property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessCenter }
     *     
     */
    public BusinessCenter getWeatherStationCity() {
        return weatherStationCity;
    }

    /**
     * Sets the value of the weatherStationCity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessCenter }
     *     
     */
    public void setWeatherStationCity(BusinessCenter value) {
        this.weatherStationCity = value;
    }

    /**
     * Gets the value of the weatherStationAirport property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationAirport }
     *     
     */
    public WeatherStationAirport getWeatherStationAirport() {
        return weatherStationAirport;
    }

    /**
     * Sets the value of the weatherStationAirport property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationAirport }
     *     
     */
    public void setWeatherStationAirport(WeatherStationAirport value) {
        this.weatherStationAirport = value;
    }

    /**
     * Gets the value of the weatherStationWBAN property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationWBAN }
     *     
     */
    public WeatherStationWBAN getWeatherStationWBAN() {
        return weatherStationWBAN;
    }

    /**
     * Sets the value of the weatherStationWBAN property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationWBAN }
     *     
     */
    public void setWeatherStationWBAN(WeatherStationWBAN value) {
        this.weatherStationWBAN = value;
    }

    /**
     * Gets the value of the weatherStationWMO property.
     * 
     * @return
     *     possible object is
     *     {@link WeatherStationWMO }
     *     
     */
    public WeatherStationWMO getWeatherStationWMO() {
        return weatherStationWMO;
    }

    /**
     * Sets the value of the weatherStationWMO property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeatherStationWMO }
     *     
     */
    public void setWeatherStationWMO(WeatherStationWMO value) {
        this.weatherStationWMO = value;
    }

}
