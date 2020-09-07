package org.launchcode.java.studios;

import java.util.ArrayList;

public class FiveRestaurant {

    public static void main(String[] args) {

        ArrayList<FourMenuItem> foodMenu = new ArrayList<>();
        FourMenuItem pasta = new FourMenuItem("pasta", 24.99, "a", "b");

        foodMenu.add(pasta);
        System.out.println(foodMenu);
    }
}
