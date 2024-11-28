package com.jbproject.narapia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@EnableJpaAuditing
@SpringBootApplication
public class NarapiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(NarapiaApplication.class, args);
	}

}
