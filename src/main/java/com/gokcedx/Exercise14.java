package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 21.02.2021
 */
public class Exercise14 {

    public static void main(String[] args) {

        String s = "Gokce";
        try {
            double d = Double.valueOf(s);
            System.out.println(d);
        } finally {
            System.out.println("Finally");
        }
    }

    /**
     * A) NumberFormatException
     * B) Finally
     * C) Finally NumberFormatException
     * D) Compile Error
     */
}
