package com.antonakospanos.oca.exam.whizlabs;

public class MyFunctionalImplementation implements MyFunctionalInterface, MyFunctionalInterface2{

	@Override
	public void execute(String s) {
		// code
	}

	@Override
	public String getName() {
		return MyFunctionalInterface.super.getName();
	}

}
