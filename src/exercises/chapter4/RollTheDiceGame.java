package exercises.chapter4;

/*
 * Travel the entire game board of 20 spaces within 5 rolls of the die.
 * Roll the die for the user (generate random # between 1-6) and advance
 * the user that number of spaces.
 * After each roll, tell the user which game space they are on and how many
 * spaces remain to win.
 * If user gets to 20 before 5 rolls, end the game. They've won.
 * Greater or less than 20th space loses.
 * A message like "You advanced to space 22" is a bug.
 */

import java.util.Random;

public class RollTheDiceGame {

    public static void main(String[] args) {

        // Algorithm:
        // Instantiate Random class
        // Declare known variables: currentSpace, winningSpace, maxRolls
        // FOR LOOP (int i = 0; i < maxRolls; i++)
            // Roll the die (generate random number) and store in roll variable
            // Declare futureSpace and assign it value of currentSpace + roll
            // IF futureSpace == winningSpace
                // Assign currentSpace value of futureSpace
                // OUTPUT: Congrats! You've made it to space 20. You win!
                // BREAK;
            // ELSE IF futureSpace > winningSpace
                // Assign currentSpace value of futureSpace
                // OUTPUT: You've passed space 20. You lose.
                // BREAK;
            // ELSE
                // Assign currentSpace value of futureSpace
                // OUTPUT: You've advanced to space {currentSpace}.
        // END FOR LOOP
        // IF currentSpace < winningSpace
            // OUTPUT: You're out of die rolls. You lose.

        Random random = new Random();

        int currentSpace = 0;
        int winningSpace = 20;
        int maxRolls = 5;

        for (int i = 1; i <= maxRolls; i++) {
            int roll = random.nextInt(1, 7);
            currentSpace = currentSpace + roll;

            if (currentSpace == winningSpace) {
                System.out.printf("Roll %d: %d \nCongrats! You've made it to space %d. You win! \n", i, roll, winningSpace);
                break;
            }
            else if (currentSpace > winningSpace) {
                System.out.printf("Roll %d: %d \nYou've passed space %d. You lose. \n", i, roll, winningSpace);
                break;
            }
            else if (i == maxRolls) {
                System.out.printf("Roll %d: %d \nYou've advanced to space %d, but you're out of rolls. You lose. \n",
                        i, roll, currentSpace);
            }
            else {
                int spacesRemaining = winningSpace - currentSpace;
                System.out.printf("Roll %d: %d \nYou've advanced to space %d. You still have %d spaces to go. \n",
                        i, roll, currentSpace, spacesRemaining);
            }
        }
    }
}
