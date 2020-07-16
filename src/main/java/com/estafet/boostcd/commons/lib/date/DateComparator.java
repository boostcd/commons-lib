package com.estafet.boostcd.commons.lib.date;

import java.util.Comparator;
import java.util.Date;

public class DateComparator implements Comparator<Date> {

	@Override
	public int compare(Date date1, Date date2) {
		return date1.compareTo(date2);
	}

}
