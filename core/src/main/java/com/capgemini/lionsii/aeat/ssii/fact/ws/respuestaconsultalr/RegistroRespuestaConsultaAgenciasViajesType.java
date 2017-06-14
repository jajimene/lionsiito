
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.DatosPresentacion2Type;


/**
 * <p>Clase Java para RegistroRespuestaConsultaAgenciasViajesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroRespuestaConsultaAgenciasViajesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DatosAgenciasViajes" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RespuestaCobrosMetalicoType"/>
 *         &lt;element name="DatosPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DatosPresentacion2Type"/>
 *         &lt;element name="EstadoAgenciasViajes" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}EstadoFactura2Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroRespuestaConsultaAgenciasViajesType", propOrder = {
    "datosAgenciasViajes",
    "datosPresentacion",
    "estadoAgenciasViajes"
})
public class RegistroRespuestaConsultaAgenciasViajesType {

    @XmlElement(name = "DatosAgenciasViajes", required = true)
    protected RespuestaCobrosMetalicoType datosAgenciasViajes;
    @XmlElement(name = "DatosPresentacion", required = true)
    protected DatosPresentacion2Type datosPresentacion;
    @XmlElement(name = "EstadoAgenciasViajes", required = true)
    protected EstadoFactura2Type estadoAgenciasViajes;

    /**
     * Obtiene el valor de la propiedad datosAgenciasViajes.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaCobrosMetalicoType }
     *     
     */
    public RespuestaCobrosMetalicoType getDatosAgenciasViajes() {
        return datosAgenciasViajes;
    }

    /**
     * Define el valor de la propiedad datosAgenciasViajes.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaCobrosMetalicoType }
     *     
     */
    public void setDatosAgenciasViajes(RespuestaCobrosMetalicoType value) {
        this.datosAgenciasViajes = value;
    }

    /**
     * Obtiene el valor de la propiedad datosPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public DatosPresentacion2Type getDatosPresentacion() {
        return datosPresentacion;
    }

    /**
     * Define el valor de la propiedad datosPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link DatosPresentacion2Type }
     *     
     */
    public void setDatosPresentacion(DatosPresentacion2Type value) {
        this.datosPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoAgenciasViajes.
     * 
     * @return
     *     possible object is
     *     {@link EstadoFactura2Type }
     *     
     */
    public EstadoFactura2Type getEstadoAgenciasViajes() {
        return estadoAgenciasViajes;
    }

    /**
     * Define el valor de la propiedad estadoAgenciasViajes.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoFactura2Type }
     *     
     */
    public void setEstadoAgenciasViajes(EstadoFactura2Type value) {
        this.estadoAgenciasViajes = value;
    }

}
