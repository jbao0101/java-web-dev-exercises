package org.launchcode.java.chapter3.exercises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        int[] array = {1, 1, 2, 3, 5, 8};
        String str = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        for (int i=0; i<array.length; i++) {
            if (array[i]%2 != 0) {
                System.out.println(array[i]);
            }
        }

        String[] arrOfStr = str.split(" ");
        System.out.println(Arrays.toString(arrOfStr));

        String[] arrOfStr2  = str.split("\\.");
        System.out.println(Arrays.toString(arrOfStr2));

        String[] arrOfStr3  = str.split(",");
        System.out.println(Arrays.toString(arrOfStr3));

    }
}
