package com.melina.springin5steps;

import com.melina.springin5steps.sortAlgorithm.BubbleSortAlgorithm;
import com.melina.springin5steps.sortAlgorithm.SortAlgorithm;

public class BinarySearch {

    private SortAlgorithm sortAlgorithm;

    public BinarySearch(SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    //Sorting a array
    //Search the array
    //Return
    public int binarySearch(int [] numbers, int numberToSearch){
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return numberToSearch;
    }
}
