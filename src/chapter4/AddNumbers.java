package chapter4;

/*
 * DO WHILE LOOP:
 * Write a program that allows a user to enter two numbers,
 * and then sums up said numbers. The user should be able to
 * repeat this action until they indicate they are done.
 */

import java.util.Scanner;

public class AddNumbers {

    public static void main(String[] args) {

        // Algorithm:
        // Init scanner
        // Declare continue variable (bool)
        // Declare sum variable
        // DO WHILE continue is true
            // Ask user for first number and store in variable
            // Ask user for second number and store in variable
            // Calculate addition of numbers and assign to sum
            // Output: Sum
            // Ask user if they'd like to keep going and assign to variable
            // IF no
                // Set continue to false

        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true;
        double sum;

        do {
            System.out.println("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.println("Enter second number: ");
            double num2 = scanner.nextDouble();

            sum = num1 + num2;
            System.out.println(sum);

            System.out.println("Proceed (Y/N): ");
            String proceed = scanner.next();
            scanner.close();

            if (proceed.equalsIgnoreCase("N")) {
                keepGoing = false;
            }
        } while (keepGoing);
    }
}
