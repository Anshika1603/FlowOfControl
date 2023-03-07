package com.knoldus4;

import java.util.Scanner;

/*Write a program to check if a given number is positive, negative or zero using nested if statements*/

public class PositiveNegativeOrZero {

    static void PositiveOrNegative(int Number){
        if(Number<0)
        {
            System.out.println("Negative Number");
        } else if (Number>0)
        {
            System.out.println("Positive Number");
        }else
        {
            System.out.println("Number is zero");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number : ");
        int number=input.nextInt();
        PositiveOrNegative(number);
    }
}
