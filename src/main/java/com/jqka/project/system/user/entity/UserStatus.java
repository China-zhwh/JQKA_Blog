package com.jqka.project.system.user.entity;

/**
 * ClassName: UserStatus <br/>
 * Description: 用户状态 <br/>
 * date: 2019/6/3 17:18<br/>
 *
 * @author zhwh<br />
 * @since JDK 1.8
 */
public enum UserStatus {
    /**
     * 正常状态
     */
    OK("0", "正常"),
    /**
     * 停用状态
     */
    DISABLE("1", "停用"),
    /**
     * 已删除状态
     */
    DELETED("2", "删除");

    private final String code;
    private final String info;

    UserStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
