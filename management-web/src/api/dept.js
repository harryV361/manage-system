/**
 * Created by harry on 2018/12/9.
 */

import request from '@/utils/request'

// 查询部门
export function fetchList() {
  return request({ url: '/dept/fetchList', method: 'get'})
}
