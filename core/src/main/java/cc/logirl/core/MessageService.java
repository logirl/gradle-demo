package cc.logirl.core;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by xinxi on 2016/11/6.
 */
public class MessageService {

    public String getMessage() {
        System.out.println(StringUtils.isBlank("aaa"));
        return "Hello World!";
    }
}
