package com.jqka.common.exception.user;

import com.jqka.common.exception.base.BaseException;

/**
 * @ClassName: UserException <br/>
 * @Description: 用户信息异常类 <br/>
 * @Date: 16:45  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class UserException extends BaseException {
    private static final long serialVersionUID = 1L;

    public UserException(String code, Object[] args) {
        super("user", code, args, null);
    }

}
