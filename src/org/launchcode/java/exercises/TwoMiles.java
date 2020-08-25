package org.launchcode.java.exercises;

import java.util.Scanner;

public class TwoMiles {
    public static void main(String[] args) {
        double miles;
        double gas;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter miles driven: ");
        miles = input.nextDouble();
        System.out.println("Enter gallons of gas consumed: ");
        gas = input.nextDouble();
        milesPerGallon = miles / gas;
        System.out.println("Your miles per gallon is: " + milesPerGallon);
    }
}
