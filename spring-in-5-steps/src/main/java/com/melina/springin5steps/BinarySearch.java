package com.melina.springin5steps;

import com.melina.springin5steps.sortAlgorithm.SortAlgorithm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class BinarySearch {

    @Autowired
    private SortAlgorithm sortAlgorithm;

    public int binarySearch(int [] numbers, int numberToSearch){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return numberToSearch;
    }
}
