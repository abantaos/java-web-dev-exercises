package org.launchcode.java.studios;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ThreeCharacterCounter {

    public static void main(String[] args) {

//      Given text to test
      String text = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";


//      Ask user for text to test
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter some text: ");
//        String text = in.nextLine();
//        text = text.toLowerCase();


        HashMap<Character, Integer> counts = new HashMap<>();

//        for (int i = 0; i < text.length(); i++) {
//            char current = text.charAt(i) //get character in i-th position
//        }

        for (char c : text.toCharArray()) {

            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')) { //single quotes for character, double for string

                // looking for vowels
                // if (vowels.contains(c + "")) {

                // Seeing c for the first time
                if (!counts.containsKey(c)) {
                    counts.put(c, 1);
                } else { // Have already seen c
                    int seen = counts.get(c);
                    counts.put(c, seen + 1);
                }
            }
        }

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
