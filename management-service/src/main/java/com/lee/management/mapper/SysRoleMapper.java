package com.lee.management.mapper;

import com.lee.management.common.mapper.BaseMapper;
import com.lee.management.entity.SysRole;

import java.util.Set;

public interface SysRoleMapper extends BaseMapper<SysRole, Integer> {

    Set<SysRole> selectByUserName(String username);

}