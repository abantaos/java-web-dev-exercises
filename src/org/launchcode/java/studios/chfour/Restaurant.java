package org.launchcode.java.studios.chfour;

import java.util.ArrayList;

public class Restaurant {

    public static void main(String[] args) {

        ArrayList<MenuItem> foodMenu = new ArrayList<>();
        MenuItem pasta = new MenuItem("pasta", 24.99, "a", "b");

        foodMenu.add(pasta);
        System.out.println(foodMenu);
    }
}
