package rest_service.rest_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RestServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServiceApplication.class, args);
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	
	public String home() {
		return "<h1>Home Page</h1>";
	}
	@GetMapping(value = "/users/{id}")
	public String profile(@PathVariable("id") String id) {
		return "<h1>Hello " +id+"</h1>"; 
		
	}
	@GetMapping(value = "/users/{id}/settings")
	public String settingsPage(@PathVariable("id") String id) {
		return "<h1>Here are your settings " +id+"</h1>"; 
		
	}

}
