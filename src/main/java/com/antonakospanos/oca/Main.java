package com.antonakospanos.oca;

import java.io.Serializable;

import com.antonakospanos.oca.basics.Assert;
import com.antonakospanos.oca.datatypes.*;

/**
 * App created in the context of OCA training
 */
public class Main implements Serializable {
	
	private static final long serialVersionUID = 8426735796963772818L;
	private static final char alpha = 'a';
	private static final char άλφα = 'α';

	public static void main(String ... args) {
		System.out.println("Hello World!");
		
		basics(); 		 // Module 2  DONE
		dataTypes();   // Module 3  DONE
		operators(); 	 // Module 4  TODO
		arrays(); 		 // Module 5  TODO
		loops(); 			 // Module 6  TODO
		methods(); 		 // Module 7  TODO
		inheritance(); // Module 8  TODO
		exceptions();  // Module 9  TODO
		apis(); 			 // Module 10 TODO
		revision();
	}
	
	private static void basics() {
		Assert.testAssert(0);
	}
	
	private static void dataTypes() {
		ImmutableStringWrapper.testImmutableStringWrapper();
		MutableStringWrapper.testMutableStringWrapper();
	}
	
	private static void operators() {
		// TODO on 2016.09.19-23
	}
	
	private static void arrays() {
		// TODO on 2016.09.24-25
	}
	
	private static void loops() {
		// TODO on 2016.10.26-30
	}
	
	private static void methods() {
		// TODO on 2016.10.1-2
	}
	
	private static void inheritance() {
		// TODO on 2016.10.3-7
	}
	
	private static void exceptions() {
		// TODO on 2016.10.8-9
	}
	
	private static void apis() {
		// TODO on 2016.10.10-14
	}
	
	private static void revision() {
		// TODO on 2016.10.15-16
	}
}