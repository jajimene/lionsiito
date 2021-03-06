
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Identificador de persona F�sica o jur�dica distinto del NIF 
 *         								 (C�digo pais, Tipo de Identificador, y hasta 15 caract�res)
 *         								 No se permite CodigoPais=ES e IDType=01-NIFContraparte
 *         								 para ese caso, debe utilizarse NIF en lugar de IDOtro.
 *         	
 * 
 * <p>Clase Java para IDOtroType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="IDOtroType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoPais" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CountryType2" minOccurs="0"/>
 *         &lt;element name="IDType" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaIDTypeType"/>
 *         &lt;element name="ID" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax20Type"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IDOtroType", propOrder = {
    "codigoPais",
    "idType",
    "id"
})
public class IDOtroType {

    @XmlElement(name = "CodigoPais")
    @XmlSchemaType(name = "string")
    protected CountryType2 codigoPais;
    @XmlElement(name = "IDType", required = true)
    protected String idType;
    @XmlElement(name = "ID", required = true)
    protected String id;

    /**
     * Obtiene el valor de la propiedad codigoPais.
     * 
     * @return
     *     possible object is
     *     {@link CountryType2 }
     *     
     */
    public CountryType2 getCodigoPais() {
        return codigoPais;
    }

    /**
     * Define el valor de la propiedad codigoPais.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryType2 }
     *     
     */
    public void setCodigoPais(CountryType2 value) {
        this.codigoPais = value;
    }

    /**
     * Obtiene el valor de la propiedad idType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDType() {
        return idType;
    }

    /**
     * Define el valor de la propiedad idType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDType(String value) {
        this.idType = value;
    }

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

}
