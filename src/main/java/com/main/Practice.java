package com.main;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Practice {


    public static void main(String[] args) {
        String input = "Java articles are Awesome";

        Character chars =    input.chars().mapToObj(c->Character.toLowerCase(Character.valueOf((char)c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream().
                filter(x-> x.getValue()==1)
                .map(y->y.getKey())
                .findFirst()
                .get();

        System.out.println(chars);
    }
}
