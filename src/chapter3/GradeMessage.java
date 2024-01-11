package chapter3;

/*
 * SWITCH STATEMENT:
 * Print a specific message based on the letter grade provided using a SWITCH statement.
 */
import java.util.Scanner;

public class GradeMessage {

    public static void main(String[] args) {

        // Algorithm:
        // Initiate scanner for input
        // Ask user for letter grade and store it in a variable
        // Declare unassigned String variable to store 'message'
        // Initiate SWITCH
            // A -> Excellent job!
            // B -> Great job!
            // C -> Good job!
            // D -> You need to work a little harder
            // F -> Uh oh!
            // Default -> Error
        // Output message

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your letter grade:");
        String grade = scanner.next();

        String message;

        switch (grade) {
            case "A":
                message = "Excellent job!";
                break;
            case "B":
                message = "Great job!";
                break;
            case "C":
                message = "Good job!";
                break;
            case "D":
                message = "You need to work a little harder";
                break;
            case "F":
                message = "Uh oh!";
                break;
            default:
                message = "Error. Invalid grade";
                break;
        }

        System.out.println(message);
    }
}

/*
        ENHANCED SWITCH STATEMENT:
        String message = switch (grade) {
            case "A" -> "Excellent job!";
            case "B" -> "Great job!";
            case "C" -> "Good job!";
            case "D" -> "You need to work a little harder";
            case "F" -> "Uh oh!";
            default -> "Error. Invalid grade";
        };
 */