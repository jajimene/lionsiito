
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.SuministroInformacionCobrosPagos;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}SuministroInformacionCobrosPagos">
 *       &lt;sequence>
 *         &lt;element name="RegistroLRPagos" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd}LRPagosEmitidasType" maxOccurs="10000"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "registroLRPagos"
})
@XmlRootElement(name = "SuministroLRPagosRecibidas")
public class SuministroLRPagosRecibidas
    extends SuministroInformacionCobrosPagos
{

    @XmlElement(name = "RegistroLRPagos", required = true)
    protected List<LRPagosEmitidasType> registroLRPagos;

    /**
     * Gets the value of the registroLRPagos property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroLRPagos property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroLRPagos().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LRPagosEmitidasType }
     * 
     * 
     */
    public List<LRPagosEmitidasType> getRegistroLRPagos() {
        if (registroLRPagos == null) {
            registroLRPagos = new ArrayList<LRPagosEmitidasType>();
        }
        return this.registroLRPagos;
    }

}
