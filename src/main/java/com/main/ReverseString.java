package com.main;

public class ReverseString {

    public static void main(String[] args) {
        String a = "helloworld";
        StringBuilder newStr = new StringBuilder();
        System.out.println("String before Reverse: "+ a);
        for (int i = a.toCharArray().length -1; i >=0; i--) {
            newStr.append(a.toCharArray()[i]);
        }
        System.out.println("String after reverse: "+newStr);
    }
}
