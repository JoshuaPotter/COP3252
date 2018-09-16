// Joshua Potter, jop13
// Ex. 6.29: CoinTossing.java, Deitel

import java.util.Scanner; // gather user input
import java.security.SecureRandom; // random numbers

public class CoinTossing {
    // create secure random number generator
    private static final SecureRandom randomNumbers = new SecureRandom();
    private static int heads, tails = 0;
    private static enum Coin { HEADS, TAILS };  
        Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean running = true;
        Coin side;
        char menu;

        System.out.printf("Toss a coin, try your luck.%n%n");
        do {
            System.out.printf("Heads: %d%n", heads);
            System.out.printf("Tails: %d%n%n", tails);
            System.out.println("Menu:");
            System.out.println("   T - (T)oss a coin");
            System.out.println("   E - (E)xit");
            System.out.print("Select an option: ");
            if(input.hasNext()) {
                menu = input.next().charAt(0);
                System.out.println();
                if(menu == 'T' || menu == 't') {
                    System.out.printf("Tossing a coin...%n%n");
                    side = flip();
                    switch(side) {
                        case HEADS: heads++;
                            break;
                        case TAILS: tails++;
                            break;
                    }
                } else if (menu == 'E' || menu == 'e') {
                    System.out.println("Exiting...");
                    running = false;
                } else {
                    System.out.printf("Invalid input.%n%n");
                }
            } else {
                System.out.printf("Invalid input.%n%n");
                input.next();
            }
        } while(running == true);

        input.close();
    }
    
    public static Coin flip() {
        if(randomNumbers.nextInt(2) == 0) {
            return Coin.HEADS;
        } else {
            return Coin.TAILS;
        }
    }
}