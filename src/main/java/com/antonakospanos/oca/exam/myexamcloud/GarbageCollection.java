package com.antonakospanos.oca.exam.myexamcloud;

public class GarbageCollection {
	
	public static void testGC() {
		
		Integer one = new Integer(1);
		Integer two = new Integer(2);
		
		one = two; // new Integer(1) is eligible for GC to collect! No reference pointing to the object new Integer(1) anymore!
		one = null; // new Integer(2) is still referred by variable two: new Integer(2) is still not eligible for GC!
	}
	// The stack variables (pointers to the Integer objects) one and two are out of scope here, so they are discarded!
	// The Integer objects are out of scope (hence, no reference pointing to them) and are eligible for GC!
}