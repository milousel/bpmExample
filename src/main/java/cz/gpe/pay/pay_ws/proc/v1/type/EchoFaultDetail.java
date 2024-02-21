
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EchoFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EchoFaultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="primaryReturnCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReturnCode"/&gt;
 *         &lt;element name="secondaryReturnCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}ReturnCode"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EchoFaultDetail", propOrder = {
    "primaryReturnCode",
    "secondaryReturnCode"
})
public class EchoFaultDetail {

    protected int primaryReturnCode;
    protected int secondaryReturnCode;

    /**
     * Gets the value of the primaryReturnCode property.
     * 
     */
    public int getPrimaryReturnCode() {
        return primaryReturnCode;
    }

    /**
     * Sets the value of the primaryReturnCode property.
     * 
     */
    public void setPrimaryReturnCode(int value) {
        this.primaryReturnCode = value;
    }

    /**
     * Gets the value of the secondaryReturnCode property.
     * 
     */
    public int getSecondaryReturnCode() {
        return secondaryReturnCode;
    }

    /**
     * Sets the value of the secondaryReturnCode property.
     * 
     */
    public void setSecondaryReturnCode(int value) {
        this.secondaryReturnCode = value;
    }

}
