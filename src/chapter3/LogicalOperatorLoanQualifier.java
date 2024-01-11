package chapter3;

/*
 * LOGICAL OPERATORS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LogicalOperatorLoanQualifier {

    public static void main(String[] args) {

        // Algorithm:
        // Initialize scanner
        // Store known variables: minIncome, minTenure
        // Ask user income and store in variable
        // Ask user how long they've been with current employer and store in variable
        // Close scanner
        // Create condition:
        // IF income >= minIncome && tenure >= minTenure
            // // Output congratulatory message on approval
        // Output denial: You do not meet minimum qualifications for loan approval

        Scanner scanner = new Scanner(System.in);

        int minIncome = 30000;
        int minTenure = 2;

        System.out.println("What is your current income?");
        double income = scanner.nextDouble();

        System.out.println("How long have you been employed by your current employer?");
        double tenure = scanner.nextDouble();
        scanner.close();

        if (income >= minIncome && tenure >= minTenure) {
            System.out.println("Congratulations, you have been approved for a loan!");
        }
        else {
            System.out.println("You do not meet minimum qualifications for loan approval.");
        }
    }
}
