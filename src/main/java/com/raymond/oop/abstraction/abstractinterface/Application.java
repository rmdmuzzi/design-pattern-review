package com.raymond.oop.abstraction.abstractinterface;

import java.util.Arrays;
import java.util.List;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:45:06
 */
public class Application {

    private static List<Filter> filterList = Arrays.asList(
            new AuthenticationFilter(),
            new RateLimitFilter()
    );

    private static void handleRpcRequest(RpcRequest rpcRequest) {
        try {
            for (Filter filter : filterList) {
                filter.doFilter(rpcRequest);
            }
        } catch (RpcException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        RpcRequest rpcRequest = new RpcRequest();
        handleRpcRequest(rpcRequest);
    }
}
