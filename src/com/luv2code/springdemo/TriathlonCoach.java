package com.luv2code.springdemo;

public class TriathlonCoach implements Coach {

	private FortuneService fortuneService;

	public TriathlonCoach(FortuneService fortuneService) {
		System.out.println("Inside TriathlonCoach Constructor arg method.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice transition";
	}

	@Override
	public String getDailyFortune() {
		return "Triathlon Coach: " + this.fortuneService.getFortune();
	}

}
