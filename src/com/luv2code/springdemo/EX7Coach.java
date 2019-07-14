package com.luv2code.springdemo;

public class EX7Coach implements Coach {

	private final FortuneService fortuneService;

	public EX7Coach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Let's do ex7 workout!";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
