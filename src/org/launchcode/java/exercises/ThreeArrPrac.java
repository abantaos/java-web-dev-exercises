package org.launchcode.java.exercises;

import java.util.Arrays;

public class ThreeArrPrac {
    public static void main(String[] args) {
        int nums[] = {1, 1, 2, 3, 5, 8};

//      Print numbers in array

          for (int i : nums) {
              System.out.println(i);
          }

//      Print odd numbers in array

            for (int i=0; i < nums.length; i++) {
                if (nums[i] % 2 != 0) {
                    System.out.println(nums[i]);
                }
            }

//      Print separated by sentences

            String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

            String[] arr = str.split("\\.");

            System.out.println(Arrays.toString(arr));
    }
}
