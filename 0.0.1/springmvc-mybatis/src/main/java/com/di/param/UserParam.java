package com.di.param;

/**
 * @author di:
 * @date 创建时间：2016年10月31日 下午6:55:25
 * @version
 */
public class UserParam extends DataGridParam {
	private String userName;
	private Integer userId;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

}
