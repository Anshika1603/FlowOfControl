package com.knoldus9;

import java.util.Scanner;

/*Write a program to check if a given number is prime or not using a do-while loop.*/

public class PrimeNumber {

    static void Prime(int InputNumber){
        Boolean isPrime = true;
        int Number = 2;
        do {
            if (InputNumber == 2)
                break;
            else if (InputNumber == 1)
                isPrime = false;
            else if (InputNumber % Number == 0) {
                isPrime = false;
            }
            Number++;
        } while (Number < InputNumber);

        if(isPrime)
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not a Prime Number");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int inputNumber = input.nextInt();
        Prime(inputNumber);

    }
}
