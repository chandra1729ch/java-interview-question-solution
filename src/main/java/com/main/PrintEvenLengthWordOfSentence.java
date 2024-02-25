package com.main;

import java.util.Arrays;

public class PrintEvenLengthWordOfSentence {
    public static void main(String[] args) {
        //using normal approach
        String exp = "java learning is fun";
        String[] strings = exp.split(" ");
        for (int i = 0; i < strings.length; i++) {
            if(strings[i].length()%2 == 0) {
                System.out.println(strings[i]);
            }
        }
        //using streams
        Arrays.stream(exp.split(" ")).filter(x-> x.length()%2 ==0).forEach(y-> System.out.println(y));
    }
}
