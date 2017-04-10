package com.di.model;

/**
 * @author di
 */
public class AbstractModel {
	private long id;
	private boolean del;

	public boolean isDel() {
		return del;
	}

	public void setDel(boolean del) {
		this.del = del;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
