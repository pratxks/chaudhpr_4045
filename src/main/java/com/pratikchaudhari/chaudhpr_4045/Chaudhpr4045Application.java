package com.pratikchaudhari.chaudhpr_4045;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.pratikchaudhari"})
@ComponentScan(basePackages = {"com.pratikchaudhari.service"})

public class Chaudhpr4045Application {

	public static void main(String[] args) {
		SpringApplication.run(Chaudhpr4045Application.class, args);
	}

}
