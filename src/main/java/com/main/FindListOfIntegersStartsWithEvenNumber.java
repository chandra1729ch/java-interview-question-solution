package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindListOfIntegersStartsWithEvenNumber {
    public static void main(String[] args) {
        Integer[] ints = {19, 20, 38, 43, 56, 45, 67, 87, 48, 36};
        List<Integer> integerList = Arrays.asList(ints);
        List<Integer> integers = integerList.stream().filter(x-> (x/10)%2 == 0).toList();
        System.out.println(integers);
    }
}
