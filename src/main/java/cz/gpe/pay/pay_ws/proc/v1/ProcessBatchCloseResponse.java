
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.BatchCloseResponse;
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
 *         &lt;element name="batchCloseResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BatchCloseResponse"/&gt;
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
    "batchCloseResponse"
})
@XmlRootElement(name = "processBatchCloseResponse")
public class ProcessBatchCloseResponse {

    @XmlElement(required = true)
    protected BatchCloseResponse batchCloseResponse;

    /**
     * Gets the value of the batchCloseResponse property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCloseResponse }
     *     
     */
    public BatchCloseResponse getBatchCloseResponse() {
        return batchCloseResponse;
    }

    /**
     * Sets the value of the batchCloseResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCloseResponse }
     *     
     */
    public void setBatchCloseResponse(BatchCloseResponse value) {
        this.batchCloseResponse = value;
    }

}
