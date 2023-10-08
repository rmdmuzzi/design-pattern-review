package com.raymond.iop;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 14:24:46
 */
public class Client {
    public static void main(String[] args) {
        ImageProcessHandler imageProcessHandler = new ImageProcessHandler(new PrivateImageStore());
        imageProcessHandler.process();
    }
}
