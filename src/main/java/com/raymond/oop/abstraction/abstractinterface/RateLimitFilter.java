package com.raymond.oop.abstraction.abstractinterface;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:44:55
 */
public class RateLimitFilter implements Filter {
    @Override
    public void doFilter(RpcRequest rpcRequest) throws RpcException {
        System.out.println("RateLimitFilter: if exceed the rate limit, prevent the request!");
    }
}
