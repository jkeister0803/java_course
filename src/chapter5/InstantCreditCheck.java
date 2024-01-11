package chapter5;

/*
 * VARIABLE SCOPE:
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */

import java.util.Scanner;

public class InstantCreditCheck {

    // Declare known variables:
    static int requiredSalary = 25000;
    static int requiredCreditScore = 700;

    // Init scanner
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get remaining unknown data (salary, credit score)
        double salary = getSalary();
        int creditScore = getCreditScore();
        scanner.close();

        // Check if the user is qualified for a loan
        boolean isApproved = isUserQualified(salary, creditScore);

        // Notify the user
        notifyUser(isApproved);
    }

    // Create getFormData method
    public static double getSalary() {

        System.out.println("What is your current income?");
        double income;
        return income = scanner.nextDouble();
    }

    public static int getCreditScore() {

        System.out.println("What is your current credit score?");
        int credit;
        return credit = scanner.nextInt();
    }

    // Create getApproval method
    public static boolean isUserQualified(double income, int creditScore) {

        if (income >= requiredSalary && creditScore >= requiredCreditScore) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void notifyUser(boolean isApproved) {
        if (isApproved) {
            System.out.println("Congratulations! You have been approved for a loan.");
        }
        else {
            System.out.println("Sorry. You do not currently meet underwriting criteria for a loan.");
        }
    }
}
