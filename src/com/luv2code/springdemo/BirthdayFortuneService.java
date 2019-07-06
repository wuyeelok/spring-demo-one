package com.luv2code.springdemo;

import java.util.Random;

public class BirthdayFortuneService implements FortuneService {

	private String birthdayFortunes;

	public void setBirthdayFortunes(String birthdayFortunes) {
		this.birthdayFortunes = birthdayFortunes;
	}

	@Override
	public String getFortune() {
		Random random = new Random();

		String[] birthdayFortuneArr = this.birthdayFortunes.split(",");

		int randomChoice = random.nextInt(birthdayFortuneArr.length);

		return birthdayFortuneArr[randomChoice];
	}

}
