package chapter5;

/*
 * OUR FIRST METHOD:
 * Write a method that asks a user for their name, then greets them by name.
 */

import java.util.Scanner;

public class Greetings {

    public static void main(String[] args) {

        // Algorithm:
        // Init scanner
        // Ask user their name and store it in a variable
        // Close scanner
        // Call greet method and pass it name as a parameter

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        scanner.close();
        greet(name);
    }

    private static void greet(String name) {

        // Algorithm:
        // OUTPUT: Hello, {name}!

        System.out.println("Hello, " + name + "!");
    }
}
