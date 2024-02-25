package com.main;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortListInTheIncreasingOrderOfLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("adjkadsaf","asfj","dihfksihdi","s","adjifoj","fgd","as","asfdsfd");
        strings.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }
}
