
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CaptureResponse;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="captureResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureResponse"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "captureResponse"
})
@XmlRootElement(name = "processCaptureResponse")
public class ProcessCaptureResponse {

    @XmlElement(required = true)
    protected CaptureResponse captureResponse;

    /**
     * Gets the value of the captureResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureResponse }
     *     
     */
    public CaptureResponse getCaptureResponse() {
        return captureResponse;
    }

    /**
     * Sets the value of the captureResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureResponse }
     *     
     */
    public void setCaptureResponse(CaptureResponse value) {
        this.captureResponse = value;
    }

}
