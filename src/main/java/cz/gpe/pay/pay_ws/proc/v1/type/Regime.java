
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Regime.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Regime"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="regular"/&gt;
 *     &lt;enumeration value="simplified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Regime")
@XmlEnum
public enum Regime {

    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("simplified")
    SIMPLIFIED("simplified");
    private final String value;

    Regime(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Regime fromValue(String v) {
        for (Regime c: Regime.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
