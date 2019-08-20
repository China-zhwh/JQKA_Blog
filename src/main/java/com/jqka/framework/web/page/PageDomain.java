package com.jqka.framework.web.page;

import com.jqka.common.utils.StringUtils;
import lombok.Data;

/**
 * @ClassName: PageDomain <br/>
 * @Description: TODO <br/>
 * @Date: 16:39  2019/5/31 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */
@Data
public class PageDomain {
    /**
     * 当前记录起始索引
     */
    private Integer pageNum;
    /**
     * 每页显示记录数
     */
    private Integer pageSize;
    /**
     * 排序列
     */
    private String orderByColumn;
    /**
     * 排序的方向 "desc" 或者 "asc".
     */
    private String isAsc;

    public String getOrderBy() {
        if (StringUtils.isEmpty(orderByColumn)) {
            return "";
        }
        return StringUtils.toUnderScoreCase(orderByColumn) + " " + isAsc;
    }
}
