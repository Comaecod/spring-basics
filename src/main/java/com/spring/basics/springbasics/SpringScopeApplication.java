package com.spring.basics.springbasics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.spring.basics.springbasics.basics.BinarySearchImpl;
import com.spring.basics.springbasics.scope.PersonDAO;

//@SpringBootApplication
@Configuration
@ComponentScan
public class SpringScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringScopeApplication.class);

	public static void main(String[] args) {

//		ApplicationContext applicationContext = SpringApplication.run(SpringScopeApplication.class, args);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringScopeApplication.class);
			
			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
			
			LOGGER.info("{} @Comaecod", personDAO1);
			LOGGER.info("{}", personDAO1.getJdbcConnection());		
			
			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO2.getJdbcConnection());
			
			applicationContext.close();
		
		
		
	}
}
