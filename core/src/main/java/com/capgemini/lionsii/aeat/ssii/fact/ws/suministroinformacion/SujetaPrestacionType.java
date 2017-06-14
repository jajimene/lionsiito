
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo de Operacion Sujeta
 * 
 * <p>Clase Java para SujetaPrestacionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SujetaPrestacionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Exenta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CausaExencion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CausaExencionType" minOccurs="0"/>
 *                   &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="NoExenta" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/>
 *                   &lt;element name="DesgloseIVA">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaPrestacionType" maxOccurs="6"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SujetaPrestacionType", propOrder = {
    "exenta",
    "noExenta"
})
public class SujetaPrestacionType {

    @XmlElement(name = "Exenta")
    protected SujetaPrestacionType.Exenta exenta;
    @XmlElement(name = "NoExenta")
    protected SujetaPrestacionType.NoExenta noExenta;

    /**
     * Obtiene el valor de la propiedad exenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaPrestacionType.Exenta }
     *     
     */
    public SujetaPrestacionType.Exenta getExenta() {
        return exenta;
    }

    /**
     * Define el valor de la propiedad exenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaPrestacionType.Exenta }
     *     
     */
    public void setExenta(SujetaPrestacionType.Exenta value) {
        this.exenta = value;
    }

    /**
     * Obtiene el valor de la propiedad noExenta.
     * 
     * @return
     *     possible object is
     *     {@link SujetaPrestacionType.NoExenta }
     *     
     */
    public SujetaPrestacionType.NoExenta getNoExenta() {
        return noExenta;
    }

    /**
     * Define el valor de la propiedad noExenta.
     * 
     * @param value
     *     allowed object is
     *     {@link SujetaPrestacionType.NoExenta }
     *     
     */
    public void setNoExenta(SujetaPrestacionType.NoExenta value) {
        this.noExenta = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CausaExencion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CausaExencionType" minOccurs="0"/>
     *         &lt;element name="BaseImponible" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "causaExencion",
        "baseImponible"
    })
    public static class Exenta {

        @XmlElement(name = "CausaExencion")
        @XmlSchemaType(name = "string")
        protected CausaExencionType causaExencion;
        @XmlElement(name = "BaseImponible", required = true)
        protected String baseImponible;

        /**
         * Obtiene el valor de la propiedad causaExencion.
         * 
         * @return
         *     possible object is
         *     {@link CausaExencionType }
         *     
         */
        public CausaExencionType getCausaExencion() {
            return causaExencion;
        }

        /**
         * Define el valor de la propiedad causaExencion.
         * 
         * @param value
         *     allowed object is
         *     {@link CausaExencionType }
         *     
         */
        public void setCausaExencion(CausaExencionType value) {
            this.causaExencion = value;
        }

        /**
         * Obtiene el valor de la propiedad baseImponible.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBaseImponible() {
            return baseImponible;
        }

        /**
         * Define el valor de la propiedad baseImponible.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBaseImponible(String value) {
            this.baseImponible = value;
        }

    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="TipoNoExenta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoOperacionSujetaNoExentaType"/>
     *         &lt;element name="DesgloseIVA">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaPrestacionType" maxOccurs="6"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tipoNoExenta",
        "desgloseIVA"
    })
    public static class NoExenta {

        @XmlElement(name = "TipoNoExenta", required = true)
        @XmlSchemaType(name = "string")
        protected TipoOperacionSujetaNoExentaType tipoNoExenta;
        @XmlElement(name = "DesgloseIVA", required = true)
        protected SujetaPrestacionType.NoExenta.DesgloseIVA desgloseIVA;

        /**
         * Obtiene el valor de la propiedad tipoNoExenta.
         * 
         * @return
         *     possible object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public TipoOperacionSujetaNoExentaType getTipoNoExenta() {
            return tipoNoExenta;
        }

        /**
         * Define el valor de la propiedad tipoNoExenta.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoOperacionSujetaNoExentaType }
         *     
         */
        public void setTipoNoExenta(TipoOperacionSujetaNoExentaType value) {
            this.tipoNoExenta = value;
        }

        /**
         * Obtiene el valor de la propiedad desgloseIVA.
         * 
         * @return
         *     possible object is
         *     {@link SujetaPrestacionType.NoExenta.DesgloseIVA }
         *     
         */
        public SujetaPrestacionType.NoExenta.DesgloseIVA getDesgloseIVA() {
            return desgloseIVA;
        }

        /**
         * Define el valor de la propiedad desgloseIVA.
         * 
         * @param value
         *     allowed object is
         *     {@link SujetaPrestacionType.NoExenta.DesgloseIVA }
         *     
         */
        public void setDesgloseIVA(SujetaPrestacionType.NoExenta.DesgloseIVA value) {
            this.desgloseIVA = value;
        }


        /**
         * Desglose por tipos de iva
         * 
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DetalleIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DetalleIVAEmitidaPrestacionType" maxOccurs="6"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "detalleIVA"
        })
        public static class DesgloseIVA {

            @XmlElement(name = "DetalleIVA", required = true)
            protected List<DetalleIVAEmitidaPrestacionType> detalleIVA;

            /**
             * Gets the value of the detalleIVA property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the detalleIVA property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDetalleIVA().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link DetalleIVAEmitidaPrestacionType }
             * 
             * 
             */
            public List<DetalleIVAEmitidaPrestacionType> getDetalleIVA() {
                if (detalleIVA == null) {
                    detalleIVA = new ArrayList<DetalleIVAEmitidaPrestacionType>();
                }
                return this.detalleIVA;
            }

        }

    }

}
