package com.knoldus12;

import java.util.Scanner;

/*Write a program to define an enum class for the geometric shapes and calculate the area of each shape based on its properties.*/

public class GeometricShapes {
    enum Shape {
        CIRCLE, SQUARE, RECTANGLE, TRIANGLE
    }



    public static void main(String[] args) {
        Scanner UserInput= new Scanner(System.in);
        for(Shape shape: Shape.values())
        {
            if(shape==Shape.CIRCLE)
            {
                System.out.println("Enter Radius for Circle: ");
                double radius=UserInput.nextInt();
                double AreaOfCircle= Math.PI*radius*radius;
                System.out.println("Area Of Circle is "+AreaOfCircle);
            }
            if(shape==Shape.SQUARE)
            {
                System.out.println("Enter Side for Square: ");
                int side=UserInput.nextInt();
                int AreaOfSquare= side*side;
                System.out.println("Area Of Square is "+AreaOfSquare);
            }
            if(shape==Shape.RECTANGLE)
            {
                System.out.println("Enter Length of Rectangle: ");
                int length=UserInput.nextInt();
                System.out.println("Enter Breadth of Rectangle: ");
                int breadth=UserInput.nextInt();
                int AreaOfRectangle= length*breadth;
                System.out.println("Area Of Rectangle is "+AreaOfRectangle);
            }
            if(shape==Shape.TRIANGLE)
            {
                System.out.println("Enter Base of Triangle: ");
                int base=UserInput.nextInt();
                System.out.println("Enter Height of Triangle: ");
                int height=UserInput.nextInt();
                double AreaOfTriangle= 0.5*base*height;
                System.out.println("Area Of Triangle is "+AreaOfTriangle);
            }
        }
    }
}


