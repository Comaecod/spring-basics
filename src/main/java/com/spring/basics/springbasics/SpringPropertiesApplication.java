package com.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.basics.springbasics.cdi.CDI;
import com.spring.basics.springbasics.properties.SomeExternalService;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringPropertiesApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringPropertiesApplication.class)) {

			SomeExternalService externalService = applicationContext.getBean(SomeExternalService.class);

			LOGGER.info("@comaecod: {}", externalService.getUrl());
		}

	}

}
