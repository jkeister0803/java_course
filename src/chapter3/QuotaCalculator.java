package chapter3;

/*
 * IF ELSE
 * All salespeople are expected to make at least 10 sales each week.
 * For those who do, they receive a congratulatory message.
 * For those who don't, they are informed of how many sales they were short.
 */

import java.util.Scanner;

public class QuotaCalculator {

    public static void main(String[] args) {

        // Algorithm:
        // Initialize scanner
        // Store known variable(s): quota
        // Ask user how many sales were made
        // Store sales made in variable
        // Close scanner
        // Create condition:
            // If sales met -> congratulatory message
            // Else -> calculate sales short and inform employee

        Scanner scanner = new Scanner(System.in);

        int quota = 10;

        System.out.println("How many sales did you make this week?");
        int sales = scanner.nextInt();
        scanner.close();

        if (sales >= quota) {
            System.out.println("Congratulations on making your quota this week.");
        }
        else {
            int salesShort = quota - sales;
            System.out.println("You were " + salesShort + " sales behind quota this week.");
        }
    }
}
