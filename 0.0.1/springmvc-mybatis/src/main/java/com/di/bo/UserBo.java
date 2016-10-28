package com.di.bo;


/** 
* @author  di: 
* @date 创建时间：2016年10月28日 下午8:57:42 
* @version
*/
public class UserBo extends BusinessObject{
	private String userName;
	private Integer userId;
	private int page=1;
	private int rows=10;
	
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
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public int getRows() {
		return rows;
	}
	public void setRows(int rows) {
		this.rows = rows;
	}
	
}
