package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 02.02.2021
 */
public class Exercise6 {

    public static void main(String[] args) {

        String s = "Hello World!";

        System.out.println(s.substring(2, 6) + s.substring(7, 10).toUpperCase());
    }

    /**
     * A) llo orl
     * B) ello worl
     * C) ello WORL
     * D) llo ORL
     */
}
