// Joshua Potter, jop13
// Fig. 16.15: Sets.java
// HashSet used to remove duplicate values from array of strings.
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Scanner;

public class Sets {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      List<String> names = new ArrayList<String>();

      System.out.print("Enter a series of first names (ctrl+z to end input loop): \n");
      System.out.print(">> ");
      while (input.hasNext()) {
         names.add(input.nextLine());
         System.out.print(">> ");
      }
      
      //System.out.printf("List: %s%n", names);

      // eliminate duplicates then print the unique values
      printNonDuplicates(names);
      searchSet(names);
   }  

   // create a Set from a Collection to eliminate duplicates
   private static void printNonDuplicates(Collection<String> values) {
      // create a HashSet 
      Set<String> set = new HashSet<>(values);

      System.out.printf("%nNonduplicates are: ");

      for (String value : set) {
         System.out.printf("%s ", value);
      }

      System.out.println();
   } 

   private static void searchSet(Collection<String> values) {
      // create a HashSet 
      Set<String> set = new HashSet<>(values);
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter a name to search for (ctrl+z to exit loop): \n");
      System.out.print(">> ");
      while (input.hasNext()) {
         String name = input.nextLine();
         for (String value : set) {
            // System.out.printf("Value: %s\n", value);
            // System.out.printf("Name: %s\n", name);
            if(value.equals(name)) {
               System.out.printf("Name found: %s\n", value);
            }
         }
         System.out.print(">> ");
      }
   }
}



/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
