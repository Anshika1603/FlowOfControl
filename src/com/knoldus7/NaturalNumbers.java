package com.knoldus7;

import java.util.Scanner;

/*Write a program to print the first n natural numbers using a while loop.*/

public class NaturalNumbers {

    static void DisplayNaturalNumber(int Number)
    {
        int index=1;
        while(index<=Number)
        {
            System.out.println(index);
            index++;
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number=input.nextInt();
        DisplayNaturalNumber(number);
    }
}
