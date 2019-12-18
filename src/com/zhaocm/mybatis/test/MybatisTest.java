package com.zhaocm.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.zhaocm.mybatis.dao.EmployeeMapper;
import com.zhaocm.mybatis.entity.Employee;

public class MybatisTest {
	
	public SqlSessionFactory getSqlSessionFactory() throws IOException{
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		return new SqlSessionFactoryBuilder().build(inputStream);
	}
	
/*	@Test
	public void test() throws IOException {
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();

		SqlSession session = sqlSessionFactory.openSession();
		try {
			Employee employee = session.selectOne("com.zhaocm.mybatis.entity.Employee.selectEmp", 1);
			System.out.println(employee);
		} finally {
			session.close();
		}
	}*/
	
	
	@Test
	public void test01() throws IOException{
		SqlSessionFactory sqlSessionFactory = getSqlSessionFactory();
		SqlSession session = sqlSessionFactory.openSession();
		try {
			EmployeeMapper mapper = session.getMapper(EmployeeMapper.class);
			Employee emp = mapper.getEmpById(1);
			System.out.println(emp);
		} finally {
			session.close();
		}
	}
}
