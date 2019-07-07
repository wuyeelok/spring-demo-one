package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	public TrackCoach() {
		System.out.println("Insede TrackCoach no-arg constructor.");
	}

	public TrackCoach(FortuneService fortuneService) {
		System.out.println("Insede TrackCoach arg FortuneService constructor.");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just DO It: " + this.fortuneService.getFortune();
	}

	// add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff.");
	}

	// add a destory method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo.");
	}

}
