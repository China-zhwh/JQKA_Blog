package com.jqka.common.exception.user;

/**
 * @ClassName: UserPasswordRetryLimitExceedException <br/>
 * @Description: 用户错误最大次数异常类 <br/>
 * @Date: 16:49  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserPasswordRetryLimitExceedException extends UserException {
    private static final long serialVersionUID = 1L;

    public UserPasswordRetryLimitExceedException(int retryLimitCount) {
        super("user.password.retry.limit.exceed", new Object[]{retryLimitCount});
    }
}
