package com.jqka.common.utils;

import com.jqka.common.utils.spring.SpringUtils;
import org.springframework.context.MessageSource;

/**
 * @ClassName: MessageUtils <br/>
 * @Description: TODO <br/>
 * @Date: 16:42  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class MessageUtils {
    /**
     * 根据消息键和参数 获取消息 委托给spring messageSource
     *
     * @param code 消息键
     * @param args 参数
     * @return
     */
    public static String message(String code, Object... args) {
        MessageSource messageSource = SpringUtils.getBean(MessageSource.class);
        return messageSource.getMessage(code, args, null);
    }
}
