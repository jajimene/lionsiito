
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Apunte correspondiente al libro de operaciones intracomunitarias. 
 * 
 * <p>Clase Java para OperacionIntracomunitariaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="OperacionIntracomunitariaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TipoOperacion">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="A"/>
 *               &lt;enumeration value="B"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ClaveDeclarado">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="D"/>
 *               &lt;enumeration value="R"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="EstadoMiembro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CountryMiembroType"/>
 *         &lt;element name="PlazoOperacion" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="\d{1,3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="DescripcionBienes" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax40Type"/>
 *         &lt;element name="DireccionOperador" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax120Type"/>
 *         &lt;element name="FacturasODocumentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TextMax150Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperacionIntracomunitariaType", propOrder = {
    "tipoOperacion",
    "claveDeclarado",
    "estadoMiembro",
    "plazoOperacion",
    "descripcionBienes",
    "direccionOperador",
    "facturasODocumentacion"
})
public class OperacionIntracomunitariaType {

    @XmlElement(name = "TipoOperacion", required = true)
    protected String tipoOperacion;
    @XmlElement(name = "ClaveDeclarado", required = true)
    protected String claveDeclarado;
    @XmlElement(name = "EstadoMiembro", required = true)
    @XmlSchemaType(name = "string")
    protected CountryMiembroType estadoMiembro;
    @XmlElement(name = "PlazoOperacion")
    protected String plazoOperacion;
    @XmlElement(name = "DescripcionBienes", required = true)
    protected String descripcionBienes;
    @XmlElement(name = "DireccionOperador", required = true)
    protected String direccionOperador;
    @XmlElement(name = "FacturasODocumentacion")
    protected String facturasODocumentacion;

    /**
     * Obtiene el valor de la propiedad tipoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoOperacion() {
        return tipoOperacion;
    }

    /**
     * Define el valor de la propiedad tipoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoOperacion(String value) {
        this.tipoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad claveDeclarado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaveDeclarado() {
        return claveDeclarado;
    }

    /**
     * Define el valor de la propiedad claveDeclarado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaveDeclarado(String value) {
        this.claveDeclarado = value;
    }

    /**
     * Obtiene el valor de la propiedad estadoMiembro.
     * 
     * @return
     *     possible object is
     *     {@link CountryMiembroType }
     *     
     */
    public CountryMiembroType getEstadoMiembro() {
        return estadoMiembro;
    }

    /**
     * Define el valor de la propiedad estadoMiembro.
     * 
     * @param value
     *     allowed object is
     *     {@link CountryMiembroType }
     *     
     */
    public void setEstadoMiembro(CountryMiembroType value) {
        this.estadoMiembro = value;
    }

    /**
     * Obtiene el valor de la propiedad plazoOperacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlazoOperacion() {
        return plazoOperacion;
    }

    /**
     * Define el valor de la propiedad plazoOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlazoOperacion(String value) {
        this.plazoOperacion = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcionBienes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcionBienes() {
        return descripcionBienes;
    }

    /**
     * Define el valor de la propiedad descripcionBienes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcionBienes(String value) {
        this.descripcionBienes = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionOperador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionOperador() {
        return direccionOperador;
    }

    /**
     * Define el valor de la propiedad direccionOperador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionOperador(String value) {
        this.direccionOperador = value;
    }

    /**
     * Obtiene el valor de la propiedad facturasODocumentacion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFacturasODocumentacion() {
        return facturasODocumentacion;
    }

    /**
     * Define el valor de la propiedad facturasODocumentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFacturasODocumentacion(String value) {
        this.facturasODocumentacion = value;
    }

}
