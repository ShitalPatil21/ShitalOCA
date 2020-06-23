package com.capgemini.oca.corrected;

import java.text.Format;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LocalDateTime dt=LocalDateTime.of(2014,7,31,1,1);
         dt.plusDays(30);
         dt.plusMonths(1);
         System.out.println(dt(DateTimeFormatter.ISO_DATE));
	}

	private static char[] dt(DateTimeFormatter isoDate) {
		// TODO Auto-generated method stub
		return null;
	}

}
