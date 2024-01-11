package chapter3;

/*
 * IF/ELSE IFs:
 * Determine a student's letter grade based on test score.
 * A = >=90
 * B = 80-89
 * C = 70-79
 * D = 60-69
 * F = <60
 */

import java.util.Scanner;

public class TestResults {

    public static void main(String[] args) {

        // Algorithm:
        // Initialize scanner
        // Ask user for test score and store in variable
        // Close scanner
        // Declare an unassigned variable for grade (char)
        // Create condition:
        // IF test score in range for A
            // grade = A
        // ELSE IF test score in range for B
            // grade =  B
        // ELSE IF test score in range for C
            // grade =  C
        // ELSE IF test score in range for D
            // grade =  D
        // ELSE
            // grade =  F
        // Output: "Your letter grade is {grade}"

        Scanner scanner = new Scanner(System.in);

        System.out.println("What was your test score?");
        double score = scanner.nextDouble();
        scanner.close();

        char grade;

        if (score < 60) {
            grade = 'F';
        }
        else if (score < 70) {
            grade = 'D';
        }
        else if (score < 80) {
            grade = 'C';
        }
        else if (score < 90) {
            grade = 'B';
        }
        else {
            grade = 'A';
        }

        System.out.printf("Your letter grade is %c.", grade);

    }
}
