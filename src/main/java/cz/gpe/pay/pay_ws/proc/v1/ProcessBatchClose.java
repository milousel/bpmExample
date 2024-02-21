
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.BatchCloseRequest;
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
 *         &lt;element name="batchClose" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}BatchCloseRequest"/&gt;
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
    "batchClose"
})
@XmlRootElement(name = "processBatchClose")
public class ProcessBatchClose {

    @XmlElement(required = true)
    protected BatchCloseRequest batchClose;

    /**
     * Gets the value of the batchClose property.
     * 
     * @return
     *     possible object is
     *     {@link BatchCloseRequest }
     *     
     */
    public BatchCloseRequest getBatchClose() {
        return batchClose;
    }

    /**
     * Sets the value of the batchClose property.
     * 
     * @param value
     *     allowed object is
     *     {@link BatchCloseRequest }
     *     
     */
    public void setBatchClose(BatchCloseRequest value) {
        this.batchClose = value;
    }

}
