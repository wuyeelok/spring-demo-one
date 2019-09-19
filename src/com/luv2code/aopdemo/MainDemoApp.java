package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// Get bean from spring container
		AccountDAO theAccountDAO = context.getBean("defaultAccountDAOImpl", AccountDAO.class);

		// Call the business method
		theAccountDAO.addAccount();

		// Doing it again!
		System.out.println("\nLet's call it again!\n");

		// Call the business method again
		theAccountDAO.addAccount();

		// Try another bean!
		System.out.println("\nTry another bean!\n");

		// Get different bean from spring container
		AccountDAO nextAccountDAO = context.getBean("DumpDAO", AccountDAO.class);

		// Call the business method
		nextAccountDAO.addAccount();

		// Close the context
		context.close();

	}

}
