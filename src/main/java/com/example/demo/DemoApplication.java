package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.common.member")
public class DemoApplication {

	public static void main(String[] args) {
 		System.out.println(com.common.test.TestHelper.isNullOrEmpty("test"));

		SpringApplication.run(DemoApplication.class, args);
	}

}
