package com.raymond.principles.ocp.after;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 22:13:09
 */
public class Client {
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
