package com.antonakospanos.oca.exam.java8certificationquestions;

public class DerivedClass extends BaseClass {
	
	private int privateInteger;
	protected int protectedInteger; // DOES NOT override the super.protectedInteger as in method overriding!

	public DerivedClass(int x) {
		super(x);
		
		protectedInteger = 0; // Visible directly!
		super.protectedInteger = 0; // Visible by inheritance!
		
		BaseClass bc = new BaseClass(0);
		// bc.protectedInteger = 1; // NOT Visible cause we are NOT in BaseClass!!!
		bc.protectedInteger = 2; // Visible cause DerivedClass and BaseClass are in the same package!
		
		DerivedClass dc = new DerivedClass(0);
		dc.privateInteger = 1;	 // Visible cause we are in BaseClass!!!
		dc.protectedInteger = 2; // Visible cause cause we are in com.antonakospanos.oca.exam.java8certificationquestions package!
	}

	@Override
	// INVALID: public static void method() {		// overriden method cannot be modified from instance method to class method
	// INVALID: public int method() {						// overriden method cannot change return type
	// INVALID: private void method() {					// overriden method cannot restrict the access modifier
	// VALID: protected void method() {
	// VALID: public final void method() {
	public void method() {
		// code
	}
	
	// @Overloaded method
	public void method(String s) {
		// code
	}
	
	// @Overloaded method
	public final void method(Integer i) throws Exception {
		// code
	}
	
	// @Overloaded method
	public static final void method(Integer i, String s) {
		// code
	}
}
