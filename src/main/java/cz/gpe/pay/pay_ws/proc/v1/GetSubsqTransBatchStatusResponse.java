
package cz.gpe.pay.pay_ws.proc.v1;

import cz.gpe.pay.pay_ws.proc.v1.type.SubsqTransBatchStatusResponse;
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
 *         &lt;element name="subsqTransBatchStatusResponse" type="{http://gpe.cz/pay/pay-ws/proc/v1/type}SubsqTransBatchStatusResponse"/&gt;
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
    "subsqTransBatchStatusResponse"
})
@XmlRootElement(name = "getSubsqTransBatchStatusResponse")
public class GetSubsqTransBatchStatusResponse {

    @XmlElement(required = true)
    protected SubsqTransBatchStatusResponse subsqTransBatchStatusResponse;

    /**
     * Gets the value of the subsqTransBatchStatusResponse property.
     * 
     * @return
     *     possible object is
     *     {@link SubsqTransBatchStatusResponse }
     *     
     */
    public SubsqTransBatchStatusResponse getSubsqTransBatchStatusResponse() {
        return subsqTransBatchStatusResponse;
    }

    /**
     * Sets the value of the subsqTransBatchStatusResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubsqTransBatchStatusResponse }
     *     
     */
    public void setSubsqTransBatchStatusResponse(SubsqTransBatchStatusResponse value) {
        this.subsqTransBatchStatusResponse = value;
    }

}
