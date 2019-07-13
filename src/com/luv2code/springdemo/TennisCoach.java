package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
