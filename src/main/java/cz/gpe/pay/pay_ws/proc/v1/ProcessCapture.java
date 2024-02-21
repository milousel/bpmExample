
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.CaptureRequest;
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
 *         &lt;element name="captureRequest" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}CaptureRequest"/&gt;
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
    "captureRequest"
})
@XmlRootElement(name = "processCapture")
public class ProcessCapture {

    @XmlElement(required = true)
    protected CaptureRequest captureRequest;

    /**
     * Gets the value of the captureRequest property.
     * 
     * @return
     *     possible object is
     *     {@link CaptureRequest }
     *     
     */
    public CaptureRequest getCaptureRequest() {
        return captureRequest;
    }

    /**
     * Sets the value of the captureRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaptureRequest }
     *     
     */
    public void setCaptureRequest(CaptureRequest value) {
        this.captureRequest = value;
    }

}