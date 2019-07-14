package com.luv2code.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EX7Config {

	@Bean
	public FortuneService ex7Fortune() {
		return new EX7FortuneService();
	}

	@Bean
	public Coach ex7Coach() {
		return new EX7Coach(ex7Fortune());
	}

}
