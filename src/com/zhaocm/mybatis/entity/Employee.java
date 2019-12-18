/**
 * @ahthor zhaocm
 * @date 2019年12月16日
 * @time 下午9:00:05
 */
package com.zhaocm.mybatis.entity;

/**
 * @author zhaocm
 * @data 2019年12月16日
 * @time 下午9:00:05
 */
public class Employee {
	private Integer id;
	private String lastName;
	private String email;
	private String gender;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", lastName=" + lastName + ", email=" + email + ", gender=" + gender + "]";
	}
	
	
}
