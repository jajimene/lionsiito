
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroAgenciasViajesType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroBienInversionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroCobrosMetalicoType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroDetOperIntracomunitariasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroOperacionesSegurosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRFiltroRecibidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRAgenciasViajesType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaAgenciasViajesType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaBienesInversionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaCobrosMetalicoType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaExpedidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaOperacionIntracomunitariaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaRecibidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBajaRegistroLROperacionesSegurosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRBienesInversionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRCobrosMetalicoType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRFacturasRecibidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LROperacionIntracomunitariaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LROperacionesSegurosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.LRfacturasEmitidasType;


/**
 *  Informaci�n b�sica que contienen los registros del suministro de informaci�n 
 * 
 * <p>Clase Java para RegistroSii complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RegistroSii">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegistroSii", propOrder = {
    "periodoImpositivo"
})
@XmlSeeAlso({
    LRBajaExpedidasType.class,
    LRBajaRegistroLROperacionesSegurosType.class,
    LRBajaBienesInversionType.class,
    LRCobrosMetalicoType.class,
    LRAgenciasViajesType.class,
    LROperacionesSegurosType.class,
    LRFacturasRecibidasType.class,
    LRBajaOperacionIntracomunitariaType.class,
    LRfacturasEmitidasType.class,
    LRBajaRecibidasType.class,
    LRBajaCobrosMetalicoType.class,
    LRBienesInversionType.class,
    LROperacionIntracomunitariaType.class,
    LRBajaAgenciasViajesType.class,
    LRFiltroEmitidasType.class,
    LRFiltroCobrosMetalicoType.class,
    LRFiltroDetOperIntracomunitariasType.class,
    LRFiltroRecibidasType.class,
    LRFiltroBienInversionType.class,
    LRFiltroOperacionesSegurosType.class,
    LRFiltroAgenciasViajesType.class
})
public class RegistroSii {

    @XmlElement(name = "PeriodoImpositivo", required = true)
    protected RegistroSii.PeriodoImpositivo periodoImpositivo;

    /**
     * Obtiene el valor de la propiedad periodoImpositivo.
     * 
     * @return
     *     possible object is
     *     {@link RegistroSii.PeriodoImpositivo }
     *     
     */
    public RegistroSii.PeriodoImpositivo getPeriodoImpositivo() {
        return periodoImpositivo;
    }

    /**
     * Define el valor de la propiedad periodoImpositivo.
     * 
     * @param value
     *     allowed object is
     *     {@link RegistroSii.PeriodoImpositivo }
     *     
     */
    public void setPeriodoImpositivo(RegistroSii.PeriodoImpositivo value) {
        this.periodoImpositivo = value;
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
