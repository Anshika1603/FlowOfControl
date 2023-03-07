package com.knoldus6;

import java.util.Scanner;

/*Write a program to print the name of the day based on the given day number using switch statements.*/

public class DaysOfWeek {

    static void DisplayDay(int Day){
        switch (Day)
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Not a valid Number");
                break;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Index of Day: ");
        int day=input.nextInt();
        DisplayDay(day);
    }
}
