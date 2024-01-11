package exercises.chapter6;

import java.util.Scanner;

public class GeneratePhoneBill {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Instantiate instance of this class
        GeneratePhoneBill newPhoneBill = new GeneratePhoneBill();

        // Instantiate phone bill using default constructor and print itemized bill
        newPhoneBill.generateBill();
        System.out.println("**** NEXT BILL ****");

        // Instantiate phone bill using constructor that accepts ID and print itemized bill
        newPhoneBill.generateBill(1001);
        System.out.println("**** NEXT BILL ****");

        // Instantiate phone bill using constructor that accepts all class fields and print itemized bill
        newPhoneBill.generateBill(1002, 50.00, 50, 60);
    }

    public void generateBill() {
        PhoneBill bill = new PhoneBill();
        System.out.println("What is your plan ID?");
        bill.setId(scanner.nextInt());

        System.out.println("What is the base cost of your plan?");
        bill.setBaseCost(scanner.nextDouble());

        System.out.println("How many minutes does your plan allow?");
        bill.setMinutesAllowed(scanner.nextInt());

        System.out.println("How many minutes have you used?");
        bill.setMinutesUsed(scanner.nextInt());

        bill.printItemizedBill();
    }

    public void generateBill(int id) {
        PhoneBill bill = new PhoneBill(id);
        System.out.println("What is the base cost of your plan?");
        bill.setBaseCost(scanner.nextDouble());

        System.out.println("How many minutes does your plan allow?");
        bill.setMinutesAllowed(scanner.nextInt());

        System.out.println("How many minutes have you used?");
        bill.setMinutesUsed(scanner.nextInt());

        bill.printItemizedBill();
    }

    public void generateBill(int id, double baseCost, int minutesAllowed, int minutesUsed) {
        PhoneBill bill = new PhoneBill(id, baseCost, minutesAllowed, minutesUsed);
        bill.printItemizedBill();
    }
}
