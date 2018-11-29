import java.util.Scanner; // gather user input

public class ReverseString {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      StringBuilder buffer = new StringBuilder();
      String s = "";

      System.out.println("Enter a sentence: ");
      buffer.append(input.nextLine());
      for(String words : buffer.reverse().toString().split("\\s+")) {
         s += words;
         s += " ";
      }
      System.out.printf("%s", s);
   }
}