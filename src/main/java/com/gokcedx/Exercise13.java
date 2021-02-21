package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 21.02.2021
 */
public class Exercise13 {

    public static void main(String[] args) {
        String s1 = "Gokce";
        String s2 = "Gokce";

        if (s1 == s2) {
            System.out.println("Equal");
        }
    }

    static {
        System.out.println("Static");
    }

    /**
     * A) Equal Static
     * B) Static
     * C) Equal
     * D) Static Equal
     */
}
