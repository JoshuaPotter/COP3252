// Joshua Potter, jop13
// Ex. 6.29: CoinTossing.java, Deitel

import java.util.Scanner; // gather user input
import java.security.SecureRandom; // random numbers

public class CoinTossing {
    private static final SecureRandom randomNumbers = new SecureRandom();
    private int heads, tails = 0;
    private static enum Coin { HEADS, TAILS };

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Coin side;
        String menu;

        System.out.printf("Toss a coin, try your luck.%n%n");
        do {
            // Show score
            System.out.printf("Heads: %d%n", heads);
            System.out.printf("Tails: %d%n%n", tails);

            // Show menu
            System.out.println("Menu (number or string):");
            System.out.println("   1. Toss Coin");
            System.out.println("   2. Exit");
            System.out.print("Select an option: ");

            // Get input
            menu = input.nextLine();
            System.out.println();

            // Check if menu selection is valid
            if(menu.toLowerCase().equals("toss coin") || menu.toLowerCase().charAt(0) == '1') {
                // Toss a coin by calling flip() method and increment score
                side = flip();
                switch(side) {
                    case HEADS: heads++;
                        System.out.printf("Tossing a coin... Heads!%n%n");
                        break;
                    case TAILS: tails++;
                        System.out.printf("Tossing a coin... Tails!%n%n");
                        break;
                }
            } else if (menu.toLowerCase().equals("exit") || menu.toLowerCase().charAt(0) == '2') {
                // Exit code satisfied
                System.out.println("Exiting...");
                running = false;
            } else {
                System.out.printf("%s is not a menu option.%n%n", menu);
            }
        } while(running == true);

        input.close();
    }
    
    public static Coin flip() {
        // Get binary number and return enum
        // 0 is heads, 1 is tails
        if(randomNumbers.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}