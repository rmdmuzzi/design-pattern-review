package com.raymond.principles.ocp.after;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 22:10:42
 */
public class TimeoutAlertHandler extends AlertHandler {

    public TimeoutAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getTimeoutTps() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()) {
            notification.notify("URGENCY", "...");
        }
    }
}
