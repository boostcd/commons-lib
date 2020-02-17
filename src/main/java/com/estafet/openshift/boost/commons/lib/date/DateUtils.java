package com.estafet.openshift.boost.commons.lib.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

	public static String newDate() {
		return DateUtils.dateFormat.format(new Date());
	}
	
	public static Date getDate(String date) {
		try {
			return dateFormat.parse(date);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

}
