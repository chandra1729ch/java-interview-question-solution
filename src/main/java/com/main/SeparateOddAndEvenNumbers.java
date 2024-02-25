package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SeparateOddAndEvenNumbers {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(23,34,65,75,56,46,36,59,97,64,57,64);
        List<Integer> odd = integers.stream().filter(i->i%2!=0).toList();
        List<Integer> even = integers.stream().filter(i->i%2==0).toList();

        System.out.println(odd);
        System.out.print(even);

    }
}
