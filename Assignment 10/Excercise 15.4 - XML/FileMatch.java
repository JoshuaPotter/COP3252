// Joshua Potter, jop13 
// FileMatch.java
import java.io.BufferedWriter; 
import java.io.BufferedReader; 
import java.io.IOException; 
import java.nio.file.Files;
import java.nio.file.Paths;
import javax.xml.bind.JAXB;
import java.io.FileNotFoundException;     
import java.lang.SecurityException;
import java.util.*;

public class FileMatch {
   public static Account filematch(TransactionRecord record, Accounts accountList, List<Integer> logList) {
      Account temp = null;
      boolean found = false;
      for(Account account : accountList.getAccounts()) {
         if(account.getAccountNumber() == record.getAccountNumber()) {
            found = true;
            temp = account;
         }
      }
      if(found == false) {
         logList.add(record.getAccountNumber());
      }
      return temp;
   }
   public static void main(String[] args) {
      Account account = new Account();
      TransactionRecord transaction = new TransactionRecord();
      Accounts accounts = new Accounts();
      TransactionRecords records = new TransactionRecords();
      List<Integer> logList = new ArrayList<Integer>();

      // open oldmast.xml, read its contents and put in list
      try(BufferedReader input = Files.newBufferedReader(Paths.get("oldmast.xml"))) {
         accounts = JAXB.unmarshal(input, Accounts.class);
      } 
      catch (IOException ioException) {
         System.err.println("Error opening file. Terminating.");
      } 

      // open trans.xml, read its contents and put in list
      try(BufferedReader input = Files.newBufferedReader(Paths.get("trans.xml"))) {
         records = JAXB.unmarshal(input, TransactionRecords.class);     
      } 
      catch (IOException ioException) {
         System.err.println("Error opening file. Terminating.");
      } 

      // find match in data 
      boolean found = false;
      for(TransactionRecord record : records.getRecords()) {
         if(filematch(record, accounts, logList) != null) {
            filematch(record, accounts, logList).combine(record);
         }
      }
      
      // open log.xml, output data to the file then close log.txt
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
      
      // open newmast.xml, output data to the file then close newmast.txt
      try (BufferedWriter output = Files.newBufferedWriter(Paths.get("newmast.xml"))) {
         JAXB.marshal(accounts, output);
      }
      catch (IOException ioException) {
         System.err.println("Error opening file. Terminating.");
      } 
   } 
} 