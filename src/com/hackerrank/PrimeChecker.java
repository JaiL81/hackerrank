package com.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import static java.lang.System.in;

class Prime {

    void checkPrime(int... numbers) {
        String result = "";
        for (int number : numbers) {
            if (isPrime(number)) {
                if (Objects.equals(result, "")) {
                    result = String.valueOf(number);
                } else {
                    result = result + " " + number;
                }
            }
        }

        System.out.println(result);
    }

    //checks whether an int is prime or not.
    private boolean isPrime(int n) {
        if (n == 1) return false;
        if (n % 2 == 0 && n != 2) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}

public class PrimeChecker {
    //private static java.io.InputStream in = System.in;
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (Method method : methods) {
                if (set.contains(method.getName())) {
                    overload = true;
                    break;
                }
                set.add(method.getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }


}


