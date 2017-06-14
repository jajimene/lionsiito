
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CobrosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="CobrosType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Cobro" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}DatosPagoCobroType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CobrosType", propOrder = {
    "cobro"
})
public class CobrosType {

    @XmlElement(name = "Cobro", required = true)
    protected List<DatosPagoCobroType> cobro;

    /**
     * Gets the value of the cobro property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cobro property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCobro().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DatosPagoCobroType }
     * 
     * 
     */
    public List<DatosPagoCobroType> getCobro() {
        if (cobro == null) {
            cobro = new ArrayList<DatosPagoCobroType>();
        }
        return this.cobro;
    }

}
