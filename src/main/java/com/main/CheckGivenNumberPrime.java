package com.main;

import java.util.Scanner;

public class CheckGivenNumberPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int originalNum = sc.nextInt();
        int num = originalNum;
        boolean isPrime = true;
        while(num > 3) {
            int x = originalNum % (num-1)




































































































































































































                    ;
            if(x == 0) {
               isPrime = false;
               break;
            }
            num--;
        }
        if(isPrime) {
            System.out.println("Entered number is Prime.");
        } else {
            System.out.println("Entered number is not Prime.");
        }

    }
}
