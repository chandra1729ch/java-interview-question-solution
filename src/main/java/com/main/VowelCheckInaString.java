package com.main;


import java.util.Scanner;

public class VowelCheckInaString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        boolean isVowel = false;
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'o' || ch =='i' || ch == 'u') {
                isVowel = true;
                System.out.println("String: "+ a +"  contain vowels;");
                break;
            }
        }
        if(!isVowel) {
            System.out.println("String: "+ a +" doesnot contain vowels;");
        }
    }
}
