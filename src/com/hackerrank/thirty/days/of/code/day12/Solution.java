package com.hackerrank.thirty.days.of.code.day12;

import java.util.*;

class Person {
    private String firstName;
    private String lastName;
    private int idNumber;

    // Constructor
    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    // Print person data
    void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person {
    private int[] testScores;

    Student(String firstName, String lastName, int identification, int[] testScores) {
        super(firstName, lastName, identification);
        this.testScores = testScores;

    }

    char calculate() {
        double average = Arrays.stream(this.testScores).average().getAsDouble();

        if (average >= 90 && average <= 100) {
            return 'O';
        } else if (average >= 80 && average < 90) {
            return 'E';
        } else if (average >= 70 && average < 80) {
            return 'A';
        } else if (average >= 55 && average < 70) {
            return 'P';
        } else if (average >= 40 && average < 55) {
            return 'D';
        } else {
            return 'T';
        }
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}
