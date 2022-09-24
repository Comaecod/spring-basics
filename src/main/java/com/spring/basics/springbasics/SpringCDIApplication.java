package com.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springbasics.cdi.CDI;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringCDIApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringCDIApplication.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringCDIApplication.class, args);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringCDIApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringCDIApplication.class)) {

			CDI cdi = applicationContext.getBean(CDI.class);

			LOGGER.info("{} --- {}", cdi, cdi.getcDIDao());
		}

	}

}
