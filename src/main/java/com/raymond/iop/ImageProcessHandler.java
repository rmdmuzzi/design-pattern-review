package com.raymond.iop;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 14:22:35
 */
public class ImageProcessHandler {

    private static final String BUCKET_NAME = "COUPON_IMAGE";

    private final ImageStore imageStore;

    public ImageProcessHandler(ImageStore imageStore) {
        this.imageStore = imageStore;
    }

    public void process() {
        if (imageStore == null) {
            throw new RuntimeException("Image store is null, please set it before using...");
        }
        ImageUploadParam imageUploadParam = new ImageUploadParam();
        imageUploadParam.setBucketName(BUCKET_NAME);
        imageUploadParam.setOutputStream(null);
        imageStore.upload(imageUploadParam);
    }

}
