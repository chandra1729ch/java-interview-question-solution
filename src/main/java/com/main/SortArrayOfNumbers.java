package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Integer[] arr = {76,23,65,34,25,98,5,94,37};
       List<Integer> rand= Arrays.stream(arr).sorted((a,b)-> b-a).toList();
        System.out.println(rand);
    }
}
