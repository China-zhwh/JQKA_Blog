package com.jqka.framework.web.page;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @ClassName: TableDataInfo <br/>
 * @Description: 表格分页数据对象 <br/>
 * @Date: 16:17  2019/5/31 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
@Data
public class TableDataInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 总记录数
     */
    private long total;
    /**
     * 列表数据
     */
    private List<?> rows;
    /**
     * 消息状态码
     */
    private int code;

    /**
     * 表格数据对象
     */
    public TableDataInfo() {
    }

    /**
     * 分页
     *
     * @param list  列表数据
     * @param total 总记录数
     */
    public TableDataInfo(List<?> list, int total) {
        this.rows = list;
        this.total = total;
    }
}
