package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Circle.getArea(radius);

        do{
            System.out.println("Enter a radius: ");
            radius = input.nextDouble();

            if(radius < 0){
                System.err.println("Must enter number higher than 0");
            }

        } while(radius < 0);
            area = Circle.getArea(radius);
            System.out.println("The area of the circle with a radius of " + radius + " is: " + area);

    }
}
