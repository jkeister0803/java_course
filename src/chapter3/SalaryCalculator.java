package chapter3;

import java.util.Scanner;

/*
IF Statement:
    - All salespeople get a payment of $1000 a week.
    - Salespeople who exceed 10 sales get an additional $250 bonus.
 */
public class SalaryCalculator {

    public static void main(String[] args){
        // Algorithm:
        // Instantiate scanner
        Scanner scanner = new Scanner(System.in);

        // Store base salary (1000) in a variable (int)
        // Store bonus (250) in a variable (int)
        // Store sales quota (int)
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        // Ask user for number of sales made
        System.out.println("How many sales did you make this week?");

        // Store sales input in a variable and close scanner
        int sales = scanner.nextInt();
        scanner.close();

        // Create condition:
        // IF Sales > 10 then add bonus to salary
        if (sales > quota) {
            salary = salary + bonus;
        }

        // Output sentence: "Employee's total pay this week is" + total pay + " dollars."
        System.out.println("Employee's total pay this week is $" + salary);
    }
}
