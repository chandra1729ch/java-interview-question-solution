package com.main;

import java.util.Arrays;
import java.util.List;

public class MaximumElementOfList {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,34,5,6,32,5,6,26,768);
        integerList.stream().max((a,b) -> a-b).ifPresent(System.out::println);
    }
}
