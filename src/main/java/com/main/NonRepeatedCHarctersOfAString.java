package com.main;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NonRepeatedCHarctersOfAString {
    public static void main(String[] args) {
        String input = "Java articles are Awesome";
        Character chars = input.chars().mapToObj(s->Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()))
                .entrySet()
                .stream().filter(s-> s.getValue() ==1L)
                .map(e->e.getKey())
                .findFirst()
                .get();

        System.out.println(chars);
    }
}
