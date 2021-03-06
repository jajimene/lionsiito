
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaConsultaLROperacionesSegurosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLROperacionesSegurosType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRFacturasType">
 *       &lt;sequence>
 *         &lt;element name="RegistroRespuestaConsultaLROperacionesSeguros" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaOperacionesSegurosType" maxOccurs="10000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLROperacionesSegurosType", propOrder = {
    "registroRespuestaConsultaLROperacionesSeguros"
})
public class RespuestaConsultaLROperacionesSegurosType
    extends RespuestaConsultaLRFacturasType
{

    @XmlElement(name = "RegistroRespuestaConsultaLROperacionesSeguros")
    protected List<RegistroRespuestaConsultaOperacionesSegurosType> registroRespuestaConsultaLROperacionesSeguros;

    /**
     * Gets the value of the registroRespuestaConsultaLROperacionesSeguros property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaLROperacionesSeguros property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaLROperacionesSeguros().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaOperacionesSegurosType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaOperacionesSegurosType> getRegistroRespuestaConsultaLROperacionesSeguros() {
        if (registroRespuestaConsultaLROperacionesSeguros == null) {
            registroRespuestaConsultaLROperacionesSeguros = new ArrayList<RegistroRespuestaConsultaOperacionesSegurosType>();
        }
        return this.registroRespuestaConsultaLROperacionesSeguros;
    }

}
