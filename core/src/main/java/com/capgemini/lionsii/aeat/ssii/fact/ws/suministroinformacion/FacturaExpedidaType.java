
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 *  Apunte correspondiente al libro de facturas expedidas. 
 * 
 * <p>Clase Java para FacturaExpedidaType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="FacturaExpedidaType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}FacturaType">
 *       &lt;sequence>
 *         &lt;element name="DatosInmueble" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DetalleInmueble" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DatosInmuebleType" maxOccurs="15"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ImporteTransmisionSujetoAIVA" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ImporteSgn12.2Type" minOccurs="0"/>
 *         &lt;element name="EmitidaPorTerceros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}EmitidaPorTercerosType" minOccurs="0"/>
 *         &lt;element name="VariosDestinatarios" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}VariosDestinatariosType" minOccurs="0"/>
 *         &lt;element name="Cupon" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CuponType" minOccurs="0"/>
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType" minOccurs="0"/>
 *         &lt;element name="TipoDesglose">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="DesgloseFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoSinDesgloseType"/>
 *                   &lt;element name="DesgloseTipoOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoConDesgloseType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacturaExpedidaType", propOrder = {
    "datosInmueble",
    "importeTransmisionSujetoAIVA",
    "emitidaPorTerceros",
    "variosDestinatarios",
    "cupon",
    "contraparte",
    "tipoDesglose"
})
public class FacturaExpedidaType
    extends FacturaType
{

    @XmlElement(name = "DatosInmueble")
    protected FacturaExpedidaType.DatosInmueble datosInmueble;
    @XmlElement(name = "ImporteTransmisionSujetoAIVA")
    protected String importeTransmisionSujetoAIVA;
    @XmlElement(name = "EmitidaPorTerceros")
    @XmlSchemaType(name = "string")
    protected EmitidaPorTercerosType emitidaPorTerceros;
    @XmlElement(name = "VariosDestinatarios")
    @XmlSchemaType(name = "string")
    protected VariosDestinatariosType variosDestinatarios;
    @XmlElement(name = "Cupon")
    @XmlSchemaType(name = "string")
    protected CuponType cupon;
    @XmlElement(name = "Contraparte")
    protected PersonaFisicaJuridicaType contraparte;
    @XmlElement(name = "TipoDesglose", required = true)
    protected FacturaExpedidaType.TipoDesglose tipoDesglose;

    /**
     * Obtiene el valor de la propiedad datosInmueble.
     * 
     * @return
     *     possible object is
     *     {@link FacturaExpedidaType.DatosInmueble }
     *     
     */
    public FacturaExpedidaType.DatosInmueble getDatosInmueble() {
        return datosInmueble;
    }

    /**
     * Define el valor de la propiedad datosInmueble.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaExpedidaType.DatosInmueble }
     *     
     */
    public void setDatosInmueble(FacturaExpedidaType.DatosInmueble value) {
        this.datosInmueble = value;
    }

    /**
     * Obtiene el valor de la propiedad importeTransmisionSujetoAIVA.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getImporteTransmisionSujetoAIVA() {
        return importeTransmisionSujetoAIVA;
    }

    /**
     * Define el valor de la propiedad importeTransmisionSujetoAIVA.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setImporteTransmisionSujetoAIVA(String value) {
        this.importeTransmisionSujetoAIVA = value;
    }

    /**
     * Obtiene el valor de la propiedad emitidaPorTerceros.
     * 
     * @return
     *     possible object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public EmitidaPorTercerosType getEmitidaPorTerceros() {
        return emitidaPorTerceros;
    }

    /**
     * Define el valor de la propiedad emitidaPorTerceros.
     * 
     * @param value
     *     allowed object is
     *     {@link EmitidaPorTercerosType }
     *     
     */
    public void setEmitidaPorTerceros(EmitidaPorTercerosType value) {
        this.emitidaPorTerceros = value;
    }

    /**
     * Obtiene el valor de la propiedad variosDestinatarios.
     * 
     * @return
     *     possible object is
     *     {@link VariosDestinatariosType }
     *     
     */
    public VariosDestinatariosType getVariosDestinatarios() {
        return variosDestinatarios;
    }

    /**
     * Define el valor de la propiedad variosDestinatarios.
     * 
     * @param value
     *     allowed object is
     *     {@link VariosDestinatariosType }
     *     
     */
    public void setVariosDestinatarios(VariosDestinatariosType value) {
        this.variosDestinatarios = value;
    }

    /**
     * Obtiene el valor de la propiedad cupon.
     * 
     * @return
     *     possible object is
     *     {@link CuponType }
     *     
     */
    public CuponType getCupon() {
        return cupon;
    }

    /**
     * Define el valor de la propiedad cupon.
     * 
     * @param value
     *     allowed object is
     *     {@link CuponType }
     *     
     */
    public void setCupon(CuponType value) {
        this.cupon = value;
    }

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
     * Obtiene el valor de la propiedad tipoDesglose.
     * 
     * @return
     *     possible object is
     *     {@link FacturaExpedidaType.TipoDesglose }
     *     
     */
    public FacturaExpedidaType.TipoDesglose getTipoDesglose() {
        return tipoDesglose;
    }

    /**
     * Define el valor de la propiedad tipoDesglose.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaExpedidaType.TipoDesglose }
     *     
     */
    public void setTipoDesglose(FacturaExpedidaType.TipoDesglose value) {
        this.tipoDesglose = value;
    }


    /**
     * Desglose de inmuebles
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
     *         &lt;element name="DetalleInmueble" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DatosInmuebleType" maxOccurs="15"/>
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
        "detalleInmueble"
    })
    public static class DatosInmueble {

        @XmlElement(name = "DetalleInmueble", required = true)
        protected List<DatosInmuebleType> detalleInmueble;

        /**
         * Gets the value of the detalleInmueble property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalleInmueble property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalleInmueble().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DatosInmuebleType }
         * 
         * 
         */
        public List<DatosInmuebleType> getDetalleInmueble() {
            if (detalleInmueble == null) {
                detalleInmueble = new ArrayList<DatosInmuebleType>();
            }
            return this.detalleInmueble;
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
     *       &lt;choice>
     *         &lt;element name="DesgloseFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoSinDesgloseType"/>
     *         &lt;element name="DesgloseTipoOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoConDesgloseType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "desgloseFactura",
        "desgloseTipoOperacion"
    })
    public static class TipoDesglose {

        @XmlElement(name = "DesgloseFactura")
        protected TipoSinDesgloseType desgloseFactura;
        @XmlElement(name = "DesgloseTipoOperacion")
        protected TipoConDesgloseType desgloseTipoOperacion;

        /**
         * Obtiene el valor de la propiedad desgloseFactura.
         * 
         * @return
         *     possible object is
         *     {@link TipoSinDesgloseType }
         *     
         */
        public TipoSinDesgloseType getDesgloseFactura() {
            return desgloseFactura;
        }

        /**
         * Define el valor de la propiedad desgloseFactura.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoSinDesgloseType }
         *     
         */
        public void setDesgloseFactura(TipoSinDesgloseType value) {
            this.desgloseFactura = value;
        }

        /**
         * Obtiene el valor de la propiedad desgloseTipoOperacion.
         * 
         * @return
         *     possible object is
         *     {@link TipoConDesgloseType }
         *     
         */
        public TipoConDesgloseType getDesgloseTipoOperacion() {
            return desgloseTipoOperacion;
        }

        /**
         * Define el valor de la propiedad desgloseTipoOperacion.
         * 
         * @param value
         *     allowed object is
         *     {@link TipoConDesgloseType }
         *     
         */
        public void setDesgloseTipoOperacion(TipoConDesgloseType value) {
            this.desgloseTipoOperacion = value;
        }

    }

}
