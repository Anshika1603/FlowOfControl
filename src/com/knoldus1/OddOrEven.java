package com.knoldus1;

import java.util.Scanner;

/*Write a program to check if a given number is even or odd*/

public class OddOrEven {

    static void OddEven(int number)
    {
        if(number%2==0)
        {
            System.out.println("Even Number");
        }
        else
        {
            System.out.println("Odd Number");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int Number=input.nextInt();
        OddEven(Number);
    }
}
