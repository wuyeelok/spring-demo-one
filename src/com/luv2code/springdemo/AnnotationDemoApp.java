package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		// Read spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// Get the bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class); // Default bean id

		// Call a method on the bean
		System.out.println(theCoach.getDailyWorkout());

		// Call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

		// Close the context
		context.close();
	}

}
