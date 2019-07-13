package com.luv2code.springdemo;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("randomFromFile")
public class RandomFileFortuneService implements FortuneService {

	private final String[] data;

	private final Random myRandom;

	@Autowired
	public RandomFileFortuneService(@Qualifier("summerProp") FortunePropService fortunePropService) {
		Map<String, String> propMap = fortunePropService.getPropMap();

		List<String> propMapVals = propMap.values().stream().collect(Collectors.toList());

		this.data = propMapVals.toArray(new String[propMapVals.size()]);
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
