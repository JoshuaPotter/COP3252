// Joshua Potter, jop13
// Ex. 6.9: RoundingNumbers.java, Deitel

import java.util.Scanner; // gather user input

public class RoundingNumbers {
    public static void main(String args[]) {
        boolean running = true;
        Scanner input = new Scanner(System.in);
        System.out.println("Round a double to the nearest integer. ");
        do {
            System.out.print("Enter a double (or 'exit' to quit): ");
            if(input.hasNextDouble()) {
                double d = input.nextDouble();
                System.out.printf("Original: %g%n", d);
                System.out.printf("Rounded: %.0f%n", Math.floor(d + 0.5));
            } else if (input.hasNext("exit")) {
                running = false;
            }  else {
                System.out.println("Invalid input.");
                input.next();
            }
        } while (running == true);
        input.close();
    }
}