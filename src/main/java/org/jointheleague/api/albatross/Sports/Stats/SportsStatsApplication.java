package org.jointheleague.api.albatross.Sports.Stats;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"org.jointheleague.api.albatross.Sports.Stats"})
@SpringBootApplication
public class SportsStatsApplication {

	public static void main(String[] args) {

		SpringApplication.run(SportsStatsApplication.class, args);


	}

}
