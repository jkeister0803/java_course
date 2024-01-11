package exercises.chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args){

        // Algorithm:
        // Instantiate Scanner to accept input
        Scanner scanner = new Scanner(System.in);

        // Ask user for a season
        System.out.println("Enter a season: ");

        // Store input in a variable (String)
        String season = scanner.next().toLowerCase();

        // Ask user for a whole number (int)
        System.out.println("Enter a whole number: ");

        // Store input in a variable (int)
        int number = scanner.nextInt();

        // Ask user for an adjective
        System.out.println("Enter an adjective: ");

        // Store input in a variable (String)
        String adjective = scanner.next().toLowerCase();
        scanner.close();

        // Output a sentence using above inputs formatted as such:
        // "On a [adjective] [season] day, I drink a minimum of [whole number] cups of coffee."
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
