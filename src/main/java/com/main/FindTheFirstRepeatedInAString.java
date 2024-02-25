package com.main;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheFirstRepeatedInAString {
    public static void main(String[] args) {
        String input = "life is beautiful enjoy it";

        Character c = input.chars().mapToObj(s-> Character.toLowerCase(Character.valueOf((char)s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream()
                .filter(count->count.getValue()>1)
                .map(key -> key.getKey())
                .findFirst()
                .get();
        System.out.println(c);
    }
}
