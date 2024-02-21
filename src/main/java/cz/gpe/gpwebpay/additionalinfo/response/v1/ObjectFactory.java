
package cz.gpe.gpwebpay.additionalinfo.response.v1;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.gpe.gpwebpay.additionalinfo.response.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AdditionalInfoResponse_QNAME = new QName("http://gpe.cz/gpwebpay/additionalInfo/response/v1", "additionalInfoResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.gpe.gpwebpay.additionalinfo.response.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse }
     * 
     */
    public AdditionalInfoResponse createAdditionalInfoResponse() {
        return new AdditionalInfoResponse();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.CardsDetails }
     * 
     */
    public AdditionalInfoResponse.CardsDetails createAdditionalInfoResponseCardsDetails() {
        return new AdditionalInfoResponse.CardsDetails();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.Contact }
     * 
     */
    public AdditionalInfoResponse.Contact createAdditionalInfoResponseContact() {
        return new AdditionalInfoResponse.Contact();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.BillingDetails }
     * 
     */
    public AdditionalInfoResponse.BillingDetails createAdditionalInfoResponseBillingDetails() {
        return new AdditionalInfoResponse.BillingDetails();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.ShippingDetails }
     * 
     */
    public AdditionalInfoResponse.ShippingDetails createAdditionalInfoResponseShippingDetails() {
        return new AdditionalInfoResponse.ShippingDetails();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.LoyaltyProgramDetails }
     * 
     */
    public AdditionalInfoResponse.LoyaltyProgramDetails createAdditionalInfoResponseLoyaltyProgramDetails() {
        return new AdditionalInfoResponse.LoyaltyProgramDetails();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.EetRegistrationData }
     * 
     */
    public AdditionalInfoResponse.EetRegistrationData createAdditionalInfoResponseEetRegistrationData() {
        return new AdditionalInfoResponse.EetRegistrationData();
    }

    /**
     * Create an instance of {@link AdditionalInfoResponse.CardsDetails.CardDetail }
     * 
     */
    public AdditionalInfoResponse.CardsDetails.CardDetail createAdditionalInfoResponseCardsDetailsCardDetail() {
        return new AdditionalInfoResponse.CardsDetails.CardDetail();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditionalInfoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AdditionalInfoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://gpe.cz/gpwebpay/additionalInfo/response/v1", name = "additionalInfoResponse")
    public JAXBElement<AdditionalInfoResponse> createAdditionalInfoResponse(AdditionalInfoResponse value) {
        return new JAXBElement<AdditionalInfoResponse>(_AdditionalInfoResponse_QNAME, AdditionalInfoResponse.class, null, value);
    }

}
