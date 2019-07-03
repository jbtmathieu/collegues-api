package com.collegue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//https://mathieu-collegues-api.herokuapp.com/collegues?name=SMITH

@SpringBootApplication
public class ColleguesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ColleguesApiApplication.class, args);
	}

}
