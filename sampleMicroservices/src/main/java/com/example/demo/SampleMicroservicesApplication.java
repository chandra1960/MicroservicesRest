package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.rest.UserInfo;


@SpringBootApplication
@RestController
public class SampleMicroservicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleMicroservicesApplication.class, args);
	}
	@RequestMapping("/User")
	public UserInfo details()
	{
		UserInfo usr = new UserInfo();
		usr.setFirstName("Chandra");
		usr.setLastName("Reddy");
		usr.setAge(30);
		return usr;
}
}
