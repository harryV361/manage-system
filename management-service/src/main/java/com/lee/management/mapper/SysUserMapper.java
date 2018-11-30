package com.lee.management.mapper;

import com.lee.management.common.mapper.BaseMapper;
import com.lee.management.entity.SysUser;

public interface SysUserMapper extends BaseMapper<SysUser, String> {

    SysUser selectByUserName(String username);

}