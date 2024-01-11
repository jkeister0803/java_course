package chapter4;

/*
 * FOR LOOP:
 * Write a cashier program that will scan a given number of items and tally the cost.
 */

import java.util.Scanner;

public class Cashier {

    public static void main(String[] args) {

        //Algorithm:
        // Init scanner
        // Ask user number of items to be scanned and store in variable
        // Close scanner
        // Declare a total variable and assign it to 0
        // FOR LOOP (int i = 0; i < items; i++)
            // Ask what is the cost and store in variable
            // Add cost of item to total
        // Output: total

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many items do you have?");
        int items = scanner.nextInt();

        double total = 0;

        for (int i = 0; i < items; i++) {
            System.out.println("What does this item cost?");
            double price = scanner.nextDouble();

            total = total + price; // Shorthand: total += cost;
        }

        scanner.close();
        System.out.printf("Your total today is $%.2f.", total);
    }
}
