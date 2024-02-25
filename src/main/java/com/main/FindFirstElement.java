package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstElement {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(12,34,5,6,32,5,6,26,768);
        Optional<Integer> first=integerList.stream().findFirst();
        System.out.println(first.get());
    }

}
