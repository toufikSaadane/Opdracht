package com.example.demo;

import com.example.demo.POJOS.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class DemoOneApplication {

	public Logger log = LoggerFactory.getLogger(DemoOneApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoOneApplication.class, args);
	}


	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
