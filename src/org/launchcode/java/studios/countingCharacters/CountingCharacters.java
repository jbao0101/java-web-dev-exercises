package org.launchcode.java.studios.countingCharacters;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CountingCharacters {
    public static void main(String[] args){
        HashMap<Character, Integer> words = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a string: ");
        String newString = input.nextLine();
        newString = newString.toLowerCase();
        char[] charactersInString = newString.toCharArray();

        for (int i=0; i < charactersInString.length; i++) {
            if (Character.isLetter(charactersInString[i])) {
                if (!words.containsKey(charactersInString[i])) {
                    words.put(charactersInString[i], 1);
                } else {
                    words.put(charactersInString[i], words.get(charactersInString[i]) + 1);
                }
            }
        }

        System.out.println(words);

    }
}
