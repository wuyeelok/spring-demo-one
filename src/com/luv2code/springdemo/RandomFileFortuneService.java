package com.luv2code.springdemo;

import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("randomFromFile")
public class RandomFileFortuneService implements FortuneService {

	private String[] data;

	private final Random myRandom;

	private final FortunePropService fortunePropService;

	@Autowired
	public RandomFileFortuneService(@Qualifier("summerProp") FortunePropService fortunePropService) {
		this.myRandom = new Random();
		this.fortunePropService = fortunePropService;
	}

	@PostConstruct
	public void readPropAndSetData() {
		Map<String, String> propMap = fortunePropService.getPropMap();

		List<String> propMapVals = propMap.values().stream().collect(Collectors.toList());
		this.data = propMapVals.toArray(new String[propMapVals.size()]);
		System.out.println(
				"Inside RandomFileFortuneService function readPropAndSetData, data length is: " + this.data.length);

	}

	@Override
	public String getFortune() {
		// Pick a random string from array
		int index = this.myRandom.nextInt(this.data.length);

		String theForunte = this.data[index];

		return theForunte;
	}

}
