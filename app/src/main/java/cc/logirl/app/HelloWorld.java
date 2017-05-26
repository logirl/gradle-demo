package cc.logirl.app;

import cc.logirl.core.MessageService;
import org.apache.log4j.Logger;

/**
 * Created by xinxi on 2016/11/6.
 */
public class HelloWorld {
    private static final Logger LOGGER = Logger.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        MessageService messageService = new MessageService();
        String message = messageService.getMessage();
        LOGGER.info("Received message: " + message);
    }
}
