package com.raymond.principles.ocp;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 20:37:10
 */
public class AlertRule {

    public AlertRule getMatchedRule(String api) {
        return this;
    }

    public int getMaxTps() {
        return 100;
    }

    public int getMaxErrorCount() {
        return 100;
    }

    public int getMaxTimeoutTps() {
        return 100;
    }
}
