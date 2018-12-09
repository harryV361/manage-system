package com.lee.management.service.impl;

import com.lee.management.common.service.impl.BaseServiceImpl;
import com.lee.management.entity.SysDept;
import com.lee.management.mapper.SysDeptMapper;
import com.lee.management.service.ISysDeptService;
import com.lee.management.vo.TreeVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * <p>
 * [权限管理] 部门表 服务实现类
 * </p>
 *
 * @author wang chen chen
 * @since 2018-10-23
 */

@Slf4j
@Service
public class SysDeptServiceImpl extends BaseServiceImpl<SysDept, Integer, SysDeptMapper> implements ISysDeptService {


    @Autowired
    private SysDeptMapper deptMapper;

    @Override
    public Set<TreeVo> selectAllDepts() {
        final Set<TreeVo> allDept = deptMapper.selectAllDept();
        if (!allDept.isEmpty()) {

            return TreeVo.findRoots(allDept);
        }
        return null;
    }
}
