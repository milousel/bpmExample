
package cz.gpe.pay.pay_ws.proc.v1;

import javax.xml.namespace.QName;
import cz.gpe.pay.pay_ws.proc.v1.type.CardOnFilePaymentFaultDetail;
import cz.gpe.pay.pay_ws.proc.v1.type.EchoFaultDetail;
import cz.gpe.pay.pay_ws.proc.v1.type.FaultDetail;
import cz.gpe.pay.pay_ws.proc.v1.type.PaymentFaultDetail;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the cz.gpe.pay.pay_ws.proc.v1 package. 
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

    private final static QName _EchoServiceException_QNAME = new QName("http://gpe.cz/pay/pay-ws/proc/v1", "echoServiceException");
    private final static QName _ServiceException_QNAME = new QName("http://gpe.cz/pay/pay-ws/proc/v1", "serviceException");
    private final static QName _PaymentServiceException_QNAME = new QName("http://gpe.cz/pay/pay-ws/proc/v1", "paymentServiceException");
    private final static QName _CardOnFilePaymentServiceException_QNAME = new QName("http://gpe.cz/pay/pay-ws/proc/v1", "cardOnFilePaymentServiceException");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: cz.gpe.pay.pay_ws.proc.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Echo }
     * 
     */
    public Echo createEcho() {
        return new Echo();
    }

    /**
     * Create an instance of {@link EchoResponse }
     * 
     */
    public EchoResponse createEchoResponse() {
        return new EchoResponse();
    }

    /**
     * Create an instance of {@link GetPaymentStatus }
     * 
     */
    public GetPaymentStatus createGetPaymentStatus() {
        return new GetPaymentStatus();
    }

    /**
     * Create an instance of {@link GetPaymentStatusResponse }
     * 
     */
    public GetPaymentStatusResponse createGetPaymentStatusResponse() {
        return new GetPaymentStatusResponse();
    }

    /**
     * Create an instance of {@link GetPaymentLinkStatus }
     * 
     */
    public GetPaymentLinkStatus createGetPaymentLinkStatus() {
        return new GetPaymentLinkStatus();
    }

    /**
     * Create an instance of {@link GetPaymentLinkStatusResponse }
     * 
     */
    public GetPaymentLinkStatusResponse createGetPaymentLinkStatusResponse() {
        return new GetPaymentLinkStatusResponse();
    }

    /**
     * Create an instance of {@link GetMasterPaymentStatus }
     * 
     */
    public GetMasterPaymentStatus createGetMasterPaymentStatus() {
        return new GetMasterPaymentStatus();
    }

    /**
     * Create an instance of {@link GetMasterPaymentStatusResponse }
     * 
     */
    public GetMasterPaymentStatusResponse createGetMasterPaymentStatusResponse() {
        return new GetMasterPaymentStatusResponse();
    }

    /**
     * Create an instance of {@link ProcessMasterPaymentRevoke }
     * 
     */
    public ProcessMasterPaymentRevoke createProcessMasterPaymentRevoke() {
        return new ProcessMasterPaymentRevoke();
    }

    /**
     * Create an instance of {@link ProcessMasterPaymentRevokeResponse }
     * 
     */
    public ProcessMasterPaymentRevokeResponse createProcessMasterPaymentRevokeResponse() {
        return new ProcessMasterPaymentRevokeResponse();
    }

    /**
     * Create an instance of {@link RevokePaymentLink }
     * 
     */
    public RevokePaymentLink createRevokePaymentLink() {
        return new RevokePaymentLink();
    }

    /**
     * Create an instance of {@link RevokePaymentLinkResponse }
     * 
     */
    public RevokePaymentLinkResponse createRevokePaymentLinkResponse() {
        return new RevokePaymentLinkResponse();
    }

    /**
     * Create an instance of {@link GetPaymentDetail }
     * 
     */
    public GetPaymentDetail createGetPaymentDetail() {
        return new GetPaymentDetail();
    }

    /**
     * Create an instance of {@link GetPaymentDetailResponse }
     * 
     */
    public GetPaymentDetailResponse createGetPaymentDetailResponse() {
        return new GetPaymentDetailResponse();
    }

    /**
     * Create an instance of {@link ProcessAuthorizationReverse }
     * 
     */
    public ProcessAuthorizationReverse createProcessAuthorizationReverse() {
        return new ProcessAuthorizationReverse();
    }

    /**
     * Create an instance of {@link ProcessAuthorizationReverseResponse }
     * 
     */
    public ProcessAuthorizationReverseResponse createProcessAuthorizationReverseResponse() {
        return new ProcessAuthorizationReverseResponse();
    }

    /**
     * Create an instance of {@link ProcessBatchClose }
     * 
     */
    public ProcessBatchClose createProcessBatchClose() {
        return new ProcessBatchClose();
    }

    /**
     * Create an instance of {@link ProcessBatchCloseResponse }
     * 
     */
    public ProcessBatchCloseResponse createProcessBatchCloseResponse() {
        return new ProcessBatchCloseResponse();
    }

    /**
     * Create an instance of {@link ProcessRefund }
     * 
     */
    public ProcessRefund createProcessRefund() {
        return new ProcessRefund();
    }

    /**
     * Create an instance of {@link ProcessRefundResponse }
     * 
     */
    public ProcessRefundResponse createProcessRefundResponse() {
        return new ProcessRefundResponse();
    }

    /**
     * Create an instance of {@link ProcessRefundReverse }
     * 
     */
    public ProcessRefundReverse createProcessRefundReverse() {
        return new ProcessRefundReverse();
    }

    /**
     * Create an instance of {@link ProcessRefundReverseResponse }
     * 
     */
    public ProcessRefundReverseResponse createProcessRefundReverseResponse() {
        return new ProcessRefundReverseResponse();
    }

    /**
     * Create an instance of {@link ProcessPaymentDelete }
     * 
     */
    public ProcessPaymentDelete createProcessPaymentDelete() {
        return new ProcessPaymentDelete();
    }

    /**
     * Create an instance of {@link ProcessPaymentDeleteResponse }
     * 
     */
    public ProcessPaymentDeleteResponse createProcessPaymentDeleteResponse() {
        return new ProcessPaymentDeleteResponse();
    }

    /**
     * Create an instance of {@link ProcessCapture }
     * 
     */
    public ProcessCapture createProcessCapture() {
        return new ProcessCapture();
    }

    /**
     * Create an instance of {@link ProcessCaptureResponse }
     * 
     */
    public ProcessCaptureResponse createProcessCaptureResponse() {
        return new ProcessCaptureResponse();
    }

    /**
     * Create an instance of {@link ProcessCaptureReverse }
     * 
     */
    public ProcessCaptureReverse createProcessCaptureReverse() {
        return new ProcessCaptureReverse();
    }

    /**
     * Create an instance of {@link ProcessCaptureReverseResponse }
     * 
     */
    public ProcessCaptureReverseResponse createProcessCaptureReverseResponse() {
        return new ProcessCaptureReverseResponse();
    }

    /**
     * Create an instance of {@link ProcessPaymentClose }
     * 
     */
    public ProcessPaymentClose createProcessPaymentClose() {
        return new ProcessPaymentClose();
    }

    /**
     * Create an instance of {@link ProcessPaymentCloseResponse }
     * 
     */
    public ProcessPaymentCloseResponse createProcessPaymentCloseResponse() {
        return new ProcessPaymentCloseResponse();
    }

    /**
     * Create an instance of {@link ProcessRecurringPayment }
     * 
     */
    public ProcessRecurringPayment createProcessRecurringPayment() {
        return new ProcessRecurringPayment();
    }

    /**
     * Create an instance of {@link ProcessRecurringPaymentResponse }
     * 
     */
    public ProcessRecurringPaymentResponse createProcessRecurringPaymentResponse() {
        return new ProcessRecurringPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessUsageBasedPayment }
     * 
     */
    public ProcessUsageBasedPayment createProcessUsageBasedPayment() {
        return new ProcessUsageBasedPayment();
    }

    /**
     * Create an instance of {@link ProcessUsageBasedPaymentResponse }
     * 
     */
    public ProcessUsageBasedPaymentResponse createProcessUsageBasedPaymentResponse() {
        return new ProcessUsageBasedPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessRegularSubscriptionPayment }
     * 
     */
    public ProcessRegularSubscriptionPayment createProcessRegularSubscriptionPayment() {
        return new ProcessRegularSubscriptionPayment();
    }

    /**
     * Create an instance of {@link ProcessRegularSubscriptionPaymentResponse }
     * 
     */
    public ProcessRegularSubscriptionPaymentResponse createProcessRegularSubscriptionPaymentResponse() {
        return new ProcessRegularSubscriptionPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessUsageBasedSubscriptionPayment }
     * 
     */
    public ProcessUsageBasedSubscriptionPayment createProcessUsageBasedSubscriptionPayment() {
        return new ProcessUsageBasedSubscriptionPayment();
    }

    /**
     * Create an instance of {@link ProcessUsageBasedSubscriptionPaymentResponse }
     * 
     */
    public ProcessUsageBasedSubscriptionPaymentResponse createProcessUsageBasedSubscriptionPaymentResponse() {
        return new ProcessUsageBasedSubscriptionPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessPrepaidPayment }
     * 
     */
    public ProcessPrepaidPayment createProcessPrepaidPayment() {
        return new ProcessPrepaidPayment();
    }

    /**
     * Create an instance of {@link ProcessPrepaidPaymentResponse }
     * 
     */
    public ProcessPrepaidPaymentResponse createProcessPrepaidPaymentResponse() {
        return new ProcessPrepaidPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessCardOnFilePayment }
     * 
     */
    public ProcessCardOnFilePayment createProcessCardOnFilePayment() {
        return new ProcessCardOnFilePayment();
    }

    /**
     * Create an instance of {@link ProcessCardOnFilePaymentResponse }
     * 
     */
    public ProcessCardOnFilePaymentResponse createProcessCardOnFilePaymentResponse() {
        return new ProcessCardOnFilePaymentResponse();
    }

    /**
     * Create an instance of {@link CreatePaymentLink }
     * 
     */
    public CreatePaymentLink createCreatePaymentLink() {
        return new CreatePaymentLink();
    }

    /**
     * Create an instance of {@link CreatePaymentLinkResponse }
     * 
     */
    public CreatePaymentLinkResponse createCreatePaymentLinkResponse() {
        return new CreatePaymentLinkResponse();
    }

    /**
     * Create an instance of {@link MpsPreCheckout }
     * 
     */
    public MpsPreCheckout createMpsPreCheckout() {
        return new MpsPreCheckout();
    }

    /**
     * Create an instance of {@link MpsPreCheckoutResponse }
     * 
     */
    public MpsPreCheckoutResponse createMpsPreCheckoutResponse() {
        return new MpsPreCheckoutResponse();
    }

    /**
     * Create an instance of {@link MpsExpressCheckout }
     * 
     */
    public MpsExpressCheckout createMpsExpressCheckout() {
        return new MpsExpressCheckout();
    }

    /**
     * Create an instance of {@link MpsExpressCheckoutResponse }
     * 
     */
    public MpsExpressCheckoutResponse createMpsExpressCheckoutResponse() {
        return new MpsExpressCheckoutResponse();
    }

    /**
     * Create an instance of {@link ResolvePaymentStatus }
     * 
     */
    public ResolvePaymentStatus createResolvePaymentStatus() {
        return new ResolvePaymentStatus();
    }

    /**
     * Create an instance of {@link ResolvePaymentStatusResponse }
     * 
     */
    public ResolvePaymentStatusResponse createResolvePaymentStatusResponse() {
        return new ResolvePaymentStatusResponse();
    }

    /**
     * Create an instance of {@link GetTokenStatus }
     * 
     */
    public GetTokenStatus createGetTokenStatus() {
        return new GetTokenStatus();
    }

    /**
     * Create an instance of {@link GetTokenStatusResponse }
     * 
     */
    public GetTokenStatusResponse createGetTokenStatusResponse() {
        return new GetTokenStatusResponse();
    }

    /**
     * Create an instance of {@link ProcessTokenRevoke }
     * 
     */
    public ProcessTokenRevoke createProcessTokenRevoke() {
        return new ProcessTokenRevoke();
    }

    /**
     * Create an instance of {@link ProcessTokenRevokeResponse }
     * 
     */
    public ProcessTokenRevokeResponse createProcessTokenRevokeResponse() {
        return new ProcessTokenRevokeResponse();
    }

    /**
     * Create an instance of {@link ProcessTokenPayment }
     * 
     */
    public ProcessTokenPayment createProcessTokenPayment() {
        return new ProcessTokenPayment();
    }

    /**
     * Create an instance of {@link ProcessTokenPaymentResponse }
     * 
     */
    public ProcessTokenPaymentResponse createProcessTokenPaymentResponse() {
        return new ProcessTokenPaymentResponse();
    }

    /**
     * Create an instance of {@link ProcessPayoutWinning }
     * 
     */
    public ProcessPayoutWinning createProcessPayoutWinning() {
        return new ProcessPayoutWinning();
    }

    /**
     * Create an instance of {@link ProcessPayoutWinningResponse }
     * 
     */
    public ProcessPayoutWinningResponse createProcessPayoutWinningResponse() {
        return new ProcessPayoutWinningResponse();
    }

    /**
     * Create an instance of {@link ProcessPayoutInsurance }
     * 
     */
    public ProcessPayoutInsurance createProcessPayoutInsurance() {
        return new ProcessPayoutInsurance();
    }

    /**
     * Create an instance of {@link ProcessPayoutInsuranceResponse }
     * 
     */
    public ProcessPayoutInsuranceResponse createProcessPayoutInsuranceResponse() {
        return new ProcessPayoutInsuranceResponse();
    }

    /**
     * Create an instance of {@link ProcessPayout }
     * 
     */
    public ProcessPayout createProcessPayout() {
        return new ProcessPayout();
    }

    /**
     * Create an instance of {@link ProcessPayoutResponse }
     * 
     */
    public ProcessPayoutResponse createProcessPayoutResponse() {
        return new ProcessPayoutResponse();
    }

    /**
     * Create an instance of {@link GetSubsqTransBatchStatus }
     * 
     */
    public GetSubsqTransBatchStatus createGetSubsqTransBatchStatus() {
        return new GetSubsqTransBatchStatus();
    }

    /**
     * Create an instance of {@link GetSubsqTransBatchStatusResponse }
     * 
     */
    public GetSubsqTransBatchStatusResponse createGetSubsqTransBatchStatusResponse() {
        return new GetSubsqTransBatchStatusResponse();
    }

    /**
     * Create an instance of {@link GetCardData }
     * 
     */
    public GetCardData createGetCardData() {
        return new GetCardData();
    }

    /**
     * Create an instance of {@link GetCardDataResponse }
     * 
     */
    public GetCardDataResponse createGetCardDataResponse() {
        return new GetCardDataResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EchoFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EchoFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://gpe.cz/pay/pay-ws/proc/v1", name = "echoServiceException")
    public JAXBElement<EchoFaultDetail> createEchoServiceException(EchoFaultDetail value) {
        return new JAXBElement<EchoFaultDetail>(_EchoServiceException_QNAME, EchoFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://gpe.cz/pay/pay-ws/proc/v1", name = "serviceException")
    public JAXBElement<FaultDetail> createServiceException(FaultDetail value) {
        return new JAXBElement<FaultDetail>(_ServiceException_QNAME, FaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PaymentFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://gpe.cz/pay/pay-ws/proc/v1", name = "paymentServiceException")
    public JAXBElement<PaymentFaultDetail> createPaymentServiceException(PaymentFaultDetail value) {
        return new JAXBElement<PaymentFaultDetail>(_PaymentServiceException_QNAME, PaymentFaultDetail.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CardOnFilePaymentFaultDetail }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CardOnFilePaymentFaultDetail }{@code >}
     */
    @XmlElementDecl(namespace = "http://gpe.cz/pay/pay-ws/proc/v1", name = "cardOnFilePaymentServiceException")
    public JAXBElement<CardOnFilePaymentFaultDetail> createCardOnFilePaymentServiceException(CardOnFilePaymentFaultDetail value) {
        return new JAXBElement<CardOnFilePaymentFaultDetail>(_CardOnFilePaymentServiceException_QNAME, CardOnFilePaymentFaultDetail.class, null, value);
    }

}
