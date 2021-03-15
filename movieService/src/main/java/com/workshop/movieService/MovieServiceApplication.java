package com.workshop.movieService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication(exclude = {
	    HibernateJpaAutoConfiguration.class
	})
public class MovieServiceApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(MovieServiceApplication.class, args);
	}

}
