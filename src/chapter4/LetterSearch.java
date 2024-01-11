package chapter4;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 */

import java.util.Scanner;

public class LetterSearch {

    public static void main(String[] args) {

        // Algorithm:
        // Init scanner
        // Ask user for a word and store in a variable
        // FOR LOOP (int i = 0; i < word.length; i++)
            // IF word.indexOf(i).equalsIgnoreCase("A")
                // Output: Letter found!
                // break;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word:");
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;

        for (int i = 0; i < text.length(); i++) {
            char letter = text.charAt(i);
            if (letter == 'A' || letter == 'a') {
                letterFound = true;
                break;
            }
        }

        if (letterFound) {
            System.out.println("Letter found!");
        }
        else {
            System.out.println("Letter not found.");
        }
    }
}
