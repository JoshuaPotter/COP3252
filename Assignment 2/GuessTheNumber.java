// Joshua Potter, jop13
// Ex. 6.30: GuessTheNumber.java, Deitel

import java.util.Scanner; // gather user input
import java.security.SecureRandom; // random numbers

public class GuessTheNumber {
    private static final SecureRandom randomNumber = new SecureRandom();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running, guessed;
        int rand = randomNumber.nextInt(999) + 1;
        int guess;
        char playAgain;

        System.out.printf("CPU is picking random number between 1 and 1000. ");
        // Play again loop
        do {
            running = true;
            guessed = false;
            System.out.printf("Guess the number (0 to exit): ");

            // Guess checker loop
            do {
                guess = input.nextInt();
                
                if(guess == rand) {
                    // Correct guess
                    System.out.println("Congratulations. You guessed the number!");
                    guessed = true;

                    // Prompt to re-run program
                    System.out.printf("Would you like play again? (y/n): ");
                    playAgain = input.next().toLowerCase().charAt(0);
                    if(playAgain == 'n') {
                        // Exit code
                        running = false;
                    } else {
                        // generate new number and re-run program
                        rand = randomNumber.nextInt(999) + 1;
                        System.out.printf("CPU is picking random number between 1 and 1000. ");
                    }
                } else if (guess == 0) {
                    // Exit code
                    running = false;
                    guessed = true;
                } else {
                    // Give guess feedback
                    if (guess < rand) {
                        System.out.println("Too low. Try again.");
                    } else {
                        System.out.println("Too high. Try again.");
                    }
                    System.out.printf("Guess the number (0 to exit): ");
                }
            } while (guessed == false);
        } while (running);

        input.close();
        System.out.printf("Exiting...");
    }
}