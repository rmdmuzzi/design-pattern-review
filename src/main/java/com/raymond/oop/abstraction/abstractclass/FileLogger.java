package com.raymond.oop.abstraction.abstractclass;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:36:16
 */
public class FileLogger extends Logger {
    private Writer writer;

    public FileLogger(String name, boolean enabled, int minPermittedLevel, String filePath) {
        super(name, enabled, minPermittedLevel);
        try {
            this.writer = new FileWriter(filePath);
        } catch (IOException e) {
            throw new RuntimeException("Log file path: " + filePath + " is not valid.");
        }
    }

    @Override
    protected void doLog(int level, String message) {
        try {
            writer.write(message);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
