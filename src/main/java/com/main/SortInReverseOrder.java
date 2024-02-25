package com.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortInReverseOrder {
    public static void main(String[] args) {
        List<Integer>  integers = Arrays.asList(1,2,34,45,6,7,5,6,89,90,23,56,78);
        integers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        List<String>  strings = Arrays.asList("a","b","c","e","A","B","C","F");
        strings.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
