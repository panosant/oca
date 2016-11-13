package com.antonakospanos.oca.exam;

import com.antonakospanos.oca.exam.gocertify.InstanceOf;
import com.antonakospanos.oca.exam.gocertify.Octal;
import com.antonakospanos.oca.exam.gocertify.TwoDimensionalArray;
import com.antonakospanos.oca.exam.oracle.Exceptions;
import com.antonakospanos.oca.exam.oracle.Love;
import com.antonakospanos.oca.exam.oracle.Programmer;

public class Revision {
	
	public static void main (String... args) {
		// Oracle official example
		Programmer.ex3();
		Exceptions.ex7();
		Love.find();
		
		// gortefy.com
		InstanceOf.evaluate();
		Octal.evaluate();
		new TwoDimensionalArray();
		// Variable identifiers (names) can explicitly start with a letter, a dollar mark or an underscore!
	}
}
