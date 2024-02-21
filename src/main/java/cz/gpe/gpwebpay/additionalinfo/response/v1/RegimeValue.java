
package cz.gpe.gpwebpay.additionalinfo.response.v1;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for regimeValue.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="regimeValue"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="regular"/&gt;
 *     &lt;enumeration value="simplified"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "regimeValue")
@XmlEnum
public enum RegimeValue {

    @XmlEnumValue("regular")
    REGULAR("regular"),
    @XmlEnumValue("simplified")
    SIMPLIFIED("simplified");
    private final String value;

    RegimeValue(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegimeValue fromValue(String v) {
        for (RegimeValue c: RegimeValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
