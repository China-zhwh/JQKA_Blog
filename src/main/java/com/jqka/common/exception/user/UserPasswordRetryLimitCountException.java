package com.jqka.common.exception.user;

/**
 * @ClassName: UserPasswordRetryLimitCountException <br/>
 * @Description: 用户错误记数异常类 <br/>
 * @Date: 16:53  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserPasswordRetryLimitCountException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitCountException(int retryLimitCount) {
        super("user.password.retry.limit.count", new Object[]{retryLimitCount});
    }
}
