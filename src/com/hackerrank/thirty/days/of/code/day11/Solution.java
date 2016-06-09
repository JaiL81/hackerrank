package com.hackerrank.thirty.days.of.code.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }


        int x = 0;
        int y = 0;

        List<Integer> hourglassSum = new ArrayList<>();

        for (int i = 0; i < 16; i++) {
            List<Integer> hourglass = new ArrayList<>(6);

            hourglass.add(arr[x][y]);
            hourglass.add(arr[x][y + 1]);
            hourglass.add(arr[x][y + 2]);
            hourglass.add(arr[x + 1][y + 1]);
            hourglass.add(arr[x + 2][y]);
            hourglass.add(arr[x + 2][y + 1]);
            hourglass.add(arr[x + 2][y + 2]);

            if (y < 3) {
                y++;
            } else {
                y = 0;
                x++;
            }
            hourglassSum.add(hourglass.stream().reduce((integer, integer2) -> integer + integer2).get());
        }

        System.out.print(hourglassSum.stream().max(Integer::compareTo).get());

    }

}
