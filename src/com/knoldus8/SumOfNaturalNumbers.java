package com.knoldus8;

import java.util.Scanner;

/*Write a program to find the sum of first n natural numbers using a while loop.*/

public class SumOfNaturalNumbers {

    static void CalculateSum(int Number)
    {
        int index = 1;
        int sum=0;
        while(index<=Number)
        {
            sum=sum+index;
            index++;
        }
        System.out.println("Sum is : "+sum);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number = input.nextInt();
        CalculateSum(number);
    }
}
