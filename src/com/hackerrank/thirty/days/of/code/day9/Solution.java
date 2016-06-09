package com.hackerrank.thirty.days.of.code.day9;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        scanner.close();

        System.out.print(factorial(input));
    }

    private static int factorial(int input) {
        int factorial;
        if (input == 1) {
            factorial = 1;
        } else {
            factorial = input * factorial(input - 1);
        }

        return factorial;
    }

}
