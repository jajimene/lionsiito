
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.OperacionIntracomunitariaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.PersonaFisicaJuridicaType;


/**
 * <p>Clase Java para RespuestaDetOperIntracomunitariaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaDetOperIntracomunitariaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType"/>
 *         &lt;element name="DetOperIntracomunitarias" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}OperacionIntracomunitariaType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaDetOperIntracomunitariaType", propOrder = {
    "contraparte",
    "detOperIntracomunitarias"
})
public class RespuestaDetOperIntracomunitariaType {

    @XmlElement(name = "Contraparte", required = true)
    protected PersonaFisicaJuridicaType contraparte;
    @XmlElement(name = "DetOperIntracomunitarias", required = true)
    protected OperacionIntracomunitariaType detOperIntracomunitarias;

    /**
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setContraparte(PersonaFisicaJuridicaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad detOperIntracomunitarias.
     * 
     * @return
     *     possible object is
     *     {@link OperacionIntracomunitariaType }
     *     
     */
    public OperacionIntracomunitariaType getDetOperIntracomunitarias() {
        return detOperIntracomunitarias;
    }

    /**
     * Define el valor de la propiedad detOperIntracomunitarias.
     * 
     * @param value
     *     allowed object is
     *     {@link OperacionIntracomunitariaType }
     *     
     */
    public void setDetOperIntracomunitarias(OperacionIntracomunitariaType value) {
        this.detOperIntracomunitarias = value;
    }

}
