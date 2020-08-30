package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ThreeArrListPra {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

//        To directly create Array, convert to ArrayList
//        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));


        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);

//        Print numbers 1-10
//        System.out.println(numbers);

//        Print sum of even numbers in array
        int sumEvens = 0;

        for (int e : numbers) {
            if (e % 2 == 0) {
                sumEvens += e;
            }
        }
        System.out.println(sumEvens);
        System.out.println(numbers);

//        Calling following method to print word of amount of letters
        printWord();

    }

    public static void printWord() {

        ArrayList<String> words = new ArrayList<>();
        words.add("a");
        words.add("ab");
        words.add("abc");
        words.add("abcd");
        words.add("abcde");
        words.add("abcdef");

        // now arraylist words has these ^ words

        System.out.println(words);

        for (String x : words) {
            //if
        }

    }
}

