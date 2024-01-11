package chapter3;

/*
 * Demonstrates that despite having only one matching case in the switch statement,
 * the program will continue executing subsequent cases until a break is encountered.
 *
 * Example: month  = 8, yet the switch statement will execute cases where month = 8, 9,
 * 10, 11, and 12 until a break is hit.
 */
import java.util.ArrayList;

public class SwitchDemoFallThrough {

    public static void main(String[] args) {
        ArrayList<String> futureMonths = new ArrayList<String>();

        int month = 8;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                break;
            default: break;
        }

        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
                System.out.println(monthName);
            }
        }
    }
}
