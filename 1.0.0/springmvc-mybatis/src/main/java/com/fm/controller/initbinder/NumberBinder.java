package com.fm.controller.initbinder;

import java.beans.PropertyEditorSupport;
import org.springframework.util.StringUtils;

public class NumberBinder extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (!(StringUtils.hasText(text))) {
			setValue(null);
		}else{
			
		}
	}

	@Override
	public String getAsText() {
		return super.getAsText();
	}
}
