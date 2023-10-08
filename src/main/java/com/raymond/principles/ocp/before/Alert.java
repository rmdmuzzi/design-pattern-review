package com.raymond.principles.ocp.before;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 20:36:58
 */
public class Alert {
    private final AlertRule rule;
    private final Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api, long requestCount, long errorCount, long timeoutCount, long durationOfSeconds) {
        long tps = requestCount / durationOfSeconds;
        AlertRule aRule = rule.getMatchedRule(api);
        if (tps > aRule.getMaxTps()) {
            notification.notify("URGENCY", "...");
        }
        if (errorCount > aRule.getMaxErrorCount()) {
            notification.notify("SEVERE", "...");
        }
        long timeoutTps = timeoutCount / durationOfSeconds;
        if (timeoutTps > aRule.getMaxTimeoutTps()) {
            notification.notify("URGENCY", "...");
        }
    }
}
