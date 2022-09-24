package com.spring.basics.springbasics;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.basics.springbasics.basics.BinarySearchImpl;

//@SpringBootApplication
@Configuration
//@ComponentScan("com.spring.basics.springbasics")
@ComponentScan
public class SpringBasicsApplication {

	public static void main(String[] args) {

//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
//		int val = binarySearchImpl.binarySearch(new int[] { 12, 34, 5, 6 }, 12);
//		System.out.println(val);

//		ApplicationContext applicationContext = SpringApplication.run(SpringBasicsApplication.class, args);
//		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBasicsApplication.class);
		
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearchImpl);
		System.out.println(binarySearchImpl2);
		
		int result = binarySearchImpl.binarySearch(new int[] { 12, 34, 5, 6 }, 12);
		System.out.println(result);
		
		applicationContext.close();
	}

}
