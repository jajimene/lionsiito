
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DetalleIVAEmitidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DetalleIVAEmitidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoImpositivo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/>
 *         &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/>
 *         &lt;element name="CuotaRepercutida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="TipoRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Tipo2.2Type" minOccurs="0"/>
 *         &lt;element name="CuotaRecargoEquivalencia" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DetalleIVAEmitidaType", propOrder = {
    "tipoImpositivo",
    "baseImponible",
    "cuotaRepercutida",
    "tipoRecargoEquivalencia",
    "cuotaRecargoEquivalencia"
})
public class DetalleIVAEmitidaType {

    @XmlElement(name = "TipoImpositivo")
    protected String tipoImpositivo;
    @XmlElement(name = "BaseImponible", required = true)
    protected String baseImponible;
    @XmlElement(name = "CuotaRepercutida")
    protected String cuotaRepercutida;
    @XmlElement(name = "TipoRecargoEquivalencia")
    protected String tipoRecargoEquivalencia;
    @XmlElement(name = "CuotaRecargoEquivalencia")
    protected String cuotaRecargoEquivalencia;

    /**
     * Obtiene el valor de la propiedad tipoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoImpositivo() {
        return tipoImpositivo;
    }

    /**
     * Define el valor de la propiedad tipoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoImpositivo(String value) {
        this.tipoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad baseImponible.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseImponible() {
        return baseImponible;
    }

    /**
     * Define el valor de la propiedad baseImponible.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseImponible(String value) {
        this.baseImponible = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRepercutida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRepercutida() {
        return cuotaRepercutida;
    }

    /**
     * Define el valor de la propiedad cuotaRepercutida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRepercutida(String value) {
        this.cuotaRepercutida = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoRecargoEquivalencia() {
        return tipoRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad tipoRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoRecargoEquivalencia(String value) {
        this.tipoRecargoEquivalencia = value;
    }

    /**
     * Obtiene el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuotaRecargoEquivalencia() {
        return cuotaRecargoEquivalencia;
    }

    /**
     * Define el valor de la propiedad cuotaRecargoEquivalencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuotaRecargoEquivalencia(String value) {
        this.cuotaRecargoEquivalencia = value;
    }

}
