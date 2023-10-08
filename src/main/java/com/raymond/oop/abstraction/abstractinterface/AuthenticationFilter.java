package com.raymond.oop.abstraction.abstractinterface;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:44:04
 */
public class AuthenticationFilter implements Filter {
    @Override
    public void doFilter(RpcRequest rpcRequest) throws RpcException {
        System.out.println("AuthenticationFilter: check the request pass the authentication?");
    }
}
