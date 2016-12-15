package com.antonakospanos.oca.exam.java8certificationquestions;

public class Switch {
	
	private static final int THREE = 3;
	
	public static void evaluate(int x) {
		final int j;
		j = 10;
		
		switch (x) {
			default: System.out.println("default");// evaluated explicitly in case no "case" matches. Without break; however the execution will continue to case 0 and 1! 
			case 0: System.out.println("0");
			case 1: System.out.println("1"); break;
			
			case 2: System.out.println("2"); break;
			case THREE: System.out.println("3"); break; // break is optional here (it's the last case)
//			case j: INVALID! case expressions must be constant expressions!
		}
	}
}