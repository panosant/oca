package com.antonakospanos;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Executor {
	
	public static void runStaticMethods(String className) {
		Class<?> classz;
		try {
			classz = (Class<?>) Class.forName(className);
			Stream.of(classz.getMethods())
			.filter(m -> m.getParameterCount() == 0)
			.filter(m -> !m.getName().equals("notifyAll"))
			.filter(m -> !m.getName().equals("notify"))
			.filter(m -> !m.getName().equals("wait"))
			.forEach(m -> {
				// Nested stream to list all method's parameter names
				System.out.println("The Method '" 
						+ m.getName() + "' requires the following " 
						+ m.getParameterCount() + " parameters: " + 
						Stream.of(m.getParameters())
							.map(Parameter::getName)
		          // :: is called 'Method Reference' operator
		          // creates a function that can be applied.
							// E.g:
		          // Function<Parameter, String> f = Parameter::getName;
							// String name = f.apply();
							//
		          // Instead we could use:
							//.map(p -> p.getName()) 
							.collect(Collectors.toList())
							.toString() + "\n"
						);
				try {
					m.invoke(classz.newInstance());
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | InstantiationException e) {
					e.printStackTrace();
				}
			});
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}
	}
}