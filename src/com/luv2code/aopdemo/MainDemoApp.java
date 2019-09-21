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
		AccountDAO nextAccountDAO = context.getBean("DumpDAO", AccountDAO.class);

		// Get membership bean from spring container
		MembershipDAO theMembershipDAO = context.getBean("membershipDAOImpl", MembershipDAO.class);

		// Call the Account DAO method
		theAccountDAO.addAccount();
		nextAccountDAO.addAccount();

		// Call the membership business method
		theMembershipDAO.addAccount();

		// Close the context
		context.close();

	}

}
