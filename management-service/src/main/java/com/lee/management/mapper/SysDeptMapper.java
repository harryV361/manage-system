package com.lee.management.mapper;

import com.lee.management.common.mapper.BaseMapper;
import com.lee.management.entity.SysDept;
import com.lee.management.vo.TreeVo;

import java.util.Set;

public interface SysDeptMapper extends BaseMapper<SysDept, Integer> {

    /**
     * 查询所有部门
     *
     * @return
     */
    Set<TreeVo> selectAllDept();


}