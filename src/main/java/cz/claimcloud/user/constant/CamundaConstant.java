package cz.claimcloud.user.constant;

import org.springframework.stereotype.Component;

@Component
public class CamundaConstant {

    public static String[] allowAcitivityTypes() {
        return new String[]{"StartEvent", "Activity", "Event", "Gateway", "EndEvent"};
    }
}
