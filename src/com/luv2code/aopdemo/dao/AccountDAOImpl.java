package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component("defaultAccountDAOImpl")
public class AccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount(Account theAccount) {
		System.out.println(getClass() + ", DOING MY DB WORK: ADDING AN ACCOUNT!");
	}

	@Override
	public void changeName(String name) {
		System.out.println(getClass() + ", CHANGE NAME");
	}

}
