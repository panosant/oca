package com.antonakospanos.oca.exam.whizlabs;

import java.util.function.Predicate;

public class LamdaWithoutArgs {
	
	public static void evaluate() {
		
		Runnable r1 = () -> {System.out.println("Run!");};	// Lamda without any args!
		Runnable r2 = () -> System.out.println("Run!");			// Lamda without any args!
		
		Predicate<String> containsA1 = (s) -> { return s.indexOf("a") > 0; };
		Predicate<String> containsA2 = s -> { return s.indexOf("a") > 0; };
		// INVALID cause return statements must be encapsulated in curling braces! 
		// Predicate<String> containsA2 = s -> return s.indexOf("a") > 0;
		
	}
}