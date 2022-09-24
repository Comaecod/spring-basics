package com.spring.basics.springbasics;

import java.util.Iterator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.basics.springbasics.xml.XMLPersonDAO;

public class SpringXMLApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringXMLApplication.class);

	public static void main(String[] args) {

		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		for (String string : applicationContext.getBeanDefinitionNames()) {
			LOGGER.info("@comaecod: Beans Loaded => {}", string);
		}

		XMLPersonDAO xmlPersonDAO = applicationContext.getBean(XMLPersonDAO.class);

		LOGGER.info("@comaecod: {}", xmlPersonDAO);
		LOGGER.info("@comaecod: {}", xmlPersonDAO.getXmljdbcConnection());

		applicationContext.close();
	}

}
