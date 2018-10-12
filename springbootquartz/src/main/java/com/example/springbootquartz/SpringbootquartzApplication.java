package com.example.springbootquartz;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableSwagger2Doc
@EnableScheduling
public class SpringbootquartzApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootquartzApplication.class, args);
	}
}
