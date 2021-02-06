package com.gokcedx.enums;

/**
 * java-variables-output-exercises
 *
 * @author Gökçe Doğanay
 * @version 06.02.2021
 */
public enum EnumDays {
    MONDAY("Monday",1),
    TUESDAY("Tuesday",2),
    WEDNESDAY("Wednesday",3),
    THURSDAY("Thursday",4),
    FRIDAY("Friday",5),
    SATURDAY("Saturday",6),
    SUNDAY("Sunday",7),
    NULLDAY(null,0);

    private String name;
    private int number;

    EnumDays(String name, int number){
        this.name = name;
        this.number = number;
    }

    @Override
    public String toString() {
        return name;
    }
}
