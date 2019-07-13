package com.luv2code.springdemo;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Properties;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component("randomFromFile")
public class RandomFileFortuneService implements FortuneService {

	private String[] data;

	private final Random myRandom;

	public RandomFileFortuneService() {
		this.myRandom = new Random();
	}

	@PostConstruct
	public void readPropAndSetData() {

		InputStream iStream = null;
		Properties properties = new Properties();
		try {
			iStream = getClass().getResourceAsStream("/randomFortune.properties");
			properties.load(iStream);

			Map<String, String> propMap = new HashMap<>();
			properties.forEach((k, v) -> propMap.put(Objects.toString(k, ""), Objects.toString(v, "")));

			List<String> propMapVals = propMap.values().stream().collect(Collectors.toList());
			this.data = propMapVals.toArray(new String[propMapVals.size()]);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println(
					"Inside RandomFileFortuneService function readPropAndSetData, data length is: " + this.data.length);
			try {
				if (iStream != null) {
					iStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String getFortune() {
		// Pick a random string from array
		int index = this.myRandom.nextInt(this.data.length);

		String theForunte = this.data[index];

		return theForunte;
	}

}
