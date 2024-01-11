package chapter4;

/*
 * WHILE LOOP:
 * Calculate employee's pay. Allow input on number of hours worked,
 * then calculate pay based on $15 hourly rate without overtime.
 */

import java.util.Scanner;

public class GrossPayInputValidation {

    public static void main(String[] args) {

        // Algorithm:
        // Initiate scanner
        // Store hourly rate in variable
        // Store max hours in variable
        // Ask user for number of hours worked and store in a variable
        // WHILE (hoursWorked > 40)
            // Output: Invalid entry. Hours worked must be between 1 and 40. Try again.
        // Close scanner
        // Calculate total pay and store in variable
        // Output: Your pay this week is {totalPay}

        Scanner scanner = new Scanner(System.in);

        int hourlyRate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you work this week?");
        double hoursWorked = scanner.nextDouble();

        // INPUT VALIDATION:
        while (hoursWorked > maxHours || hoursWorked < 1) {
            System.out.println("Invalid entry. Hours worked must be between 1 and 40. Re-enter hours worked:");
            hoursWorked = scanner.nextDouble();
        }

        scanner.close();
        double totalPay = hoursWorked * hourlyRate;

        System.out.printf("Your pay this week is $%.2f", totalPay);
    }
}
