package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// Get the bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class); // Default bean id

		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		String code = context.getBean("passCode", String.class);
		System.out.println(code);

		// Close the context
		context.close();
	}

}
