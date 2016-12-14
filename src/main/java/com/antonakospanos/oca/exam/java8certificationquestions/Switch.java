package com.antonakospanos.oca.exam.java8certificationquestions;

public class Switch {
	
	private static final int THREE = 3;
	
	public static void evaluate(int x) {
		final int j;
		j = 10;
		
		switch (x) {
			default: System.out.println("default");break; //evaluated in case no case matches
			case 0: System.out.println("0");
			case 1: System.out.println("1"); break;
			
			case 2: System.out.println("2"); break;
			case THREE: System.out.println("3"); break; 
//			case j: INVALID! case expressions must be constant expressions!
		}
	}
}