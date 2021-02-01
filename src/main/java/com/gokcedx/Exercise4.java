package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 01.02.2021
 */
public class Exercise4 {

    private static int a = 10;
    private int b = 10;

    public static void main(String[] args) {
        Exercise4 output1 = new Exercise4();
        output1.a = 20;
        output1.b = 20;

        Exercise4 output2 = new Exercise4();

        System.out.println("output1 toplamı = " + (output1.a + output1.b));
        System.out.println("output2 toplamı = " + (output2.a + output2.b));
    }

    /**
     * A) Runtime Error
     * B) Compile Error
     * C) 30 20
     * D) 40 30
     */

}
