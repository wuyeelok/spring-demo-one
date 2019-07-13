package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	private final FortuneService fortuneService;

	/*
	 * public TennisCoach() {
	 * System.out.println(">> Tenniscoach: inside default constructor"); }
	 */

	@Autowired
	public TennisCoach(@Qualifier("randomFromFile") FortuneService fortuneService) {
		System.out.println(">> Tenniscoach: inside constructor arg:fortuneService");
		this.fortuneService = fortuneService;
	}

	/*
	 * @Autowired public void doSomeCrazyStuff(FortuneService fortuneService) {
	 * System.out.println(">> Tenniscoach: inside doSomeCrazyStuff() method");
	 * this.fortuneService = fortuneService; }
	 */

	// Define my init method
	@PostConstruct
	public void doMyStartupStuff() {
		System.out.println(">> TennisCoach: inside of doMyStartupStuff()");
	}

	// Define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">> TennisCoach: inside of doMyCleanupStuff()");
	}

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
