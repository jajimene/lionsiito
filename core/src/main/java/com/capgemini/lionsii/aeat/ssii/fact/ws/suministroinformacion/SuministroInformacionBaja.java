
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRAgenciasViajes;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRBienesInversion;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRCobrosMetalico;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRDetOperacionIntracomunitaria;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRFacturasEmitidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLRFacturasRecibidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.BajaLROperacionesSeguros;


/**
 *  Sii - Suministro Inmediato de Informaci�n, compuesto por datos 
 * 			                              de contexto y una secuencia de 1 o m�s registros. 
 * 
 * <p>Clase Java para SuministroInformacionBaja complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SuministroInformacionBaja">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CabeceraSiiBaja"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuministroInformacionBaja", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    BajaLRAgenciasViajes.class,
    BajaLRCobrosMetalico.class,
    BajaLRFacturasRecibidas.class,
    BajaLRDetOperacionIntracomunitaria.class,
    BajaLRBienesInversion.class,
    BajaLROperacionesSeguros.class,
    BajaLRFacturasEmitidas.class
})
public class SuministroInformacionBaja {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraSiiBaja cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSiiBaja }
     *     
     */
    public CabeceraSiiBaja getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSiiBaja }
     *     
     */
    public void setCabecera(CabeceraSiiBaja value) {
        this.cabecera = value;
    }

}
