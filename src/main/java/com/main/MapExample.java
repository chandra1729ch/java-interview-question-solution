package com.main;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1,2345);
        map.entrySet().stream().forEach(x->{
            System.out.println(x.getKey() + "                   "+x.getValue());
        });
    }
}
