package com.luv2code.springdemo;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class BirthdayFortuneService implements FortuneService {

	// 3 fortunes
	private List<String> fortunes = Arrays.asList("Happy birthday!", "A year older!", "Cake!");

	@Override
	public String getFortune() {
		Random random = new Random();
		int randomChoice = random.nextInt(fortunes.size());

		return this.fortunes.get(randomChoice);
	}

}
