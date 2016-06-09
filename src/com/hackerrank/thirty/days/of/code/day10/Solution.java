package com.hackerrank.thirty.days.of.code.day10;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        scanner.close();

        String binary = Integer.toBinaryString(input);

        List<String> consecutiveOnes = Arrays.asList(binary.split("0"));

        @SuppressWarnings("OptionalGetWithoutIsPresent") Integer result = consecutiveOnes.stream().map(String::length).max(Integer::compareTo).get();

        System.out.print(result);
    }
}
