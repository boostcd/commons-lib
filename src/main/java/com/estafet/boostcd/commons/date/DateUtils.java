package com.estafet.boostcd.commons.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public final class DateUtils {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
	private static final Pattern datePattern = Pattern.compile("\\d{4}\\-\\d{2}-\\d{2}T\\d{2}\\:\\d{2}\\:\\d{2}Z");
	
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

	public static Date getDate(String dateString, Date defaultDate) {
		if (isValidDate(dateString)) {
			return getDate(dateString);	
		} else {
			return defaultDate;
		}
	}
	
	public static boolean isValidDate(String dateString) {
		return dateString != null && datePattern.matcher(dateString).matches();
	}

}
