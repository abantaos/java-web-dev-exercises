package org.launchcode.java.studios;

import java.time.LocalDate;

public class FourMenu {
    public static void main(String[] args) {
        // Instance of MenuItem class
        FourMenuItem pasta = new FourMenuItem();
        pasta.setItemName("Pasta");
        pasta.setItemPrice(24.99);
        pasta.setItemDescription("Alfredo");
        pasta.setItemCategory("Main Course");
        pasta.setItemNew("Yes");
        LocalDate dateUpdated = LocalDate.now();
        System.out.println("Item Name: " + pasta.getItemName());
        System.out.println("Item Price: " + pasta.getItemPrice());
        System.out.println("Item Description: " + pasta.getItemDescription());
        System.out.println("Item Category: " + pasta.getItemCategory());
        System.out.println("Item New: " + pasta.getItemNew());
        System.out.println("Date Updated: " + dateUpdated);

    }
}
