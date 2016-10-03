package com.antonakospanos.oca;

import java.io.Serializable;

import com.antonakospanos.Executor;
import com.antonakospanos.oca.arrays.examples.ArrayInitializer;
import com.antonakospanos.oca.basics.Assert;
import com.antonakospanos.oca.datatypes.examples.AutoBoxing;
import com.antonakospanos.oca.datatypes.examples.ImmutableStringWrapper;
import com.antonakospanos.oca.datatypes.examples.MutableStringWrapper;
import com.antonakospanos.ocp.Introduction;

/**
 * App created in the context of OCA training
 */
public class Main implements Serializable {
	
	private static final long serialVersionUID = 8426735796963772818L;

	public static void main(String ... args) {
		System.out.println("Hello OCA!");
		
		basics(); 		 // Module 2  DONE
		dataTypes();   // Module 3  DONE
		
		operators(); 	 // Module 4  DONE
		arrays(); 		 // Module 5  DONE
		
		loops(); 			 // Module 6  DONE
		methods(); 		 // Module 7  In Progress
		
		inheritance(); // Module 8  TODO
		exceptions();  // Module 9  TODO
		
		apis(); 			 // Module 10 TODO
		revision();
		
		introductionToOCP();
	}
	
	private static void basics() {
		System.out.println("------------------- Starting Module 2: Basics -------------------");
		Assert.testAssert(0);
		
		System.out.println("------------------- Finishing Module 2: Basics -------------------\n");
	}
	
	private static void dataTypes() {
		System.out.println("------------------- Starting Module 3: Data Types -------------------");
		
		ImmutableStringWrapper.testImmutableStringWrapper();
		MutableStringWrapper.testMutableStringWrapper();
		AutoBoxing.testAutoBoxing();
		
		System.out.println("------------------- Finishing Module 3: Date Types -------------------\n");
	}
	
	private static void operators() {
		System.out.println("------------------- Starting Module 4: Operators -------------------");

		System.out.println("Reviewed all JAVA operators");

		System.out.println("------------------- Finishing Module 4: Operators -------------------\n");
	}
	
	private static void arrays() {
		System.out.println("------------------- Starting Module 5: Arrays -------------------");

		ArrayInitializer.initializeWithSystemCopy(new int[]{1,2,3}, new int[6]);

		ArrayInitializer.initializeWithTraditionalForLoop(new int[2][3]);
		ArrayInitializer.manipulateWithForEachLoop(new int[2][3]);
		ArrayInitializer.manipulateWithForEachLoop(new Integer[2][3]);

		System.out.println("------------------- Finishing Module 5: Arrays -------------------\n");
	}
	
	private static void loops() {
		System.out.println("------------------- Starting Module 6: Loops -------------------");

		System.out.println("------------------- Finishing Module 6: Loops -------------------\n");
	}
	
	private static void methods() {
		System.out.println("------------------- Starting Module 7: Methods -------------------");

		// TODO on 2016.10.1-2
		
		System.out.println("------------------- Finishing Module 7: Methods -------------------\n");
	}
	
	private static void inheritance() {
		System.out.println("------------------- Starting Module 8: Inheritance -------------------");

		// TODO on 2016.10.8-9
		
		System.out.println("------------------- Finishing Module 8: Inheritance -------------------\n");
	}
	
	private static void exceptions() {
		System.out.println("------------------- Starting Module 9: Exceptions -------------------");

		// TODO on 2016.10.8-9

		System.out.println("------------------- Finishing Module 9: Exceptions -------------------\n");
	}
	
	private static void apis() {
		System.out.println("------------------- Starting Module 10: APIs -------------------");

		// TODO on 2016.10.15-16
		
		System.out.println("------------------- Finishing Module 10: APIs -------------------\n");
	}
	
	private static void revision() {
		// TODO on 2016.10.15-16
	}
	
	private static void introductionToOCP() {
		Executor.runStaticMethods(Introduction.class.getName());
	}
}