
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ConsultaInformacion;


/**
 * <p>Clase Java para RespuestaConsultaLRFacturasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLRFacturasType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ConsultaInformacion">
 *       &lt;sequence>
 *         &lt;element name="PeriodoImpositivo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}YearType"/>
 *                   &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoPeriodoType"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IndicadorPaginacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}IndicadorPaginacionType"/>
 *         &lt;element name="ResultadoConsulta" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}ResultadoConsultaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLRFacturasType", propOrder = {
    "periodoImpositivo",
    "indicadorPaginacion",
    "resultadoConsulta"
})
@XmlSeeAlso({
    RespuestaConsultaLRFacturasEmitidasType.class,
    RespuestaConsultaLRBienesInversionType.class,
    RespuestaConsultaLRAgenciasViajesType.class,
    RespuestaConsultaLRCobrosMetalicoType.class,
    RespuestaConsultaLRFacturasRecibidasType.class,
    RespuestaConsultaLRDetOperIntracomunitariasType.class,
    RespuestaConsultaLROperacionesSegurosType.class
})
public class RespuestaConsultaLRFacturasType
    extends ConsultaInformacion
{

    @XmlElement(name = "PeriodoImpositivo", required = true)
    protected RespuestaConsultaLRFacturasType.PeriodoImpositivo periodoImpositivo;
    @XmlElement(name = "IndicadorPaginacion", required = true)
    @XmlSchemaType(name = "string")
    protected IndicadorPaginacionType indicadorPaginacion;
    @XmlElement(name = "ResultadoConsulta", required = true)
    @XmlSchemaType(name = "string")
    protected ResultadoConsultaType resultadoConsulta;

    /**
     * Obtiene el valor de la propiedad periodoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link RespuestaConsultaLRFacturasType.PeriodoImpositivo }
     *     
     */
    public RespuestaConsultaLRFacturasType.PeriodoImpositivo getPeriodoImpositivo() {
        return periodoImpositivo;
    }

    /**
     * Define el valor de la propiedad periodoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link RespuestaConsultaLRFacturasType.PeriodoImpositivo }
     *     
     */
    public void setPeriodoImpositivo(RespuestaConsultaLRFacturasType.PeriodoImpositivo value) {
        this.periodoImpositivo = value;
    }

    /**
     * Obtiene el valor de la propiedad indicadorPaginacion.
     * 
     * @return
     *     possible object is
     *     {@link IndicadorPaginacionType }
     *     
     */
    public IndicadorPaginacionType getIndicadorPaginacion() {
        return indicadorPaginacion;
    }

    /**
     * Define el valor de la propiedad indicadorPaginacion.
     * 
     * @param value
     *     allowed object is
     *     {@link IndicadorPaginacionType }
     *     
     */
    public void setIndicadorPaginacion(IndicadorPaginacionType value) {
        this.indicadorPaginacion = value;
    }

    /**
     * Obtiene el valor de la propiedad resultadoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public ResultadoConsultaType getResultadoConsulta() {
        return resultadoConsulta;
    }

    /**
     * Define el valor de la propiedad resultadoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link ResultadoConsultaType }
     *     
     */
    public void setResultadoConsulta(ResultadoConsultaType value) {
        this.resultadoConsulta = value;
    }


    /**
     *  Per�odo al que corresponden los apuntes. todos los apuntes deben corresponder al mismo per�odo impositivo 
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
     *         &lt;element name="Ejercicio" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}YearType"/>
     *         &lt;element name="Periodo" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}TipoPeriodoType"/>
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
        "ejercicio",
        "periodo"
    })
    public static class PeriodoImpositivo {

        @XmlElement(name = "Ejercicio", required = true)
        protected String ejercicio;
        @XmlElement(name = "Periodo", required = true)
        protected String periodo;

        /**
         * Obtiene el valor de la propiedad ejercicio.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEjercicio() {
            return ejercicio;
        }

        /**
         * Define el valor de la propiedad ejercicio.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEjercicio(String value) {
            this.ejercicio = value;
        }

        /**
         * Obtiene el valor de la propiedad periodo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPeriodo() {
            return periodo;
        }

        /**
         * Define el valor de la propiedad periodo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPeriodo(String value) {
            this.periodo = value;
        }

    }

}
