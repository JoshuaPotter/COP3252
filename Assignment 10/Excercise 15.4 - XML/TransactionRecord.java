public class TransactionRecord {
   private int account_number;
   private double transactions;

   // initializes an Account with default values
   public TransactionRecord() {
      this(0, 0);
   } 
  
   // initializes an Account with provided values
   public TransactionRecord(int an, double t) {
      this.account_number = an;
      this.transactions = t;
   }

   public int getAccountNumber() {
      return account_number;
   }
   public void setAccountNumber(int an) {
      account_number = an;
   }

   public double getTransactions() {
      return transactions;
   }
   public void setTransactions(double t) {
      transactions = t;
   }
}