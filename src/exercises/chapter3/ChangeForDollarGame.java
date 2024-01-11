package exercises.chapter3;

/*
 * Enter enough change to equal exactly $1.00
 * Create a program that asks a user to enter the quantities for the following coins:
 * pennies, nickels, dimes, and quarters. Your program should calculate the value of
 * the change. If exactly $1.00, they win! If more than $1.00, they lose and went over
 * by ?? amount.  If less than $1.00, they lose and were ?? short.
 */

import java.util.Scanner;

public class ChangeForDollarGame {

    public static void main(String[] args) {

        // Algorithm:
        // Initialize scanner
        // Store value of penny in variable
        // Store value of nickel in variable
        // Store value of dime in variable
        // Store value of quarter in variable
        // Store winning value in variable
        // Ask user how many pennies and store in variable
        // Ask user how many nickels and store in variable
        // Ask user how many dimes and store in variable
        // Ask user how many quarters and store in variable
        // Close scanner
        // Calculate value of change (val pennies + val nickels
        // + val dimes + val quarters) and store in variable
        // Declare variable to store difference (sumChange v. winningAmt)
        // Initiate condition:
        // IF sumChange < winningAmount
            // Calculate diff
            // Output: You lose. You're {difference} short.
        // ELSE IF sumChange > winningAmount
            // Calculate diff
            // Output: You lose. You're {difference} over.
        // ELSE
            // Output: Congratulations! You win!

        Scanner scanner = new Scanner(System.in);

        double valPenny = 0.01;
        double valNickel = 0.05;
        double valDime = 0.10;
        double valQuarter = 0.25;
        double winningAmount = 1.00;

        System.out.println("Enter number of pennies: ");
        int numPennies = scanner.nextInt();

        System.out.println("Enter number of nickels: ");
        int numNickels = scanner.nextInt();

        System.out.println("Enter number of dimes: ");
        int numDimes = scanner.nextInt();

        System.out.println("Enter number of quarters: ");
        int numQuarters = scanner.nextInt();
        scanner.close();

        double changeTotal = (numPennies * valPenny) + (numNickels * valNickel)
                + (numDimes * valDime) + (numQuarters * valQuarter);

        double diff;

        if (changeTotal < winningAmount) {
            diff = winningAmount - changeTotal;
            System.out.printf("You lose. You're %.2f short.", diff);
        }
        else if (changeTotal > winningAmount) {
            diff = changeTotal - winningAmount;
            System.out.printf("You lose. You're %.2f over.", diff);
        }
        else {
            System.out.println("Congrats! You win");
        }
    }
}
