package com.luv2code.aopdemo.dao;

import com.luv2code.aopdemo.Account;

public interface AccountDAO {

	public void addAccount(Account theAccount);
	
	public void changeName(String name);
	
}
