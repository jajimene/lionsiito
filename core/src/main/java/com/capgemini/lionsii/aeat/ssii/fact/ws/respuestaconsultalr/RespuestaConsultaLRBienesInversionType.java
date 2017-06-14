
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para RespuestaConsultaLRBienesInversionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="RespuestaConsultaLRBienesInversionType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RespuestaConsultaLRFacturasType">
 *       &lt;sequence>
 *         &lt;element name="RegistroRespuestaConsultaLRBienesInversion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/RespuestaConsultaLR.xsd}RegistroRespuestaConsultaBienesType" maxOccurs="10000" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RespuestaConsultaLRBienesInversionType", propOrder = {
    "registroRespuestaConsultaLRBienesInversion"
})
public class RespuestaConsultaLRBienesInversionType
    extends RespuestaConsultaLRFacturasType
{

    @XmlElement(name = "RegistroRespuestaConsultaLRBienesInversion")
    protected List<RegistroRespuestaConsultaBienesType> registroRespuestaConsultaLRBienesInversion;

    /**
     * Gets the value of the registroRespuestaConsultaLRBienesInversion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroRespuestaConsultaLRBienesInversion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroRespuestaConsultaLRBienesInversion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RegistroRespuestaConsultaBienesType }
     * 
     * 
     */
    public List<RegistroRespuestaConsultaBienesType> getRegistroRespuestaConsultaLRBienesInversion() {
        if (registroRespuestaConsultaLRBienesInversion == null) {
            registroRespuestaConsultaLRBienesInversion = new ArrayList<RegistroRespuestaConsultaBienesType>();
        }
        return this.registroRespuestaConsultaLRBienesInversion;
    }

}
