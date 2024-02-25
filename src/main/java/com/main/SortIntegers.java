package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortIntegers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,5,6,7,8,3,5,6,5,7,3));
        integerList.stream().sorted().forEach(System.out::println);
    }
}
