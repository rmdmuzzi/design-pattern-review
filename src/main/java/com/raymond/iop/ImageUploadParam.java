package com.raymond.iop;

import java.io.OutputStream;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 14:16:46
 */
public class ImageUploadParam {
    private OutputStream outputStream;
    private String bucketName;

    public OutputStream getOutputStream() {
        return outputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    public String getBucketName() {
        return bucketName;
    }

    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }
}
