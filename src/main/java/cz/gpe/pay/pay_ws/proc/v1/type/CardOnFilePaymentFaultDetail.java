
package cz.gpe.pay.pay_ws.proc.v1.type;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardOnFilePaymentFaultDetail complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardOnFilePaymentFaultDetail"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://gpe.cz/pay/pay-ws/proc/v1/type}FaultDetail"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="authenticationLink" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardOnFilePaymentFaultDetail", propOrder = {
    "authenticationLink"
})
public class CardOnFilePaymentFaultDetail
    extends FaultDetail
{

    protected String authenticationLink;

    /**
     * Gets the value of the authenticationLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthenticationLink() {
        return authenticationLink;
    }

    /**
     * Sets the value of the authenticationLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthenticationLink(String value) {
        this.authenticationLink = value;
    }

}
