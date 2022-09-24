package com.spring.basics.springbasics.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
//@Component
@Qualifier("quick")
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		//QuickSort Logic
		return numbers;
	}
}
