package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component("DumpDAO")
public class DumpAccountDAOImpl implements AccountDAO {

	@Override
	public void addAccount() {

		System.out.println(getClass() + ", Empty DAO!");

	}

}
