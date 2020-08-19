package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        radius = input.nextDouble();
        pi = 3.14;
        area = Circle.getArea(radius); //pi * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
