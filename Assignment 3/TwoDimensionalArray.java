// Joshua Potter, jop13
//  TwoDimensionalArray.java, Deitel

import java.security.SecureRandom; // random numbers

public class TwoDimensionalArray {
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args) {
        int[][] array = new int[4][6]; // 4 col, 6 row (works at any size)
        
        // fill with random numbers
        for(int col = 0; col < array.length; col++) {
            if(col < array.length-1) {
                for(int row = 0; row < array[0].length; row++) {
                    if(row < array[0].length-1) {
                        // add random number (0-9) to free cell
                        array[col][row] = randomNumbers.nextInt(10);
                    }
                }
            } else {
                // add value 0 to position (6,4)
                array[array.length-1][array[0].length-1] = 0;
            }
        }

        // sum columns and put values in last row of columns
        for(int col = 0; col < array.length; col++) {
            if(col < array.length-1) {
                for(int row = 0; row < array[0].length; row++) {
                    if(row < array[0].length-1) {
                        array[col][array[0].length-1] += array[col][row]; 
                    }
                }
            }
        }

        // sum rows and put values in last column of rows
        for(int row = 0; row < array[0].length; row++) {
            if(row < array[0].length-1) {
                for(int col = 0; col < array.length; col++) {
                    if(col < array.length-1) {
                        array[array.length-1][row] += array[col][row];
                    }
                }
            }
        }

        // print table
        for(int row = 0; row < array[0].length; row++) {
            for(int col = 0; col < array.length; col++) {
                System.out.printf("%-4d ", array[col][row]);
                if(col == array.length-1) {
                    System.out.println();
                }
            }
        }
    }
}