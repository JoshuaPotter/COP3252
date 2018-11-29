// Joshua Potter, jop13
// Ex. 14.5, RandomSentences.java

import java.util.Random;

public class RandomSentences {
   public static void main(String[] args) {
      StringBuilder buffer = new StringBuilder();
      Random rand = new Random();
      String[] article = {"the", "a", "one", "some", "any"};
      String[] noun = {"boy", "girl", "dog", "town", "car"};
      String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
      String[] preposition = {"to", "from", "over", "under", "on"};

      for(int i = 1; i <= 20; i++) {
         // build 20 sentences
         int r = rand.nextInt(5); // 0 to 4
         buffer.append(i + ") ");
         buffer.append(article[r].substring(0,1).toUpperCase() + article[r].substring(1) + " ");
         r = rand.nextInt(5);
         buffer.append(noun[r] + " ");
         r = rand.nextInt(5);
         buffer.append(verb[r] + " ");
         r = rand.nextInt(5);
         buffer.append(preposition[r] + " ");
         r = rand.nextInt(5);
         buffer.append(article[r] + " ");
         r = rand.nextInt(5);
         buffer.append(noun[r] + ".");
         r = rand.nextInt(5);
         System.out.printf("%s%n", buffer.toString());
         buffer.setLength(0);
      }
   }
}