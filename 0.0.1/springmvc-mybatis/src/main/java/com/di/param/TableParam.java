package com.di.param;

/**
 * @author di:
 * @date 创建时间：2016年10月31日 下午6:58:01
 * @version
 */
public class TableParam {
	int pageNum = 1;
	int pageSize = 10;
	String sort;
	String order;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

}
