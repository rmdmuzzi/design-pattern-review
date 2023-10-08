package com.raymond.oop.abstraction.abstractclass;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:33:42
 */
public abstract class Logger {
    private String name;
    private boolean enabled;
    private int minPermittedLevel;

    public Logger(String name, boolean enabled, int minPermittedLevel) {
        this.name = name;
        this.enabled = enabled;
        this.minPermittedLevel = minPermittedLevel;
    }

    public void log(int level, String message) {
        boolean enableLog = enabled && (level <= minPermittedLevel);
        if (!enableLog) {
            return;
        }
        doLog(level, message);
    }

    /**
     * Execute log
     *
     * @param level   log level
     * @param message log message
     */
    protected abstract void doLog(int level, String message);
}
