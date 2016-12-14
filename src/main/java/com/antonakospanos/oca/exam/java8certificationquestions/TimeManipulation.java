package com.antonakospanos.oca.exam.java8certificationquestions;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class TimeManipulation {
	
	public static void diffInstants() {
		Instant t1 = Instant.now();
		// code with delay
		Instant t2 = Instant.now();
		
		Duration dt = Duration.between(t1, t2);
		Duration aux = Duration.ofDays(1);
		dt.plus(aux);
	}
	
	public static void diffDateTimes() {
		LocalDateTime ldt = LocalDateTime.now();
		LocalDate ld = LocalDate.now();
		LocalTime lt = LocalTime.now();
		
		Period p = Period.ofDays(1);
		ldt.plus(p);
		ld.plus(p);
		lt.plus(p);
	}
}