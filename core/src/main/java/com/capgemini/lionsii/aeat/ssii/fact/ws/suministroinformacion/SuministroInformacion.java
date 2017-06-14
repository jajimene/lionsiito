
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRAgenciasViajes;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRBienesInversion;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRCobrosMetalico;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRDetOperacionIntracomunitaria;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasEmitidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRFacturasRecibidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLROperacionesSeguros;


/**
 *  Sii - Suministro Inmediato de Informaci�n, compuesto por datos 
 * 			                              de contexto y una secuencia de 1 o m�s registros. 
 * 
 * <p>Clase Java para SuministroInformacion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SuministroInformacion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CabeceraSii"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuministroInformacion", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    SuministroLRDetOperacionIntracomunitaria.class,
    SuministroLRBienesInversion.class,
    SuministroLRFacturasEmitidas.class,
    SuministroLRFacturasRecibidas.class,
    SuministroLROperacionesSeguros.class,
    SuministroLRAgenciasViajes.class,
    SuministroLRCobrosMetalico.class
})
public class SuministroInformacion {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraSii cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSii }
     *     
     */
    public CabeceraSii getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSii }
     *     
     */
    public void setCabecera(CabeceraSii value) {
        this.cabecera = value;
    }

}
