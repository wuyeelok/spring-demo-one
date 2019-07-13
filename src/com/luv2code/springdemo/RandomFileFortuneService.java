package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("randomFromFile")
public class RandomFileFortuneService implements FortuneService {

	private final String[] data;

	private final Random myRandom;

	public RandomFileFortuneService(@Value("${fortunelist}") String fortunes) {
		this.data = fortunes.split(",");
		this.myRandom = new Random();
	}

	@Override
	public String getFortune() {
		// Pick a random string from array
		int index = this.myRandom.nextInt(this.data.length);

		String theForunte = this.data[index];

		return theForunte;
	}

}
