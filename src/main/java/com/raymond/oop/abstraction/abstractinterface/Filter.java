package com.raymond.oop.abstraction.abstractinterface;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:42:50
 */
public interface Filter {
    /**
     * Filter rpc request
     *
     * @param rpcRequest {@link RpcRequest} rpc request
     * @throws RpcException rpc exception
     */
    void doFilter(RpcRequest rpcRequest) throws RpcException;
}
