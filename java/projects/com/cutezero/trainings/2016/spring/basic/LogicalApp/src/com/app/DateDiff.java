package com.app;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class DateDiff {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
		String inputDate1 = "23 01 1997";
		String inputDate2 = "12 06 1997";

		try {
			Date date1 = sdf.parse(inputDate1);
			Date date2 = sdf.parse(inputDate2);
			long diff = (date2.getTime() - date1.getTime());
			System.out.println ("Days: " + TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS));
		} catch (Exception e) {
			e.printStackTrace();
		}
	 }
	}
