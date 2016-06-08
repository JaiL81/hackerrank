package com.hackerrank.thirty.days.of.code.two;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Arithmetic {

    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
        double mealCost = 12.00; // original meal price
        int tipPercent = 20; // tip percentage
        int taxPercent = 8; // tax percentage
        //scan.close();

        // Write your calculation code here.
        double tipCost = mealCost * ((double)tipPercent / 100);
        double taxCost = mealCost * ((double)taxPercent / 100);
        // cast the result of the rounding operation to an int and save it as totalCost
        int totalCost = (int) Math.round(mealCost + tipCost + taxCost);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }
}
