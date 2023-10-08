package com.raymond.iop;

import java.awt.*;
import java.util.UUID;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 14:19:12
 */
public class AliyunImageStore implements ImageStore {

    @Override
    public String upload(ImageUploadParam imageUploadParam) {
        checkUploadParam(imageUploadParam);
        String token = getAccessToken();
        createBucketIfNotExist(imageUploadParam.getBucketName());
        // upload image
        return UUID.randomUUID().toString();
    }

    @Override
    public Image download(ImageDownloadParam imageDownloadParam) {
        String token = getAccessToken();
        // download image
        return null;
    }

    private void checkUploadParam(ImageUploadParam imageUploadParam) {
    }

    private void createBucketIfNotExist(String bucketName) {
    }

    private String getAccessToken() {
        return null;
    }
}
