package com.raymond.oop.abstraction.abstractclass;

/**
 * @author raymondmuzzi
 * @since 2023-10-08 12:39:43
 */
public class MessageQueueLogger extends Logger {
    private MessageQueueClient messageQueueClient;

    public MessageQueueLogger(String name, boolean enabled,
                              int minPermittedLevel, MessageQueueClient messageQueueClient) {
        super(name, enabled, minPermittedLevel);
        this.messageQueueClient = messageQueueClient;
    }

    @Override
    protected void doLog(int level, String message) {
        messageQueueClient.send(message);
    }
}
