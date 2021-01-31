package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 31.01.2021
 */
public class Exercise1 {

    public static void main(String[] args) {

        String s = "What is the output of this code?";
        s.toUpperCase();
        s.trim();
        s.replace(' ', '.');

        System.out.println(s);
    }

    /**
     * A) What.is.the.output.of.this.code?
     * B) WHAT.IS.THE.OUTPUT.OF.THIS.CODE?
     * C) What is the output of this code?
     * D) WHATISTHEOUTPUTOFTHISCODE?
     */
}
