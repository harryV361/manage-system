package com.lee.management.controller;


import com.lee.management.common.controller.BaseController;
import com.lee.management.entity.SysDept;
import com.lee.management.service.ISysDeptService;
import com.lee.management.vo.Result;
import com.lee.management.vo.TreeVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>˙
 * [权限管理] 部门表 前端控制器
 * </p>
 *
 * @author wang chen chen
 * @since 2018-10-23H
 */

@Slf4j
@Api(tags = "部门")
@RestController
@RequestMapping("/dept")
public class SysDeptController extends BaseController<SysDept, Integer, ISysDeptService> {

    @Autowired
    private ISysDeptService deptService;

    @GetMapping("/fetchList")
    public Result<TreeVo> fetchList() {
        return Result.success(deptService.selectAllDepts());
    }


}
