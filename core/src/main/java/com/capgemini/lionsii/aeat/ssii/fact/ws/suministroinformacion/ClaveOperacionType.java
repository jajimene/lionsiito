
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaveOperacionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaveOperacionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A"/>
 *     &lt;enumeration value="B"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaveOperacionType")
@XmlEnum
public enum ClaveOperacionType {


    /**
     * Indemnizaciones o prestaciones satisfechas superiores a 3005,06
     * 
     */
    A,

    /**
     * Primas o  contraprestaciones percibidas superiores a 3005,06
     * 
     */
    B;

    public String value() {
        return name();
    }

    public static ClaveOperacionType fromValue(String v) {
        return valueOf(v);
    }

}
