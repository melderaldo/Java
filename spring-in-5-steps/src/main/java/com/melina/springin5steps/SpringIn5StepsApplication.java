package com.melina.springin5steps;

import com.melina.springin5steps.sortAlgorithm.BubbleSortAlgorithm;
import com.melina.springin5steps.sortAlgorithm.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import static java.util.Arrays.binarySearch;
import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringIn5StepsApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                run(SpringIn5StepsApplication.class, args);

        BinarySearch binarySearch =
                applicationContext.getBean(BinarySearch.class);

        int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);

        System.out.println(result);
    }
}
