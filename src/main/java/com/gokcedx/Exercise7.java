package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 02.02.2021
 */
public class Exercise7 {

    static int x = 10;
    static int y;

    public static void main(String[] args) {

        y = 2;
        try {
            System.out.println(x / y);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * A) java.lang.ArithmeticException
     * B) 5
     * C) 0
     * D) Compile Error
     */
}
