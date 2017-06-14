
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaConsultaCobrosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaCobrosType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RespuestaConsultaFacturaCobrosType">
 *       &lt;sequence>
 *         &lt;element name="RegistroRespuestaConsultaCobros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaCobrosType" maxOccurs="10000" minOccurs="0"/>
 *         &lt;element name="ClavePaginacion" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaCobrosType", propOrder = {
    "registroRespuestaConsultaCobros",
    "clavePaginacion"
})
public class RespuestaConsultaCobrosType
    extends RespuestaConsultaFacturaCobrosType
{

    @XmlElement(name = "RegistroRespuestaConsultaCobros")
    protected List<RegistroRespuestaConsultaCobrosType> registroRespuestaConsultaCobros;
    @XmlElement(name = "ClavePaginacion")
    protected Double clavePaginacion;

    /**
     * Gets the value of the registroRespuestaConsultaCobros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaCobros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaCobros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaCobrosType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaCobrosType> getRegistroRespuestaConsultaCobros() {
        if (registroRespuestaConsultaCobros == null) {
            registroRespuestaConsultaCobros = new ArrayList<RegistroRespuestaConsultaCobrosType>();
        }
        return this.registroRespuestaConsultaCobros;
    }

    /**
     * Obtiene el valor de la propiedad clavePaginacion.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getClavePaginacion() {
        return clavePaginacion;
    }

    /**
     * Define el valor de la propiedad clavePaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setClavePaginacion(Double value) {
        this.clavePaginacion = value;
    }

}
