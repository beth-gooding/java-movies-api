package gooding.beth.movies; // Declare our package

import org.springframework.boot.SpringApplication; // Contains the run method that will start the spring application
import org.springframework.boot.autoconfigure.SpringBootApplication; // Imports the annotation used on Line 6
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/root") // Lets the framework know that this endpoint is a get endpoint
	public String apiRoot() {
		return "Hello World!";
	}
}
