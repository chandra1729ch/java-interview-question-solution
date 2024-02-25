package com.main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedNumber {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>(Arrays.asList(1,2,5,6,7,8,3,5,6,5,7,3));
        Integer a = integerList.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        System.out.println(a);
    }
}
