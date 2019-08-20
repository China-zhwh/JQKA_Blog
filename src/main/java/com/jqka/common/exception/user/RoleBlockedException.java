package com.jqka.common.exception.user;

import org.apache.tomcat.jni.User;

/**
 * @ClassName: RoleBlockedException <br/>
 * @Description: 角色锁定异常类 <br/>
 * @Date: 17:00  2019/6/3 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
public class RoleBlockedException extends UserException {
    private static final long serialVersionUID = 1L;

    public RoleBlockedException() {
        super("role.blocked", null);
    }
}
