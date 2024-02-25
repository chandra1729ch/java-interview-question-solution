package com.main;

public class ReverseStringWithWhile {
    public static void main(String[] args) {
        String name = "Hello World!!";
        char[] chars = name.toCharArray();
        int left = 0;
        int right = chars.length-1;
        while(left<right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        System.out.println(new String(chars));
    }
}
