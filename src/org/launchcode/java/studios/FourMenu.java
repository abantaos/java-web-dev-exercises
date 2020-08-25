package org.launchcode.java.studios;

import org.launchcode.java.demos.lsn3classes1.Student;

import java.time.LocalDate;

public class FourMenu {
    public static void main(String[] args) {
//         Instance of MenuItem class
        FourMenuItem pasta = new FourMenuItem("pasta", 24.99, "good", "Main Course", true);
        System.out.println("Item Name: " + pasta.getItemName() + "\nItem Price: " + pasta.getItemPrice());

//        LocalDate dateUpdated = LocalDate.now();
//        System.out.println("Date Updated: " + dateUpdated);

    }
}
