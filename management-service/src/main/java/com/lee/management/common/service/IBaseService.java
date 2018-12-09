package com.lee.management.common.service;

import com.github.pagehelper.PageInfo;
import com.lee.management.vo.MyPage;

import java.util.List;


/**
 * @author: Wang Chen Chen
 * @Date: 2018/10/23 15:05
 * @describe：  通用service 接口
 * @version: 1.0
 */

public interface IBaseService<T, ID> {

    int deleteByPrimaryKey(ID id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(ID id);

    PageInfo<T> selectList(MyPage page);

    List selectList();

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
