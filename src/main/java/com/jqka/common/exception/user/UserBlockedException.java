package com.jqka.common.exception.user;

/**
 * @ClassName: UserBlockedException <br/>
 * @Description: 用户锁定异常类 <br/>
 * @Date: 16:57  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserBlockedException() {
        super("user.blocked", null);
    }
}
