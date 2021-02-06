package com.gokcedx;

import com.gokcedx.enums.EnumNumber;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public class Exercise10 {

    public static void main(String[] args) {

        // enums -> EnumNumber FIVE

        int five = 5;
        if(EnumNumber.FIVE.equals(five)){
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
