package com.org;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TestDateTime {

	public static void main(String[] args) {
		// date will be using dd, MM, yyyy to represent date, month & year: default format is yyyy-MM-dd
		LocalDate today = LocalDate.now();
		LocalDateTime dateTime = LocalDateTime.now();
		// time will be using hh, ss, mm to represent hours, minutes & seconds
		LocalTime time = LocalTime.now();
		System.out.println("Current Date: "+today);
		System.out.println("Current Date & Time: "+dateTime);
		System.out.println("Current Time: "+time);
		// formatting date & time
		DateTimeFormatter formatterForDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		System.out.println("Formatted Date: "+today.format(formatterForDate));
		DateTimeFormatter formatterForDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
		System.out.println("Formatted DateTime: "+dateTime.format(formatterForDateTime));
		// custom dates 
		LocalDate birthday = LocalDate.parse("1998-12-25");
		System.out.println("Birthday: "+birthday);
		LocalDate anotherFormat = LocalDate.parse("20-10-1995", formatterForDate);
		System.out.println("Custom Date: "+anotherFormat);
	}

}
