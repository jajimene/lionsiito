
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para CausaExencionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="CausaExencionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="E1"/>
 *     &lt;enumeration value="E2"/>
 *     &lt;enumeration value="E3"/>
 *     &lt;enumeration value="E4"/>
 *     &lt;enumeration value="E5"/>
 *     &lt;enumeration value="E6"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CausaExencionType")
@XmlEnum
public enum CausaExencionType {


    /**
     * EXENTA por Art. 20 
     * 
     */
    @XmlEnumValue("E1")
    E_1("E1"),

    /**
     * EXENTA por Art. 21
     * 
     */
    @XmlEnumValue("E2")
    E_2("E2"),

    /**
     * EXENTA por Art. 22
     * 
     */
    @XmlEnumValue("E3")
    E_3("E3"),

    /**
     * EXENTA por Art. 24
     * 
     */
    @XmlEnumValue("E4")
    E_4("E4"),

    /**
     * EXENTA por Art. 25
     * 
     */
    @XmlEnumValue("E5")
    E_5("E5"),

    /**
     * EXENTA otros
     * 
     */
    @XmlEnumValue("E6")
    E_6("E6");
    private final String value;

    CausaExencionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CausaExencionType fromValue(String v) {
        for (CausaExencionType c: CausaExencionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
