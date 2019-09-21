package com.luv2code.aopdemo.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyDemoLoggingAspect {

	// This is where we add all of our related advice for logging

	// Let's start with an @Before advice

	/*
	 * @Before("execution(public void add*())") public void beforeAddWildAdvice() {
	 * 
	 * System.out.println("\n====>>> Executing @Before advice on wild method add*()"
	 * );
	 * 
	 * }
	 * 
	 * @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAOImpl.addAccount())"
	 * ) public void beforeAddAccountImplAdvice() {
	 * 
	 * System.out.
	 * println("\n====>>> Executing @Before advice on class AccountDAOImpl addAccount()"
	 * );
	 * 
	 * }
	 * 
	 * @Before("execution(public void com.luv2code.aopdemo.dao.AccountDAO.addAccount())"
	 * ) public void beforeAddAccountAdvice() {
	 * 
	 * System.out.
	 * println("\n====>>> Executing @Before advice on interface AccountDAO addAccount()"
	 * );
	 * 
	 * }
	 * 
	 * @Before("execution(void add*())") public void beforeAnyVoidAddWildAdvice() {
	 * 
	 * System.out.
	 * println("\n====>>> Executing @Before advice on any modifier void return method add*()"
	 * );
	 * 
	 * }
	 */

	@Before("execution(* add*(com.luv2code.aopdemo.Account))")
	public void beforeAnyWildAddWildAdvice() {

		System.out.println("\n====>>> Executing @Before advice on any modifier wild return wild method add*(Account)");

	}

	@Before("execution(* change*(String))")
	public void beforeAnyWildChangeWildAdvice() {

		System.out
				.println("\n====>>> Executing @Before advice on any modifier wild return wild method change*(String)");

	}

}