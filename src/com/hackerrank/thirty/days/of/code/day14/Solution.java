package com.hackerrank.thirty.days.of.code.day14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] a) {
        this.elements = a;
    }

    void computeDifference() {
        List<Integer> differences = new ArrayList<>();
        for (int element : elements) {
            for (int element1 : elements) {
                Integer difference = element - element1;
                if (difference < 0) {
                    difference = -difference;
                }
                differences.add(difference);
            }
        }

        maximumDifference = differences.stream().mapToInt(Integer::intValue).max().getAsInt();
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];

        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }

        Difference D = new Difference(a);

        D.computeDifference();

        System.out.print(D.maximumDifference);
    }
}