package com.melina.springin5steps;

import com.melina.springin5steps.sortAlgorithm.BubbleSortAlgorithm;
import com.melina.springin5steps.sortAlgorithm.SortAlgorithm;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static java.util.Arrays.binarySearch;

@SpringBootApplication
public class SpringIn5StepsApplication {

	public static void main(String[] args) {
        SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();

		BinarySearch binarySearch = new BinarySearch(sortAlgorithm);
        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        SpringApplication.run(SpringIn5StepsApplication.class, args);
	}
}
