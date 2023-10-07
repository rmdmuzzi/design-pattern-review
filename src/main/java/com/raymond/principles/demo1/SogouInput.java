package com.raymond.principles.demo1;

/**
 * @author raymondmuzzi
 * @since 2023-10-07 15:50:04
 */
public class SogouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }

    public void display() {
        if (skin != null) {
            skin.display();
        }
        System.out.println("Sogou input displays ...");
    }
}
