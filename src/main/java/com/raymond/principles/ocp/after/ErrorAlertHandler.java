package com.raymond.principles.ocp.after;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 22:03:44
 */
public class ErrorAlertHandler extends AlertHandler {

    public ErrorAlertHandler(AlertRule rule, Notification notification) {
        super(rule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        if (apiStatInfo.getErrorCount() > rule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()) {
            notification.notify("SEVERE", "...");
        }
    }
}
