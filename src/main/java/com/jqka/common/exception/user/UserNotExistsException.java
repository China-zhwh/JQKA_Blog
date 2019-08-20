package com.jqka.common.exception.user;

/**
 * @ClassName: UserNotExistsException <br/>
 * @Description: 用户不存在异常类 <br/>
 * @Date: 16:45  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserNotExistsException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserNotExistsException() {
        super("user.not.exists", null);
    }
}
