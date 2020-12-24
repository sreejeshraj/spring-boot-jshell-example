package com.sreejesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@ImportResource("classpath:META-INF/spring/applicationContext.xml") 
public class AutoShutdownCamelMainClass {

	public static void main(String[] args) {
		SpringApplication.run(AutoShutdownCamelMainClass.class, args);

	}

	public static ConfigurableApplicationContext main() {
		return SpringApplication.run(AutoShutdownCamelMainClass.class);

	}

}
