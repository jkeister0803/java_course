package chapter4;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores.
 * There are 24 students with 4 tests each.
 */

import java.util.Scanner;

public class AverageTestScores {

    public static void main(String[] args) {

        // Algorithm:
        // Init scanner
        // Store number of students in variable
        // Store number of tests in variable
        // FOR LOOP (int i = 0; i < students; i++)
            // Declare number of students in variable
            // Declare number of tests in variable
            // Ask student's name and store in variable
            // FOR LOOP (int j = 0; j < tests; j++)
                // Declare/assign cumulativeScore to 0
                // Ask test score and append to cumulativeScore
            // Calculate average score and store in variable
            // Output: {studentName}'s average test score is {averageScore}.

        Scanner scanner = new Scanner(System.in);

        int students = 2;
        int tests = 2;

        for (int i = 0; i < students; i++) {
            double avgScore = 0;
            double cumulativeScore = 0;
            System.out.println("Student name:");
            String name = scanner.next();

            for (int j = 0; j < tests; j++) {
                System.out.println("Test score:");
                double testScore = scanner.nextDouble();
                cumulativeScore = cumulativeScore + testScore;
            }

            avgScore = cumulativeScore / tests;
            System.out.printf("%1s's average test score is %.1f. \n", name, avgScore);
        }

        scanner.close();
    }
}
