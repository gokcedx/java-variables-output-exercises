package com.gokcedx.enums;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public enum EnumNumber {

    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9);

    private int number;

    EnumNumber(int number){
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

}