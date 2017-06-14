
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRCobrosEmitidas;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr.SuministroLRPagosRecibidas;


/**
 *  Sii - Suministro Inmediato de Informaci�n, compuesto por datos 
 * 			                              de contexto y una secuencia de 1 o m�s registros. 
 * 
 * <p>Clase Java para SuministroInformacionCobrosPagos complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="SuministroInformacionCobrosPagos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cabecera" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}CabeceraSiiCobrosPagos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SuministroInformacionCobrosPagos", propOrder = {
    "cabecera"
})
@XmlSeeAlso({
    SuministroLRPagosRecibidas.class,
    SuministroLRCobrosEmitidas.class
})
public class SuministroInformacionCobrosPagos {

    @XmlElement(name = "Cabecera", required = true)
    protected CabeceraSiiCobrosPagos cabecera;

    /**
     * Obtiene el valor de la propiedad cabecera.
     * 
     * @return
     *     possible object is
     *     {@link CabeceraSiiCobrosPagos }
     *     
     */
    public CabeceraSiiCobrosPagos getCabecera() {
        return cabecera;
    }

    /**
     * Define el valor de la propiedad cabecera.
     * 
     * @param value
     *     allowed object is
     *     {@link CabeceraSiiCobrosPagos }
     *     
     */
    public void setCabecera(CabeceraSiiCobrosPagos value) {
        this.cabecera = value;
    }

}
