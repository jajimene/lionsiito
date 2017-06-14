
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Apunte correspondiente al libro de bienes de inversion. 
 * 
 * <p>Clase Java para BienDeInversionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="BienDeInversionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdentificacionBien" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax40Type"/>
 *         &lt;element name="FechaInicioUtilizacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}fecha"/>
 *         &lt;element name="ProrrataAnualDefinitiva" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Tipo2.2Type"/>
 *         &lt;element name="RegularizacionAnualDeduccion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="IdentificacionEntrega" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax40Type" minOccurs="0"/>
 *         &lt;element name="RegularizacionDeduccionEfectuada" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BienDeInversionType", propOrder = {
    "identificacionBien",
    "fechaInicioUtilizacion",
    "prorrataAnualDefinitiva",
    "regularizacionAnualDeduccion",
    "identificacionEntrega",
    "regularizacionDeduccionEfectuada"
})
public class BienDeInversionType {

    @XmlElement(name = "IdentificacionBien", required = true)
    protected String identificacionBien;
    @XmlElement(name = "FechaInicioUtilizacion", required = true)
    protected String fechaInicioUtilizacion;
    @XmlElement(name = "ProrrataAnualDefinitiva", required = true)
    protected String prorrataAnualDefinitiva;
    @XmlElement(name = "RegularizacionAnualDeduccion")
    protected String regularizacionAnualDeduccion;
    @XmlElement(name = "IdentificacionEntrega")
    protected String identificacionEntrega;
    @XmlElement(name = "RegularizacionDeduccionEfectuada")
    protected String regularizacionDeduccionEfectuada;

    /**
     * Obtiene el valor de la propiedad identificacionBien.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionBien() {
        return identificacionBien;
    }

    /**
     * Define el valor de la propiedad identificacionBien.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionBien(String value) {
        this.identificacionBien = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaInicioUtilizacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaInicioUtilizacion() {
        return fechaInicioUtilizacion;
    }

    /**
     * Define el valor de la propiedad fechaInicioUtilizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaInicioUtilizacion(String value) {
        this.fechaInicioUtilizacion = value;
    }

    /**
     * Obtiene el valor de la propiedad prorrataAnualDefinitiva.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProrrataAnualDefinitiva() {
        return prorrataAnualDefinitiva;
    }

    /**
     * Define el valor de la propiedad prorrataAnualDefinitiva.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProrrataAnualDefinitiva(String value) {
        this.prorrataAnualDefinitiva = value;
    }

    /**
     * Obtiene el valor de la propiedad regularizacionAnualDeduccion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularizacionAnualDeduccion() {
        return regularizacionAnualDeduccion;
    }

    /**
     * Define el valor de la propiedad regularizacionAnualDeduccion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularizacionAnualDeduccion(String value) {
        this.regularizacionAnualDeduccion = value;
    }

    /**
     * Obtiene el valor de la propiedad identificacionEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentificacionEntrega() {
        return identificacionEntrega;
    }

    /**
     * Define el valor de la propiedad identificacionEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentificacionEntrega(String value) {
        this.identificacionEntrega = value;
    }

    /**
     * Obtiene el valor de la propiedad regularizacionDeduccionEfectuada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegularizacionDeduccionEfectuada() {
        return regularizacionDeduccionEfectuada;
    }

    /**
     * Define el valor de la propiedad regularizacionDeduccionEfectuada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegularizacionDeduccionEfectuada(String value) {
        this.regularizacionDeduccionEfectuada = value;
    }

}
