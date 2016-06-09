package com.hackerrank.thirty.days.of.code.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> agenda = new HashMap<>();

        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            agenda.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (agenda.containsKey(s)) {
                System.out.println(s + "=" + agenda.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();
    }

}
