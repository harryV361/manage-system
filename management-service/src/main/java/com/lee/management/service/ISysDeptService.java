package com.lee.management.service;


import com.lee.management.common.service.IBaseService;
import com.lee.management.entity.SysDept;
import com.lee.management.vo.TreeVo;

import java.util.Set;

/**
 * <p>
 * [权限管理] 部门表 服务类
 * </p>
 *
 * @author wang chen chen
 * @since 2018-10-23
 */

public interface ISysDeptService extends IBaseService<SysDept, Integer> {

    Set<TreeVo> selectAllDepts();

}
