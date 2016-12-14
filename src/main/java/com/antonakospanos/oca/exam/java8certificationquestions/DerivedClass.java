package com.antonakospanos.oca.exam.java8certificationquestions;

public class DerivedClass extends BaseClass {

	public DerivedClass(int x) {
		super(x);
		
		integer = 0; // Visible by inheritance!
		BaseClass bc = new BaseClass(0);
		bc.integer = 1; // Visible cause DerivedClass and BaseClass are in the same package!
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
