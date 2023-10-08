package com.raymond.principles.ocp.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 21:50:11
 */
public class Alert {
    private List<AlertHandler> alertHandlerList = new ArrayList<>();

    public void addAlertHandler(AlertHandler alertHandler) {
        alertHandlerList.add(alertHandler);
    }

    public void check(ApiStatInfo apiStatInfo) {
        for (AlertHandler alertHandler : alertHandlerList) {
            alertHandler.check(apiStatInfo);
        }
    }
}
