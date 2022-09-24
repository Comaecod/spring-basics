package com.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.basics.componentscan.ComponentDAO;

//@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class SpringComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringComponentScanApplication.class, args);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringComponentScanApplication.class);
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringComponentScanApplication.class)) {

			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{} @comaecod", componentDAO);
			
		}
	}

}
