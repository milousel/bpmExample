
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PaymentFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentFaultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gpe.cz/pay/pay-ws/proc/v1/type}FaultDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthCode" minOccurs="0"/&gt;
 *         &lt;element name="authResponseCode" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}AuthResponseCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentFaultDetail", propOrder = {
    "authCode",
    "authResponseCode"
})
public class PaymentFaultDetail
    extends FaultDetail
{

    protected String authCode;
    protected String authResponseCode;

    /**
     * Gets the value of the authCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthCode() {
        return authCode;
    }

    /**
     * Sets the value of the authCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthCode(String value) {
        this.authCode = value;
    }

    /**
     * Gets the value of the authResponseCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthResponseCode() {
        return authResponseCode;
    }

    /**
     * Sets the value of the authResponseCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthResponseCode(String value) {
        this.authResponseCode = value;
    }

}
