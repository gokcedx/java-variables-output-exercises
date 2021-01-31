package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 31.01.2021
 */
public class Exercise2 {

    public static void main(String[] args) {

        int a, b, c, d, e;
        a = b = c = d = e = 5;

        a *= b += c += d -= e /= 5;

        System.out.println((a - b) - (c - (d + e)));
    }

    /**
     * A) 52
     * B) 40
     * C) 20
     * D) 4
     */
}
