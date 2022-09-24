package com.spring.basics.springbasics.basics;

//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
//@Scope("prototype") OR following
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@Scope("singleton") => Default
//@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)  => Default
public class BinarySearchImpl {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
//	@Qualifier("quick")
	private SortAlgorithm bubbleSortAlgorithm;

//	Constructor Injection
//	@Autowired
//	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
//		super();
//		this.sortAlgorithm = sortAlgorithm;
//	}

//	Setter Injection (not exactly required, spring does that for you)
//	@Autowired
//	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
//		this.sortAlgorithm = sortAlgorithm;
//	}

	public int binarySearch(int[] numbers, int value) {

//		BubbleSortAlgorithm bubbleSortAlgorithm = new BubbleSortAlgorithm();

		int[] sortedNumbers = bubbleSortAlgorithm.sort(numbers);
//		System.out.println(bubbleSortAlgorithm);
		return 0;
	}
	
//	@PostConstruct
//	public void postConstruct() {
//		logger.info("--- postConstruct ---");
//	}
//	
//	@PreDestroy
//	public void preDestroy() {
//		logger.info("--- preDestroy ---");
//	}
	
}
