package com.raymond.principles.demo1;

/**
 * @author raymondmuzzi
 * @since 2023-10-07 15:50:49
 */
public class Client {
    public static void main(String[] args) {
        SogouInput sogouInput = new SogouInput();
        sogouInput.setSkin(new DefaultSkin());
        sogouInput.display();
    }
}
