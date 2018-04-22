package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.rest.demo.Info;

@SpringBootApplication
@RestController
public class SampleMicroservices1Application {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroservices1Application.class, args);
		RestTemplate data = new RestTemplate();
		Info I = data.getForObject("http://localhost:9999/User", Info.class);
		System.out.println("Hello:"+I.getFirstName()+" "+ I.getLastName()+" "+"Your now:"+ I.getAge());
	}
}
