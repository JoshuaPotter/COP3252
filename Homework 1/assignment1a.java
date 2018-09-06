// Joshua Potter, jop13
// Assignment 1a (ex. 2.17)
// assignment1a.java

import java.util.Scanner; // gather user input

public class assignment1a {
    // main method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three integers to display sum, average, product, smallest, and largest of the numbers.");

        System.out.print("Enter the first integer: ");
        int firstNum = input.nextInt();

        System.out.print("Enter the second integer: ");
        int secondNum = input.nextInt();

        System.out.print("Enter the third integer: ");
        int thirdNum = input.nextInt();

        input.close();

        System.out.printf("First: %d%nSecond: %d%nThird: %d%n", firstNum, secondNum, thirdNum);
    } // end main method
} // end class assignment1a