
package com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ContraparteConsultaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.FacturaModificadaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.PersonaFisicaJuridicaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RangoFechaPresentacionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RegistroSii;


/**
 * <p>Clase Java para LRFiltroAgenciasViajesType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRFiltroAgenciasViajesType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}RegistroSii">
 *       &lt;sequence>
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ContraparteConsultaType" minOccurs="0"/>
 *         &lt;element name="FechaPresentacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}RangoFechaPresentacionType" minOccurs="0"/>
 *         &lt;element name="RegistroModificado" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}FacturaModificadaType" minOccurs="0"/>
 *         &lt;element name="ClavePaginacion" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType"/>
 *                 &lt;/sequence>
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
@XmlType(name = "LRFiltroAgenciasViajesType", propOrder = {
    "contraparte",
    "fechaPresentacion",
    "registroModificado",
    "clavePaginacion"
})
public class LRFiltroAgenciasViajesType
    extends RegistroSii
{

    @XmlElement(name = "Contraparte")
    protected ContraparteConsultaType contraparte;
    @XmlElement(name = "FechaPresentacion")
    protected RangoFechaPresentacionType fechaPresentacion;
    @XmlElement(name = "RegistroModificado")
    @XmlSchemaType(name = "string")
    protected FacturaModificadaType registroModificado;
    @XmlElement(name = "ClavePaginacion")
    protected LRFiltroAgenciasViajesType.ClavePaginacion clavePaginacion;

    /**
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link ContraparteConsultaType }
     *     
     */
    public ContraparteConsultaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link ContraparteConsultaType }
     *     
     */
    public void setContraparte(ContraparteConsultaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaPresentacion.
     * 
     * @return
     *     possible object is
     *     {@link RangoFechaPresentacionType }
     *     
     */
    public RangoFechaPresentacionType getFechaPresentacion() {
        return fechaPresentacion;
    }

    /**
     * Define el valor de la propiedad fechaPresentacion.
     * 
     * @param value
     *     allowed object is
     *     {@link RangoFechaPresentacionType }
     *     
     */
    public void setFechaPresentacion(RangoFechaPresentacionType value) {
        this.fechaPresentacion = value;
    }

    /**
     * Obtiene el valor de la propiedad registroModificado.
     * 
     * @return
     *     possible object is
     *     {@link FacturaModificadaType }
     *     
     */
    public FacturaModificadaType getRegistroModificado() {
        return registroModificado;
    }

    /**
     * Define el valor de la propiedad registroModificado.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaModificadaType }
     *     
     */
    public void setRegistroModificado(FacturaModificadaType value) {
        this.registroModificado = value;
    }

    /**
     * Obtiene el valor de la propiedad clavePaginacion.
     * 
     * @return
     *     possible object is
     *     {@link LRFiltroAgenciasViajesType.ClavePaginacion }
     *     
     */
    public LRFiltroAgenciasViajesType.ClavePaginacion getClavePaginacion() {
        return clavePaginacion;
    }

    /**
     * Define el valor de la propiedad clavePaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link LRFiltroAgenciasViajesType.ClavePaginacion }
     *     
     */
    public void setClavePaginacion(LRFiltroAgenciasViajesType.ClavePaginacion value) {
        this.clavePaginacion = value;
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
     *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType"/>
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
        "contraparte"
    })
    public static class ClavePaginacion {

        @XmlElement(name = "Contraparte", required = true)
        protected PersonaFisicaJuridicaType contraparte;

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

    }

}
