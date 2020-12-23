
package it.unisa;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per tipo.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="tipo">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="COMUNICAZIONE"/>
 *     &lt;enumeration value="INNOVAZIONE"/>
 *     &lt;enumeration value="AMMINISTRAZIONE"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "tipo")
@XmlEnum
public enum Tipo {

    COMUNICAZIONE,
    INNOVAZIONE,
    AMMINISTRAZIONE;

    public String value() {
        return name();
    }

    public static Tipo fromValue(String v) {
        return valueOf(v);
    }

}
