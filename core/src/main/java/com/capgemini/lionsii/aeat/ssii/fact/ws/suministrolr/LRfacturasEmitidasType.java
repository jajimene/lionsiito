
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministrolr;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.FacturaExpedidaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.IDFacturaExpedidaType;
import com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion.RegistroSii;


/**
 * Datos correspondientes al libro de Facturas emitidas 
 * 
 * <p>Clase Java para LRfacturasEmitidasType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="LRfacturasEmitidasType">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}RegistroSii">
 *       &lt;sequence>
 *         &lt;element name="IDFactura" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}IDFacturaExpedidaType"/>
 *         &lt;element name="FacturaExpedida" type="{https://www2.agenciatributaria.gob.es/static_files/common/internet/dep/aplicaciones/es/aeat/ssii/fact/ws/SuministroInformacion.xsd}FacturaExpedidaType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LRfacturasEmitidasType", propOrder = {
    "idFactura",
    "facturaExpedida"
})
public class LRfacturasEmitidasType
    extends RegistroSii
{

    @XmlElement(name = "IDFactura", required = true)
    protected IDFacturaExpedidaType idFactura;
    @XmlElement(name = "FacturaExpedida", required = true)
    protected FacturaExpedidaType facturaExpedida;

    /**
     * Obtiene el valor de la propiedad idFactura.
     * 
     * @return
     *     possible object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public IDFacturaExpedidaType getIDFactura() {
        return idFactura;
    }

    /**
     * Define el valor de la propiedad idFactura.
     * 
     * @param value
     *     allowed object is
     *     {@link IDFacturaExpedidaType }
     *     
     */
    public void setIDFactura(IDFacturaExpedidaType value) {
        this.idFactura = value;
    }

    /**
     * Obtiene el valor de la propiedad facturaExpedida.
     * 
     * @return
     *     possible object is
     *     {@link FacturaExpedidaType }
     *     
     */
    public FacturaExpedidaType getFacturaExpedida() {
        return facturaExpedida;
    }

    /**
     * Define el valor de la propiedad facturaExpedida.
     * 
     * @param value
     *     allowed object is
     *     {@link FacturaExpedidaType }
     *     
     */
    public void setFacturaExpedida(FacturaExpedidaType value) {
        this.facturaExpedida = value;
    }

}
