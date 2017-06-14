
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestasuministro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.CabeceraSii;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.DatosPresentacionType;


/**
 * <p>Clase Java para RespuestaComunAltaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaComunAltaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CSV" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DatosPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DatosPresentacionType" minOccurs="0"/>
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CabeceraSii"/>
 *         &lt;element name="EstadoEnvio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaSuministro.xsd}EstadoEnvioType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaComunAltaType", propOrder = {
    "csv",
    "datosPresentacion",
    "cabecera",
    "estadoEnvio"
})
@XmlSeeAlso({
    RespuestaLROperacionesSegurosType.class,
    RespuestaLROComunitariasType.class,
    RespuestaLRBienesInversionType.class,
    RespuestaLRFEmitidasType.class,
    RespuestaLRFRecibidasType.class,
    RespuestaLRIMetalicoType.class,
    RespuestaLRAgenciasViajesType.class
})
public class RespuestaComunAltaType {

    @XmlElement(name = "CSV")
    protected String csv;
    @XmlElement(name = "DatosPresentacion")
    protected DatosPresentacionType datosPresentacion;
    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraSii cabecera;
    @XmlElement(name = "EstadoEnvio", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoEnvioType estadoEnvio;

    /**
     * Obtiene el valor de la propiedad csv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSV() {
        return csv;
    }

    /**
     * Define el valor de la propiedad csv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSV(String value) {
        this.csv = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPresentacionType }
     *     
     */
    public DatosPresentacionType getDatosPresentacion() {
        return datosPresentacion;
    }

    /**
     * Define el valor de la propiedad datosPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPresentacionType }
     *     
     */
    public void setDatosPresentacion(DatosPresentacionType value) {
        this.datosPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSii }
     *     
     */
    public CabeceraSii getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSii }
     *     
     */
    public void setCabecera(CabeceraSii value) {
        this.cabecera = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoEnvio.
     * 
     * @return
     *     possible object is
     *     {@link EstadoEnvioType }
     *     
     */
    public EstadoEnvioType getEstadoEnvio() {
        return estadoEnvio;
    }

    /**
     * Define el valor de la propiedad estadoEnvio.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoEnvioType }
     *     
     */
    public void setEstadoEnvio(EstadoEnvioType value) {
        this.estadoEnvio = value;
    }

}
