
package com.capgemini.lionsii.aeat.ssii.fact.ws.suministroinformacion;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ClaveTipoComunicacionType.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * <p>
 * <pre>
 * &lt;simpleType name="ClaveTipoComunicacionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="A0"/>
 *     &lt;enumeration value="A1"/>
 *     &lt;enumeration value="A4"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ClaveTipoComunicacionType")
@XmlEnum
public enum ClaveTipoComunicacionType {


    /**
     *  A0 Alta (Se a�ade al libro un registro una nueva factura)
     * 
     */
    @XmlEnumValue("A0")
    A_0("A0"),

    /**
     *  A1 Modificaci�n (La informaci�n que se comunica sustituye a la existente relacionada)
     * 
     */
    @XmlEnumValue("A1")
    A_1("A1"),

    /**
     *  Modificaci�n Factura R�gimen de Viajeros
     * 
     */
    @XmlEnumValue("A4")
    A_4("A4");
    private final String value;

    ClaveTipoComunicacionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ClaveTipoComunicacionType fromValue(String v) {
        for (ClaveTipoComunicacionType c: ClaveTipoComunicacionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
