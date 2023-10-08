package com.raymond.principles.ocp.after;

import com.raymond.principles.ocp.AlertRule;
import com.raymond.principles.ocp.Notification;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 22:05:24
 */
public class ApplicationContext {
    private AlertRule rule;
    private Notification notification;
    private Alert alert;

    private void initBeans() {
        rule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addAlertHandler(new TpsAlertHandler(rule, notification));
        alert.addAlertHandler(new ErrorAlertHandler(rule, notification));
    }

    public Alert getAlert() {
        return alert;
    }

    private static final ApplicationContext INSTANCE = new ApplicationContext();

    private ApplicationContext() {
        initBeans();
    }

    public static ApplicationContext getInstance() {
        return INSTANCE;
    }
}
