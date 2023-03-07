package com.knoldus2;

import java.util.Scanner;

/*Write a program to find the largest of three numbers*/

public class LargestOfThree {

    static void LargestNumber(int FirstNumber, int SecondNumber, int ThirdNumber){
        if(FirstNumber>SecondNumber && SecondNumber>ThirdNumber)
        {
            System.out.println("First Number is Largest");
        }
        else if (SecondNumber>FirstNumber && SecondNumber>ThirdNumber)
        {
            System.out.println("Second Number is Largest");
        }
        else
        {
            System.out.println("Third Number is Largest");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 3 Numbers: ");
        int firstNumber, secondNumber, thirdNumber;
        firstNumber=input.nextInt();
        secondNumber=input.nextInt();
        thirdNumber=input.nextInt();
        LargestNumber(firstNumber,secondNumber,thirdNumber);
    }
}
