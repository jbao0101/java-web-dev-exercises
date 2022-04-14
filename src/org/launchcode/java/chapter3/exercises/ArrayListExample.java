package org.launchcode.java.chapter3.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
    }

    public static Double sumEvenNumbers(Double lang){
        ArrayList<Double> numbers = new ArrayList<>();
        Double sum = 0.0;

        for (int i=0; i<11; i++) {
            numbers.add(Math.floor(Math.random()*10));
        }
        for (int i=0; i<numbers.size(); i++){
            if (numbers.get(i)%2 == 0){
                sum+=numbers.get(i);
            }
        }
        return sum;
    }

    public static String fiveLetterWord(String lang){
        ArrayList<String> strings = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the length of a word to search for: ");
        String result = "";

        Integer searchNumber = input.nextInt();

        strings.add("hello");
        strings.add("it's");
        strings.add("me");

        for (int i=0; i<strings.size(); i++){
            if (strings.get(i).length() == searchNumber){
                result += (strings.get(i));
            }
        }
        return result;
    }

}
