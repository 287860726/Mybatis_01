/**
 * @ahthor zhaocm
 * @date 2019年12月17日
 * @time 上午11:31:37
 */
package com.zhaocm.mybatis.dao;

import com.zhaocm.mybatis.entity.Employee;

/**
 * @author zhaocm
 * @data 2019年12月17日
 * @time 上午11:31:37
 */
public interface EmployeeMapper {
	
	public Employee getEmpById(Integer id);
}
