
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.BienDeInversionType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.IDFacturaComunitariaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RegistroSii;


/**
 * Datos correspondientes al libro de Bienes de inversi�n
 * 
 * <p>Clase Java para LRBienesInversionType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRBienesInversionType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}RegistroSii">
 *       &lt;sequence>
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaComunitariaType"/>
 *         &lt;element name="BienesInversion" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}BienDeInversionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRBienesInversionType", propOrder = {
    "idFactura",
    "bienesInversion"
})
public class LRBienesInversionType
    extends RegistroSii
{

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaComunitariaType idFactura;
    @XmlElement(name = "BienesInversion", required = true)
    protected BienDeInversionType bienesInversion;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaComunitariaType }
     *     
     */
    public IDFacturaComunitariaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaComunitariaType }
     *     
     */
    public void setIDFactura(IDFacturaComunitariaType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad bienesInversion.
     * 
     * @return
     *     possible object is
     *     {@link BienDeInversionType }
     *     
     */
    public BienDeInversionType getBienesInversion() {
        return bienesInversion;
    }

    /**
     * Define el valor de la propiedad bienesInversion.
     * 
     * @param value
     *     allowed object is
     *     {@link BienDeInversionType }
     *     
     */
    public void setBienesInversion(BienDeInversionType value) {
        this.bienesInversion = value;
    }

}
