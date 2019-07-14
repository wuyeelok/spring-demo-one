package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EX7Main {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EX7Config.class);

		Coach ex7Coach = context.getBean("ex7Coach", Coach.class);

		System.out.println(ex7Coach.getDailyFortune());

		System.out.println(ex7Coach.getDailyWorkout());

		context.close();

	}

}
