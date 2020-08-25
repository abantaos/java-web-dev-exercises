package org.launchcode.java.exercises;

import java.util.Scanner;

public class TwoSearch {
    public static void main(String[] args) {
        String sentence;
        String term;
        Boolean contains;

        Scanner input = new Scanner(System.in);
        sentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        System.out.println("Term to search for: ");
        term = input.nextLine().toLowerCase();
        contains = sentence.toLowerCase().contains(term);
        System.out.println(contains);
        int index = sentence.toLowerCase().indexOf(term.toLowerCase());
        System.out.println(index);
        //System.out.println(lowerSentence.replace(searchTerm, replacement ""));
        //works but loses capitalization

        //get everything from beginning to index
        //String firstPart = sentence.substring(0, index);

        //get everything from after the word to the end
        //String secondPart = sentence.substring(index + searchTerm.length());

        //System.out.println(firstPart + secondPart);
        input.close();
    }
}
