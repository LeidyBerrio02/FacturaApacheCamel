package com.bmid.camel.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.bmid.camel.project")
public class TareaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaApplication.class, args);
	}

}
