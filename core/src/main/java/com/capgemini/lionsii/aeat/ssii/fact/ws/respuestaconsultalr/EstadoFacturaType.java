
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para EstadoFacturaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="EstadoFacturaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EstadoCuadre" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}EstadoCuadreType" minOccurs="0"/>
 *         &lt;element name="TimestampEstadoCuadre" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Timestamp" minOccurs="0"/>
 *         &lt;element name="TimestampUltimaModificacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Timestamp"/>
 *         &lt;element name="EstadoRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}EstadoRegistroSIIType"/>
 *         &lt;element name="CodigoErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}ErrorDetalleType" minOccurs="0"/>
 *         &lt;element name="DescripcionErrorRegistro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax500Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EstadoFacturaType", propOrder = {
    "estadoCuadre",
    "timestampEstadoCuadre",
    "timestampUltimaModificacion",
    "estadoRegistro",
    "codigoErrorRegistro",
    "descripcionErrorRegistro"
})
public class EstadoFacturaType {

    @XmlElement(name = "EstadoCuadre")
    protected String estadoCuadre;
    @XmlElement(name = "TimestampEstadoCuadre")
    protected String timestampEstadoCuadre;
    @XmlElement(name = "TimestampUltimaModificacion", required = true)
    protected String timestampUltimaModificacion;
    @XmlElement(name = "EstadoRegistro", required = true)
    @XmlSchemaType(name = "string")
    protected EstadoRegistroSIIType estadoRegistro;
    @XmlElement(name = "CodigoErrorRegistro")
    protected BigInteger codigoErrorRegistro;
    @XmlElement(name = "DescripcionErrorRegistro")
    protected String descripcionErrorRegistro;

    /**
     * Obtiene el valor de la propiedad estadoCuadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoCuadre() {
        return estadoCuadre;
    }

    /**
     * Define el valor de la propiedad estadoCuadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoCuadre(String value) {
        this.estadoCuadre = value;
    }

    /**
     * Obtiene el valor de la propiedad timestampEstadoCuadre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampEstadoCuadre() {
        return timestampEstadoCuadre;
    }

    /**
     * Define el valor de la propiedad timestampEstadoCuadre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampEstadoCuadre(String value) {
        this.timestampEstadoCuadre = value;
    }

    /**
     * Obtiene el valor de la propiedad timestampUltimaModificacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampUltimaModificacion() {
        return timestampUltimaModificacion;
    }

    /**
     * Define el valor de la propiedad timestampUltimaModificacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampUltimaModificacion(String value) {
        this.timestampUltimaModificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoRegistro.
     * 
     * @return
     *     possible object is
     *     {@link EstadoRegistroSIIType }
     *     
     */
    public EstadoRegistroSIIType getEstadoRegistro() {
        return estadoRegistro;
    }

    /**
     * Define el valor de la propiedad estadoRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoRegistroSIIType }
     *     
     */
    public void setEstadoRegistro(EstadoRegistroSIIType value) {
        this.estadoRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCodigoErrorRegistro() {
        return codigoErrorRegistro;
    }

    /**
     * Define el valor de la propiedad codigoErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCodigoErrorRegistro(BigInteger value) {
        this.codigoErrorRegistro = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionErrorRegistro.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionErrorRegistro() {
        return descripcionErrorRegistro;
    }

    /**
     * Define el valor de la propiedad descripcionErrorRegistro.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionErrorRegistro(String value) {
        this.descripcionErrorRegistro = value;
    }

}
