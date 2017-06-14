
package com.capgemini.lionsii.aeat.ssii.fact.ws.consultalr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ConsultaInformacion;


/**
 * <p>Clase Java para ConsultaPagosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="ConsultaPagosType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ConsultaInformacion">
 *       &lt;sequence>
 *         &lt;element name="FiltroConsultaPagos" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/ConsultaLR.xsd}LRFiltroPagosType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultaPagosType", propOrder = {
    "filtroConsultaPagos"
})
public class ConsultaPagosType
    extends ConsultaInformacion
{

    @XmlElement(name = "FiltroConsultaPagos", required = true)
    protected LRFiltroPagosType filtroConsultaPagos;

    /**
     * Obtiene el valor de la propiedad filtroConsultaPagos.
     * 
     * @return
     *     possible object is
     *     {@link LRFiltroPagosType }
     *     
     */
    public LRFiltroPagosType getFiltroConsultaPagos() {
        return filtroConsultaPagos;
    }

    /**
     * Define el valor de la propiedad filtroConsultaPagos.
     * 
     * @param value
     *     allowed object is
     *     {@link LRFiltroPagosType }
     *     
     */
    public void setFiltroConsultaPagos(LRFiltroPagosType value) {
        this.filtroConsultaPagos = value;
    }

}
