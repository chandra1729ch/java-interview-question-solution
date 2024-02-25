package com.main;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharcterInaString {
    public static void main(String[] args) {
        String name="test";
        Map<Character,Long> map=name.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.print(map);
    }
}
