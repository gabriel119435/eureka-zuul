package application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClient1Application {
	
	@Value("${uniqueValue}")
	private String uniqueValue;
	
	public static void main(String[] args) {
		SpringApplication.run(EurekaClient1Application.class, args);
	}

	@GetMapping("/greeting")
	public String greet() {
		return uniqueValue;
	}

}