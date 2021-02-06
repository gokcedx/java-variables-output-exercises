package com.gokcedx;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public class Exercise8 {

    private int a = 10;

    public static void main(String[] args) {

        Exercise8 exercise8 = new Exercise8();
        exercise8.add(8);
        exercise8.print();
    }

    private void add(int a){
        this.a += 20;
    }

    private void print(){
        System.out.println(a);
    }

    /**
     * A) Runtime Error
     * B) 10
     * C) 28
     * D) 30
     */
}
