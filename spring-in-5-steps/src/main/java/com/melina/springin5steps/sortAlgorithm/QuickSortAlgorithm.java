package com.melina.springin5steps.sortAlgorithm;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {

    public int[] sort(int [] numbers) {
        return numbers;
    }
}
