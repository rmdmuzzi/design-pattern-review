package com.raymond.principles.ocp.after;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 21:50:22
 */
public abstract class AlertHandler {

    protected AlertRule rule;

    protected Notification notification;

    public AlertHandler(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    /**
     * check the api
     *
     * @param apiStatInfo {@link ApiStatInfo}
     */
    public abstract void check(ApiStatInfo apiStatInfo);
}
