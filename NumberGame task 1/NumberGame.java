// This is my first Task and we are going to make a number guessing game.

import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    // Fix the number or attempts by user->10;
    public static final int Max_Attempts = 10;

    public static void main(String[] args) {
        // make a object to take input from user.
        Scanner sc = new Scanner(System.in);
        // make a object for generate a random number.
        Random random = new Random();
        boolean playagain = true;

        while (playagain) {
            // now generate a random number;
            int targetnumber = random.nextInt(100) + 1;
            int attempts = 0;
            boolean guessedcorrect = false;

            System.out.println("Guess a number between 1 to 100... ");

            while (attempts < Max_Attempts && !guessedcorrect) {
                System.out.println("Enter the Guess: ");
                int userguess = sc.nextInt();
                attempts++;

                if (userguess == targetnumber) {
                    guessedcorrect = true;
                    System.out.println("Congratulations! You Guessed the Number in " + attempts + " attempts...");

                } else if (userguess < targetnumber) {
                    System.out.println("Too low! Think High and try again...");
                } else {
                    System.out.println("Too High! Think low and try again...");
                }
            }
            if (!guessedcorrect) {
                System.out.println("\nSORRY! You have used all " + Max_Attempts + "attempts...");
            }

            System.out.println("If you want to play again? (Yes/No)");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("yes");
        }
        sc.close();
        System.out.println("Thanku for playing!.");
    }

}