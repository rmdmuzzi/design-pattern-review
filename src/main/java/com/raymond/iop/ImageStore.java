package com.raymond.iop;

import java.awt.*;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 14:16:11
 */
public interface ImageStore {

    /***
     * Image upload method
     * @param imageUploadParam upload param
     * @return image id
     */
    String upload(ImageUploadParam imageUploadParam);

    /**
     * Image download method
     *
     * @param imageDownloadParam download param
     * @return image object
     */
    Image download(ImageDownloadParam imageDownloadParam);
}
