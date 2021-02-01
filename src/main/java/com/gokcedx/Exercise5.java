package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 01.02.2021
 */
public class Exercise5 {

    public static void main(String[] args) {

        try {
            int i = 10;
            long x = Long.valueOf(i);
            int y = (int) x;
            double z = Double.valueOf(y);

            System.out.println("String1 = " + x + y + z);
            System.out.println("String2 = " + (x + y + z));

        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    /**
     * A) 101010  30
     * B) 101010.0  30.0
     * C) java.lang.NumberFormatException
     * D) Compile Error
     */
}
