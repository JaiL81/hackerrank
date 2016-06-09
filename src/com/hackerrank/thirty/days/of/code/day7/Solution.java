package com.hackerrank.thirty.days.of.code.day7;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        in.close();
        for (int j = n -1; j >= 0; j--) {
            System.out.print(arr[j]);
            if (j != 0) {
                System.out.print(" ");
            }
        }
    }
}
