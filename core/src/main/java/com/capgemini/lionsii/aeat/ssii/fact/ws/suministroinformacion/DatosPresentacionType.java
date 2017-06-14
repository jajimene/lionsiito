
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosPresentacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosPresentacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NIFPresentador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}NIFType"/>
 *         &lt;element name="TimestampPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}Timestamp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosPresentacionType", propOrder = {
    "nifPresentador",
    "timestampPresentacion"
})
public class DatosPresentacionType {

    @XmlElement(name = "NIFPresentador", required = true)
    protected String nifPresentador;
    @XmlElement(name = "TimestampPresentacion", required = true)
    protected String timestampPresentacion;

    /**
     * Obtiene el valor de la propiedad nifPresentador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFPresentador() {
        return nifPresentador;
    }

    /**
     * Define el valor de la propiedad nifPresentador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFPresentador(String value) {
        this.nifPresentador = value;
    }

    /**
     * Obtiene el valor de la propiedad timestampPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimestampPresentacion() {
        return timestampPresentacion;
    }

    /**
     * Define el valor de la propiedad timestampPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimestampPresentacion(String value) {
        this.timestampPresentacion = value;
    }

}
