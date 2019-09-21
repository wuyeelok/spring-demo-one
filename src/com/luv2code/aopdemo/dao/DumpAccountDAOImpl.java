package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

import com.luv2code.aopdemo.Account;

@Component("DumpDAO")
public class DumpAccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount(Account theAccount) {

		System.out.println(getClass() + ", Empty DAO!");

	}

	@Override
	public void changeName(String name) {
		// TODO Auto-generated method stub
		
	}

}
