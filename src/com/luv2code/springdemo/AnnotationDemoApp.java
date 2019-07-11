package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get the bean from spring container
		Coach myCoach = context.getBean("tennisCoach", Coach.class); // Default bean id
		Coach mySwimCoach = context.getBean("Kelvin_Chan", Coach.class); // Explicit bean id

		// Call a method on the bean
		System.out.println(myCoach.getDailyWorkout());
		System.out.println(mySwimCoach.getDailyWorkout());

		// Close the context
		context.close();
	}

}
