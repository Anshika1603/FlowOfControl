package com.knoldus3;

import java.util.Scanner;

/*Write a program to check if a given year is a leap year or not*/

public class LeapYear {

    static void isLeap(int year){
        boolean leap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;

        if(leap)
        {
            System.out.println(year+ " is a leap year");
        }
        else
        {
            System.out.println(year+ " is not a leap year");
        }
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter year : ");
        int Year = input.nextInt();
        isLeap(Year);
    }
}
