package com.estafet.openshift.boost.commons.lib.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

	public static String newDate() {
		return DateUtils.dateFormat.format(new Date());
	}

	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");

}
