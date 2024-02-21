package cz.claimcloud.user.constant;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class QRCodeContant {
    public static final String imageFormat = "image";
    public static final String fileFormat = "file";

    public static final Integer accountLength = 16;

    public static List<String> allowQRFormat() {
        List<String> formats = new ArrayList<>();
        formats.add(imageFormat);
        formats.add(fileFormat);
        return formats;
    }

    public static final String header = "SPD";
    public static final String version = "1.0";
    public static final String iban = "ACC";
    public static final String amount = "AM";
    public static final String currency = "CC";
    public static final String dueDate = "DT";
    public static final String instantPayment = "PT";
    public static final String message = "MSG";
    public static final String variableSymbol = "X-VS";
    public static final String specificSymbol = "X-SS";
    public static final String constantSymbol = "X-KS";

    public static final String instantPaymentValue = "IP";
}
