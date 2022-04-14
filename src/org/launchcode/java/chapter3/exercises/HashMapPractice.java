package org.launchcode.java.chapter3.exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapPractice {
    public static void main(String[] args){
        HashMap<String, Double> students = new HashMap<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Student: ");
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                System.out.print("ID: ");
                Double newID = input.nextDouble();
                students.put(newStudent, newID);

                // Read in the newline before looping back
                input.nextLine();
            }

        } while(!newStudent.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");
        double sum = 0.0;

        for (Map.Entry<String, Double> student : students.entrySet()) {
            System.out.println("Student: " + student.getKey());
            System.out.println("ID: " + student.getValue());
        }

    }
}
