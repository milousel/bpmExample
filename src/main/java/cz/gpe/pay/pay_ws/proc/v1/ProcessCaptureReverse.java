
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CaptureReverseRequest;
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
 *         &lt;element name="captureReverseRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureReverseRequest"/&gt;
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
    "captureReverseRequest"
})
@XmlRootElement(name = "processCaptureReverse")
public class ProcessCaptureReverse {

    @XmlElement(required = true)
    protected CaptureReverseRequest captureReverseRequest;

    /**
     * Gets the value of the captureReverseRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureReverseRequest }
     *     
     */
    public CaptureReverseRequest getCaptureReverseRequest() {
        return captureReverseRequest;
    }

    /**
     * Sets the value of the captureReverseRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureReverseRequest }
     *     
     */
    public void setCaptureReverseRequest(CaptureReverseRequest value) {
        this.captureReverseRequest = value;
    }

}
