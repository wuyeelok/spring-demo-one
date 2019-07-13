package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private final String[] data = { "Beware of the wolf", "Diligence is the mother", "The journey is the reward" };

	private final Random myRandom = new Random();

	@Override
	public String getFortune() {
		// Pick a random string from array
		int index = myRandom.nextInt(data.length);

		String theForunte = data[index];

		return theForunte;
	}

}
