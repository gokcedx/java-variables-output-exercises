package com.gokcedx;

import com.gokcedx.enums.EnumDays;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public class Exercise11 {

    public static void main(String[] args) {

        // enums -> EnumDays SATURDAY

        String s = "Saturday";
        if(EnumDays.SATURDAY.toString().equals(s)){
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
