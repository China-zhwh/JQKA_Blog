package com.jqka.project.system.user.controller;

import com.jqka.framework.web.controller.BaseController;
import com.jqka.project.system.user.entity.SysUserEntity;
import com.jqka.project.system.user.service.SysUserService;
import com.jqka.framework.web.page.TableDataInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName: SysUserController <br/>
 * @Description: 用户 ServiceImpl层 <br/>
 * @Date: 15:30  2019/5/31 <br/>
 * @Author JQKA_Blog  < zhwh > <br/>
 * @Version 1.0
 * @Since JDK 1.8
 */

@Controller
@RequestMapping("/system/user")
public class SysUserController extends BaseController {
    private String prefix = "system/user";

    @Autowired
    private SysUserService sysUserService;

    @GetMapping("/list")
    @ResponseBody
    public TableDataInfo selectUserList(SysUserEntity sysUserEntity){
        startPage();
        List<SysUserEntity> sysUserEntityList = sysUserService.selectUserList(sysUserEntity);
        return getDataTable(sysUserEntityList);
    }

}
