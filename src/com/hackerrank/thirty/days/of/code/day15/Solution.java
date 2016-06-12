package com.hackerrank.thirty.days.of.code.day15;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

}

class Solution {

    public static Node insert(Node head, int data) {
        Node node = new Node(data);

        if (head != null) {
            Node pointer = head;
            while (pointer.next != null) {
                pointer = pointer.next;
            }

            pointer.next = node;
        } else {
            return node;
        }

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();
        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);

    }
}
