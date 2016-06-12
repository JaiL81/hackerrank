package com.hackerrank.thirty.days.of.code.day16;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.next();

        try{
            System.out.print(Integer.valueOf(line));
        } catch (NumberFormatException e) {
            System.out.print("Bad String");
        }
    }

}
