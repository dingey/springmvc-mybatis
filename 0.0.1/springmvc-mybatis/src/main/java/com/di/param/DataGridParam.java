package com.di.param;

/**
 * @author di:
 * @date 创建时间：2016年10月31日 下午5:20:41
 * @version
 */
public class DataGridParam {
	private int page = 1;
	private int rows = 10;
	private String sort;
	private String order;

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
