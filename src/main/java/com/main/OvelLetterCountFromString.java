package com.main;

import java.util.Arrays;
import java.util.List;

public class OvelLetterCountFromString {
    public static void main(String[] args) {
        String a = "java learning is fun";
        Long count = a.chars().mapToObj(ch->(char) ch).filter(c-> "aeiouAEIOU".indexOf(c) != -1).count();
        System.out.println(count);
        }
    }

