package com.gokcedx;

import com.gokcedx.enums.EnumDays;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public class Exercise12 {

    public static void main(String[] args) {

        // enums -> EnumDays NULLDAY

        String s = null;
        if(s.equals(EnumDays.NULLDAY)){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }
    }

    /**
     * A) Equal
     * B) Not Equal
     * C) NullPointerException
     * D) Runtime Error
     */
}
