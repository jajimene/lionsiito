
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.SuministroInformacion;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}SuministroInformacion">
 *       &lt;sequence>
 *         &lt;element name="RegistroLRDetOperacionIntracomunitaria" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroLR.xsd}LROperacionIntracomunitariaType" maxOccurs="10000"/>
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
    "registroLRDetOperacionIntracomunitaria"
})
@XmlRootElement(name = "SuministroLRDetOperacionIntracomunitaria")
public class SuministroLRDetOperacionIntracomunitaria
    extends SuministroInformacion
{

    @XmlElement(name = "RegistroLRDetOperacionIntracomunitaria", required = true)
    protected List<LROperacionIntracomunitariaType> registroLRDetOperacionIntracomunitaria;

    /**
     * Gets the value of the registroLRDetOperacionIntracomunitaria property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the registroLRDetOperacionIntracomunitaria property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRegistroLRDetOperacionIntracomunitaria().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LROperacionIntracomunitariaType }
     * 
     * 
     */
    public List<LROperacionIntracomunitariaType> getRegistroLRDetOperacionIntracomunitaria() {
        if (registroLRDetOperacionIntracomunitaria == null) {
            registroLRDetOperacionIntracomunitaria = new ArrayList<LROperacionIntracomunitariaType>();
        }
        return this.registroLRDetOperacionIntracomunitaria;
    }

}
