
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CaptureReverseResponse;
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
 *         &lt;element name="captureReverseResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureReverseResponse"/&gt;
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
    "captureReverseResponse"
})
@XmlRootElement(name = "processCaptureReverseResponse")
public class ProcessCaptureReverseResponse {

    @XmlElement(required = true)
    protected CaptureReverseResponse captureReverseResponse;

    /**
     * Gets the value of the captureReverseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureReverseResponse }
     *     
     */
    public CaptureReverseResponse getCaptureReverseResponse() {
        return captureReverseResponse;
    }

    /**
     * Sets the value of the captureReverseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureReverseResponse }
     *     
     */
    public void setCaptureReverseResponse(CaptureReverseResponse value) {
        this.captureReverseResponse = value;
    }

}
