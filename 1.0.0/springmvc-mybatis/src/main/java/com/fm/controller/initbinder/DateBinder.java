package com.fm.controller.initbinder;

import java.beans.PropertyEditorSupport;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.util.StringUtils;

public class DateBinder extends PropertyEditorSupport {
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		if (!(StringUtils.hasText(text))) {
			setValue(null);
		} else {
			try {
				setValue(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(text));
			} catch (ParseException ex) {
				try {
					setValue(new SimpleDateFormat("yyyy-MM-dd").parse(text));
				} catch (ParseException e) {
					setValue(new Date());
				}
			}
		}
	}

	@Override
	public String getAsText() {
		Date value = (Date) getValue();
		return ((value != null) ? new SimpleDateFormat("yyyy-MM-dd").format(value) : "");
	}
}