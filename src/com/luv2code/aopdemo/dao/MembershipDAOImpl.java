package com.luv2code.aopdemo.dao;

import org.springframework.stereotype.Component;

@Component
public class MembershipDAOImpl implements MembershipDAO {

	@Override
	public void addAccount() {

		System.out.println(getClass() + ": DOING STUFF: ADDIN A MEMBERSHIP ACCOUNT");

	}

}
