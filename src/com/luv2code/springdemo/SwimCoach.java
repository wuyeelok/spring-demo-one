package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("Kelvin_Chan")
public class SwimCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice kicking for 400m";
	}

}
