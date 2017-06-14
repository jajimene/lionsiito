
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.ConsultaCobrosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.ConsultaPagosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaAgenciasViajesType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaBienesInversionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaCobrosMetalicoType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaDetOperIntracomunitariasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaEmitidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaLROperacionesSegurosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr.LRConsultaRecibidasType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaFacturaCobrosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaFacturaPagosType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr.RespuestaConsultaLRFacturasType;


/**
 *  Sii - Suministro Inmediato de Informaci�n, compuesto por datos 
 * 			                              de contexto y una secuencia de 1 o m�s registros. 
 * 
 * <p>Clase Java para ConsultaInformacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaInformacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CabeceraConsultaSii"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaInformacion", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    LRConsultaRecibidasType.class,
    LRConsultaEmitidasType.class,
    ConsultaPagosType.class,
    LRConsultaLROperacionesSegurosType.class,
    ConsultaCobrosType.class,
    LRConsultaAgenciasViajesType.class,
    LRConsultaCobrosMetalicoType.class,
    LRConsultaBienesInversionType.class,
    LRConsultaDetOperIntracomunitariasType.class,
    RespuestaConsultaFacturaPagosType.class,
    RespuestaConsultaFacturaCobrosType.class,
    RespuestaConsultaLRFacturasType.class
})
public class ConsultaInformacion {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraConsultaSii cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraConsultaSii }
     *     
     */
    public CabeceraConsultaSii getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraConsultaSii }
     *     
     */
    public void setCabecera(CabeceraConsultaSii value) {
        this.cabecera = value;
    }

}
