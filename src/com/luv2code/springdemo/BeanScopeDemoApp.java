package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// Load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");

		// Retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same bean
		boolean result = theCoach.equals(alphaCoach);

		System.out.println("\nPointing to the same object " + result);

		System.out.println("\nMemorty location for theCoach " + theCoach);

		System.out.println("\nMemorty location for alphaCoach " + alphaCoach);

		// Close context
		context.close();
	}

}
