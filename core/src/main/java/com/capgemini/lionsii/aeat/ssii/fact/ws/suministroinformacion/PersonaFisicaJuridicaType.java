
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Datos de una persona f�sica o jur�dica Espa�ola o Extranjera
 * 
 * <p>Clase Java para PersonaFisicaJuridicaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="PersonaFisicaJuridicaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreRazon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax120Type"/>
 *         &lt;element name="NIFRepresentante" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}NIFType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="NIF" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}NIFType"/>
 *           &lt;element name="IDOtro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDOtroType"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonaFisicaJuridicaType", propOrder = {
    "nombreRazon",
    "nifRepresentante",
    "nif",
    "idOtro"
})
public class PersonaFisicaJuridicaType {

    @XmlElement(name = "NombreRazon", required = true)
    protected String nombreRazon;
    @XmlElement(name = "NIFRepresentante")
    protected String nifRepresentante;
    @XmlElement(name = "NIF")
    protected String nif;
    @XmlElement(name = "IDOtro")
    protected IDOtroType idOtro;

    /**
     * Obtiene el valor de la propiedad nombreRazon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRazon() {
        return nombreRazon;
    }

    /**
     * Define el valor de la propiedad nombreRazon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRazon(String value) {
        this.nombreRazon = value;
    }

    /**
     * Obtiene el valor de la propiedad nifRepresentante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIFRepresentante() {
        return nifRepresentante;
    }

    /**
     * Define el valor de la propiedad nifRepresentante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIFRepresentante(String value) {
        this.nifRepresentante = value;
    }

    /**
     * Obtiene el valor de la propiedad nif.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNIF() {
        return nif;
    }

    /**
     * Define el valor de la propiedad nif.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNIF(String value) {
        this.nif = value;
    }

    /**
     * Obtiene el valor de la propiedad idOtro.
     * 
     * @return
     *     possible object is
     *     {@link IDOtroType }
     *     
     */
    public IDOtroType getIDOtro() {
        return idOtro;
    }

    /**
     * Define el valor de la propiedad idOtro.
     * 
     * @param value
     *     allowed object is
     *     {@link IDOtroType }
     *     
     */
    public void setIDOtro(IDOtroType value) {
        this.idOtro = value;
    }

}
