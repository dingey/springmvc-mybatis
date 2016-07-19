package com.fm.interceptor;

import java.util.Map;

public class UserInfo {
	private Integer userId;
	private Integer roleId;
	private String roleName;
	private String userName;
	private String personName;
	Map<String, String> authority;

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Map<String, String> getAuthority() {
		return authority;
	}

	public void setAuthority(Map<String, String> authority) {
		this.authority = authority;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

}
