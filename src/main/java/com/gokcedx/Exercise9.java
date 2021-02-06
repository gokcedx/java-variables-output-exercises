package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public class Exercise9 {

    public int a = 100;

    public static void main(String[] args) {
        Exercise9 exercise9 = new Exercise9();

//        Satır açıldığında
//        exercise9.addAndPrint(a);
    }

    private void addAndPrint(){
        this.a += 20;
        System.out.println(a);
    }

    /**
     * A) Compile Error
     * B) 100
     * C) 120
     * D) 20
     */
}
