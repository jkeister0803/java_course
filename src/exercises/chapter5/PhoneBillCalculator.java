package exercises.chapter5;

/*
 * Calculate the final total of someone's cell phone bill.
 * Allow the operator to input the plan fee and the number of overage of minutes.
 * Charge the user $0.25 per minute over allowance, and 15% tax on the subtotal.
 * Create separate methods to calculate the tax, overage fees, and final total.
 * Print the itemized bill.
 *
 * EXAMPLE OUTPUT:
 * Enter base cost of the plan:
 * 82.45
 * Enter overage minutes:
 * 9
 * Phone Bill Statement
 * Plan: $82.45
 * Overage: $2.25
 * Tax: $12.71
 * Total: $97.41
 */

import java.util.Scanner;

public class PhoneBillCalculator {

    // Declare known global variables
    static double overageCostPerMin = 0.25;
    static double taxRate = 0.15;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Get base price, overage minutes, close scanner
        double basePrice = getBasePrice();
        int overageMins = getOverageMins();
        scanner.close();

        // Calculate overage fees
        double overageFees = calculateOverageFees(overageCostPerMin, overageMins);

        // Calculate subtotal
        double subTotal = calculateSubTotal(basePrice, overageFees);

        // Calculate taxes on subtotal
        double taxes = calculateTax(subTotal, taxRate);

        // Calculate final total
        double billTotal = calculateFinalTotal(subTotal, taxes);

        generateItemizedStatement(basePrice, overageFees, taxes, billTotal);
    }

    public static double getBasePrice() {
        System.out.println("Enter base cost of the plan:");
        return scanner.nextDouble();
    }

    public static int getOverageMins() {
        System.out.println("Enter overage minutes:");
        return scanner.nextInt();
    }

    public static double calculateOverageFees(double overageCostPerMin, int overageMins) {
        return overageCostPerMin * overageMins;
    }

    public static double calculateSubTotal(double basePrice, double overageFees) {
        return basePrice + overageFees;
    }

    public static double calculateTax(double subTotal, double taxRate) {
        return subTotal * taxRate;
    }

    public static double calculateFinalTotal(double subTotal, double taxes) {
        return subTotal + taxes;
    }

    public static void generateItemizedStatement(double basePrice, double overageFees, double tax, double total) {
        System.out.println("Phone Bill Statement:");
        System.out.printf("Plan: $%.2f\n", basePrice);
        System.out.printf("Overage: $%.2f\n", overageFees);
        System.out.printf("Tax: $%.2f\n", tax);
        System.out.printf("Total: $%.2f\n", total);
    }
}
