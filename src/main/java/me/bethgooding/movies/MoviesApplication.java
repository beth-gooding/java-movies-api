package me.bethgooding.movies; // Declare our package

import org.springframework.boot.SpringApplication; // Contains the run method that will start the spring application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Imports the annotation used on Line 6

@SpringBootApplication
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}


}
