// FileMatch.java
import java.io.IOException;
import java.lang.IllegalStateException;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class FileMatch {
   public static Account filematch(TransactionRecord tr, List<Account> accountList, List<Integer> logList) {
      Account temp = null;
      boolean found = false;
      for(Account account : accountList) {
         if(account.getAccountNumber() == tr.getAccountNumber()) {
            found = true;
            temp = account;
         }
      }
      if(found == false) {
         logList.add(tr.getAccountNumber());
      }
      return temp;
   }
   public static void main(String[] args) {
      Account account = new Account();
      TransactionRecord transaction = new TransactionRecord();
      List<Account> accountList = new ArrayList<Account>();
      List<TransactionRecord> transactionList = new ArrayList<TransactionRecord>();
      List<Integer> logList = new ArrayList<Integer>();

      // open oldmast.txt, read its contents and put in list
      try(Scanner oldmast = new Scanner(Paths.get("oldmast.txt"))) {
         // read record from file
         while (oldmast.hasNext()) { // while there is more to read
            Account temp = new Account(oldmast.nextInt(), oldmast.next(), oldmast.next(), oldmast.nextDouble());
            accountList.add(temp);
         }       
      } 
      catch (IOException | NoSuchElementException | 
         IllegalStateException e) {
         e.printStackTrace();
      } 

      // open trans.txt, read its contents and put in list
      try(Scanner trans = new Scanner(Paths.get("trans.txt"))) {
         // read record from file
         while (trans.hasNext()) { // while there is more to read
            TransactionRecord temp = new TransactionRecord(trans.nextInt(), trans.nextDouble());
            transactionList.add(temp);
         }       
      } 
      catch (IOException | NoSuchElementException | 
         IllegalStateException e) {
         e.printStackTrace();
      } 

      // find match in data 
      boolean found = false;
      for(TransactionRecord tr : transactionList) {
         if(filematch(tr, accountList, logList) != null) {
            filematch(tr, accountList, logList).combine(tr);
         }
      }
      
      // open log.txt, output data to the file then close log.txt
      try (Formatter output = new Formatter("log.txt")) {
         for(int log: logList) {
            output.format("Unmatched transaction record for account number %d\n", log);
         }
      }
      catch (SecurityException | FileNotFoundException | 
         FormatterClosedException e) {
         e.printStackTrace();
         System.exit(1); // terminate the program
      } 
      
      // open newmast.txt, output data to the file then close newmast.txt
      try (Formatter output = new Formatter("newmast.txt")) {
         for(Account a: accountList) {
            output.format("%d %s %s %.2f\n", a.getAccountNumber(), a.getFirstName(), a.getLastName(), a.getBalance());
         }
      }
      catch (SecurityException | FileNotFoundException | 
         FormatterClosedException e) {
         e.printStackTrace();
         System.exit(1); // terminate the program
      } 
   } 
} 