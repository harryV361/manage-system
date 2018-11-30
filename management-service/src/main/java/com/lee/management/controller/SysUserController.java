package com.lee.management.controller;


import com.lee.management.common.controller.BaseController;
import com.lee.management.entity.SysUser;
import com.lee.management.service.ISysUserService;
import com.lee.management.vo.Result;
import com.lee.management.vo.SysUserVo;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * [权限管理] 用户表 前端控制器
 * </p>
 *
 * @author wang chen chen
 * @since 2018-10-23
 */

@Slf4j
@Api(tags = "用户")
@RestController
@RequestMapping("/user")
public class SysUserController extends BaseController<SysUser, String, ISysUserService> {

    @GetMapping("/findByUsername")
    public SysUser findByUsername(@RequestParam String username) {
        return baseService.findByUsername(username);
    }

    @GetMapping("/info")
    public Result<SysUserVo> info() {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        SysUserVo userInfo = baseService.findUserInfo(userDetails.getUsername());
        return Result.success(userInfo);
    }


}
