package com.raymond.principles.ocp.after;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 22:00:17
 */
public class TpsAlertHandler extends AlertHandler {

    public TpsAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getTps() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()) {
            notification.notify("URGENCY", "...");
        }
    }
}
