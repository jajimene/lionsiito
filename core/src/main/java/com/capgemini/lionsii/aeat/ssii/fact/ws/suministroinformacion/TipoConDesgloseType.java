
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Desglose de Tipo de Operacion diferenciando entre Entrega de Bienes o Prestacion de Servicios
 * 
 * <p>Clase Java para TipoConDesgloseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoConDesgloseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrestacionServicios" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoSinDesglosePrestacionType" minOccurs="0"/>
 *         &lt;element name="Entrega" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoSinDesgloseType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoConDesgloseType", propOrder = {
    "prestacionServicios",
    "entrega"
})
public class TipoConDesgloseType {

    @XmlElement(name = "PrestacionServicios")
    protected TipoSinDesglosePrestacionType prestacionServicios;
    @XmlElement(name = "Entrega")
    protected TipoSinDesgloseType entrega;

    /**
     * Obtiene el valor de la propiedad prestacionServicios.
     * 
     * @return
     *     possible object is
     *     {@link TipoSinDesglosePrestacionType }
     *     
     */
    public TipoSinDesglosePrestacionType getPrestacionServicios() {
        return prestacionServicios;
    }

    /**
     * Define el valor de la propiedad prestacionServicios.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSinDesglosePrestacionType }
     *     
     */
    public void setPrestacionServicios(TipoSinDesglosePrestacionType value) {
        this.prestacionServicios = value;
    }

    /**
     * Obtiene el valor de la propiedad entrega.
     * 
     * @return
     *     possible object is
     *     {@link TipoSinDesgloseType }
     *     
     */
    public TipoSinDesgloseType getEntrega() {
        return entrega;
    }

    /**
     * Define el valor de la propiedad entrega.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoSinDesgloseType }
     *     
     */
    public void setEntrega(TipoSinDesgloseType value) {
        this.entrega = value;
    }

}
