package com.jqka.common.exception.user;

/**
 * @ClassName: UserPasswordNotMatchException <br/>
 * @Description: 用户密码不正确或不符合规范异常类 <br/>
 * @Date: 16:48  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserPasswordNotMatchException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordNotMatchException() {
        super("user.password.not.match", null);
    }

}
