package com.luv2code.springdemo;

public class SwimCoach implements Coach {

	private final FortuneService fortuneService;

	private final String email;

	private final String team;

	public SwimCoach(FortuneService fortuneService, String email, String team) {
		this.fortuneService = fortuneService;
		this.email = email;
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters as a warm up";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

}
