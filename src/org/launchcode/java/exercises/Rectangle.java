package org.launchcode.java.exercises;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        double length;
        double width;
        double area;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of rectangle:");
        length = input.nextDouble();
        System.out.println("Enter width of rectangle: ");
        width = input.nextDouble();
        area = length * width;
        System.out.println("The area of your rectangle is " + area);
    }
}
