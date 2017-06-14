
package com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ConsultaInformacion;


/**
 * <p>Clase Java para ConsultaCobrosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaCobrosType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ConsultaInformacion">
 *       &lt;sequence>
 *         &lt;element name="FiltroConsultaCobros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd}LRFiltroCobrosType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaCobrosType", propOrder = {
    "filtroConsultaCobros"
})
public class ConsultaCobrosType
    extends ConsultaInformacion
{

    @XmlElement(name = "FiltroConsultaCobros", required = true)
    protected LRFiltroCobrosType filtroConsultaCobros;

    /**
     * Obtiene el valor de la propiedad filtroConsultaCobros.
     * 
     * @return
     *     possible object is
     *     {@link LRFiltroCobrosType }
     *     
     */
    public LRFiltroCobrosType getFiltroConsultaCobros() {
        return filtroConsultaCobros;
    }

    /**
     * Define el valor de la propiedad filtroConsultaCobros.
     * 
     * @param value
     *     allowed object is
     *     {@link LRFiltroCobrosType }
     *     
     */
    public void setFiltroConsultaCobros(LRFiltroCobrosType value) {
        this.filtroConsultaCobros = value;
    }

}
