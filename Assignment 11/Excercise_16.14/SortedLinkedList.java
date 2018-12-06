// Joshua Potter, jop13
// SortedLinkedList.java
import java.util.*;

public class SortedLinkedList {
   public static void main(String[] args) {
      LinkedList<Integer> intlist = new LinkedList<Integer>();
      Random rand = new Random();
      int sum = 0;

      System.out.println("Generating 25 random integers between 0 and 100 in sorted order...");
      for(int i = 0; i < 25; i++) {
         // generate 25 random integers between 0 and 100
         addToList(intlist, rand.nextInt(100 + 1));
      }
      System.out.println(intlist);
      for(int i : intlist) {
         sum += i;
      }
      System.out.println("Sum: " + sum);
      System.out.println("Average: " + (Double.valueOf(sum)/Double.valueOf(intlist.size())));
   }
   public static void addToList(LinkedList<Integer> list, int i) {
      if(list.size() == 0) {
         // add at initial slot
         list.add(i);
      } else if (list.get(0) > i) {
         // first element is greater than integer, add integer after element
         list.add(0, i);
      } else if (list.get(list.size() - 1) < i) {
         // last element is less than integer, add integer before last element
         list.add(list.size(), i);
      } else {
         int iterator = 0;
         while(list.get(iterator) < i) {
            iterator++;
         }
         list.add(iterator, i);
      }
   }
}