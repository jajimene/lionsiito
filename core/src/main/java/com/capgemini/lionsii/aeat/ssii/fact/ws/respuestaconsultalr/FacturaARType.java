
package com.capgemini.lionsii.aeat.ssii.fact.ws.respuestaconsultalr;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para FacturaARType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="FacturaARType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="S"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FacturaARType")
@XmlEnum
public enum FacturaARType {

    S,
    N;

    public String value() {
        return name();
    }

    public static FacturaARType fromValue(String v) {
        return valueOf(v);
    }

}
