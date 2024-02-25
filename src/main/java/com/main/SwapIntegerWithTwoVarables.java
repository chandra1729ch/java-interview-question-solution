package com.main;

import java.util.Scanner;

public class SwapIntegerWithTwoVarables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(x + "         "+ y);
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println(x + "         "+ y);
    }
}
