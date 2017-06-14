
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.ClaveOperacionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.PersonaFisicaJuridicaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RegistroSii;


/**
 *  Apunte correspondiente a operaciones de seguros. 
 * 
 * <p>Clase Java para LRBajaRegistroLROperacionesSegurosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRBajaRegistroLROperacionesSegurosType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}RegistroSii">
 *       &lt;sequence>
 *         &lt;element name="Contraparte" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}PersonaFisicaJuridicaType"/>
 *         &lt;element name="ClaveOperacion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}ClaveOperacionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRBajaRegistroLROperacionesSegurosType", propOrder = {
    "contraparte",
    "claveOperacion"
})
public class LRBajaRegistroLROperacionesSegurosType
    extends RegistroSii
{

    @XmlElement(name = "Contraparte", required = true)
    protected PersonaFisicaJuridicaType contraparte;
    @XmlElement(name = "ClaveOperacion", required = true)
    @XmlSchemaType(name = "string")
    protected ClaveOperacionType claveOperacion;

    /**
     * Obtiene el valor de la propiedad contraparte.
     * 
     * @return
     *     possible object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public PersonaFisicaJuridicaType getContraparte() {
        return contraparte;
    }

    /**
     * Define el valor de la propiedad contraparte.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonaFisicaJuridicaType }
     *     
     */
    public void setContraparte(PersonaFisicaJuridicaType value) {
        this.contraparte = value;
    }

    /**
     * Obtiene el valor de la propiedad claveOperacion.
     * 
     * @return
     *     possible object is
     *     {@link ClaveOperacionType }
     *     
     */
    public ClaveOperacionType getClaveOperacion() {
        return claveOperacion;
    }

    /**
     * Define el valor de la propiedad claveOperacion.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaveOperacionType }
     *     
     */
    public void setClaveOperacion(ClaveOperacionType value) {
        this.claveOperacion = value;
    }

}
