
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Desglose cuando corresponda de la informaci�n asociada a los documentos de aduanas
 * 
 * <p>Clase Java para AduanasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="AduanasType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroDUA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax40Type" minOccurs="0"/>
 *         &lt;element name="FechaRegContableDUA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}fecha" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AduanasType", propOrder = {
    "numeroDUA",
    "fechaRegContableDUA"
})
public class AduanasType {

    @XmlElement(name = "NumeroDUA")
    protected String numeroDUA;
    @XmlElement(name = "FechaRegContableDUA")
    protected String fechaRegContableDUA;

    /**
     * Obtiene el valor de la propiedad numeroDUA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroDUA() {
        return numeroDUA;
    }

    /**
     * Define el valor de la propiedad numeroDUA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroDUA(String value) {
        this.numeroDUA = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaRegContableDUA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaRegContableDUA() {
        return fechaRegContableDUA;
    }

    /**
     * Define el valor de la propiedad fechaRegContableDUA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaRegContableDUA(String value) {
        this.fechaRegContableDUA = value;
    }

}
