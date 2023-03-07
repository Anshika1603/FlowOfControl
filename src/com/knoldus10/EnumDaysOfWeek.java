package com.knoldus10;

/*Write a program to define an enum class for the days of the week and print the names of all the days.*/

public class EnumDaysOfWeek {
    public static void main(String[] args) {
        enum Days{
            Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
        }
        for(Days DayOfWeek: Days.values()) {
            System.out.println(DayOfWeek);
        }
    }
}
