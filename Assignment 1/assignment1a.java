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

        // System.out.printf("First: %d%nSecond: %d%nThird: %d%n", firstNum, secondNum, thirdNum);
        System.out.printf("Sum: %d%n", (firstNum + secondNum + thirdNum));
        System.out.printf("Average: %d%n", (firstNum + secondNum + thirdNum)/3);
        System.out.printf("Product: %d%n", (firstNum * secondNum * thirdNum));

        // find smallest
        if(firstNum <= secondNum) {
            if(firstNum <= thirdNum) {
                System.out.printf("Smallest value: %d%n", firstNum);
            } else {
                System.out.printf("Smallest value: %d%n", thirdNum);
            }
        } else {
            if(secondNum <= thirdNum) {
                System.out.printf("Smallest value: %d%n", secondNum);
            } else {
                System.out.printf("Smallest value: %d%n", thirdNum);
            }
        }

        // find largest
        if(firstNum >= secondNum) {
            if(firstNum >= thirdNum) {
                System.out.printf("Largest value: %d%n", firstNum);
            } else {
                System.out.printf("Largest value: %d%n", thirdNum);
            }
        } else {
            if(secondNum >= thirdNum) {
                System.out.printf("Largest value: %d%n", secondNum);
            } else {
                System.out.printf("Largest value: %d%n", thirdNum);
            }
        }
    } // end main method
} // end class assignment1a