package com.main;

import java.util.*;

public class DistinctNumbers {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>(Arrays.asList(1,2,3,4,1,5,6,7));
        Set<Integer>  integerSet = new HashSet<>(integers);
        if (integers.size() == integerSet.size()) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
