package com.jqka.common.exception.user;


/**
 * @ClassName: CaptchaException <br/>
 * @Description: 验证码错误异常类 <br/>
 * @Date: 16:39  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class CaptchaException extends UserException {
    private static final long serialVersionUID = 1L;

    public CaptchaException() {
        super("user.jcaptcha.error", null);
    }
}
