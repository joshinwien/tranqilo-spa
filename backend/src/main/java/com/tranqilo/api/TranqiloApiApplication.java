package com.tranqilo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.tranqilo.api.repository") // <-- Add this line
@EntityScan("com.tranqilo.api.model")                  // <-- Add this line
public class TranqiloApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TranqiloApiApplication.class, args);
	}

}