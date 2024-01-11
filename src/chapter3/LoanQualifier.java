package chapter3;

/*
 * NESTED IFs:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */

import java.util.Scanner;

public class LoanQualifier {

    public static void main(String[] args) {

        // Algorithm:
        // Initialize scanner
        // Store known variables: minIncome, minTenure
        // Ask user income and store in variable
        // Create condition:
        // IF income >= minIncome
            // Ask user how long they've been with current employer and store in variable
            // Close scanner
            // NESTED IF tenure >= minTenure
                // Output congratulatory message on approval
            // Output denial with reason: Not employed at current employer for long enough
        // Output denial with reason: Income does not pass minimum qualifications

        Scanner scanner = new Scanner(System.in);

        int minIncome = 30000;
        int minTenure = 2;

        System.out.println("What is your current income?");
        double income = scanner.nextDouble();

        if (income >= minIncome) {
            System.out.println("How long have you been employed by your current employer?");
            double tenure = scanner.nextDouble();
            scanner.close();

            if (tenure >= minTenure) {
                System.out.println("Congratulations, you have been approved for a loan!");
            }
            else {
                System.out.println("Employment history does not meet minimum qualifications for loan approval.");
            }
        }
        else {
            System.out.println("Income does not meet minimum qualifications for loan approval.");
        }
    }
}
