package com.luv2code.aopdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.luv2code.aopdemo.dao.AccountDAO;
import com.luv2code.aopdemo.dao.MembershipDAO;

public class MainDemoApp {

	public static void main(String[] args) {

		// Read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);

		// Get bean from spring container
		AccountDAO theAccountDAO = context.getBean("defaultAccountDAOImpl", AccountDAO.class);

		// Get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAOImpl", MembershipDAO.class);

		// Call the business method
		theAccountDAO.addAccount();

		// Doing it again!
		System.out.println("\nLet's call it again!\n");

		// Call the business method again
		theAccountDAO.addAccount();

		// Call the membership business method
		theMembershipDAO.addAccount();

		// Close the context
		context.close();

	}

}
