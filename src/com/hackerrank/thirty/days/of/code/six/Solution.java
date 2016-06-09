package com.hackerrank.thirty.days.of.code.six;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfLines = Integer.valueOf(scan.nextLine());

        for (int i = 1; i <= numberOfLines; i++) {
            String line = scan.nextLine();
            printLineInHalves(line);
        }
    }

    private static void printLineInHalves(String line) {
        StringBuilder odd = new StringBuilder();
        StringBuilder even = new StringBuilder();
        for (int i = 0; i < line.length(); i++) {
            if (i % 2 == 0) {
                odd.append(line.charAt(i));
            } else {
                even.append(line.charAt(i));
            }
        }
        System.out.println(odd.toString() + " " + even.toString());
    }
}
