package com.knoldus5;

import java.util.Scanner;

/*Write a program to calculate the grade of a student based on their percentage using nested if statements.*/

public class StudentPercentage {

    static void DisplayGrade(int percentage){
        if(percentage<100 && percentage>=90)
        {
            System.out.println(" A Grade");
        } else if (percentage<90 && percentage>=80) {
            System.out.println("B Grade");
        } else if (percentage<80 && percentage>=70) {
            System.out.println("C Grade");
        } else if (percentage<70 && percentage>=60) {
            System.out.println("D Grade");
        } else if (percentage<60 && percentage>=50) {
            System.out.println("E Grade");
        } else {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Percentage: ");
        int Percentage=input.nextInt();
        DisplayGrade(Percentage);
    }
    }

