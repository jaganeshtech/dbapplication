package com.bootexample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan("com.bootexample")
public class RestappApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestappApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Application started successfully");
	}




	@Bean public RestTemplate getRestTemplate(){
		return new RestTemplate();
	}
}
