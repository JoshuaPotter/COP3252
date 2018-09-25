// Joshua Potter, jop13
//  TwoDimensionalArray.java, Deitel

import java.security.SecureRandom; // random numbers

public class TwoDimensionalArray {
    private static final SecureRandom randomNumbers = new SecureRandom();
    public static void main(String[] args) {
        int[][] array = new int[4][6]; // 4 col, 6 row

        // System.out.printf("Columns: %d%n", array.length); // col
        // System.out.printf("Rows: %d%n%n", array[0].length); // row
        
        // fill with random numbers
        for(int col = 0; col < array.length; col++) {
            if(col < 3) {
                for(int row = 0; row < array[0].length; row++) {
                    if(row < 5) {
                        // add random number (0-9) to cell
                        array[col][row] = randomNumbers.nextInt(10);
                    }
                }
            } else {
                array[3][5] = 0;
            }
        }

        // sum columns
        for(int col = 0; col < array.length; col++) {
            if(col < 3) {
                for(int row = 0; row < array[0].length; row++) {
                    if(row < 5) {
                        array[col][5] += array[col][row]; 
                    }
                }
            }
        }

        // sum rows
        for(int row = 0; row < array[0].length; row++) {
            if(row < 5) {
                for(int col = 0; col < array.length; col++) {
                    if(col < 3) {
                        array[3][row] += array[col][row];
                    }
                }
            }
        }

        // print table
        System.out.printf("(Row, Column): Integer%n");
        for(int row = 0; row < array[0].length; row++) {
            System.out.println();
            for(int col = 0; col < array.length; col++) {
                if(col == 3 && row == 5) {
                    // (6, 4): 0
                } else if (col == 3) {
                    System.out.print("Sum of row: ");
                } else if (row == 5) {
                    System.out.print("Sum of column: ");
                }
                System.out.printf("(%d, %d): %d%n", row+1, col+1, array[col][row]);
            }
        }
    }
}