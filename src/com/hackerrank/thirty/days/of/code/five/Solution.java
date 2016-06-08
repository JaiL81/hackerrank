package com.hackerrank.thirty.days.of.code.five;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        printInputTable(input);
    }

    private static void printInputTable(int input) {
        if (input >= 2 && input <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(input + " x " + i + " = " + input * i);
            }
        }
    }
}
