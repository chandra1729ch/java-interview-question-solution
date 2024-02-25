package com.main;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateValuesinArray {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,4,5,6,7,1,3,4,7,5,8,6,9,78,56,1);
        Map<Integer,Long> map = integerList.stream().collect(Collectors.groupingBy(e-> e,Collectors.counting()));
        System.out.println(map);
        List<Integer> list = map.entrySet().stream().filter(x->x.getValue()==1).map(Map.Entry::getKey).toList();
        System.out.println(list);
    }
}
