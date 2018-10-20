// Joshua Potter, jop13
// PieceWorker.java
// Inherits Employee, but earns based on amount of pieces produced

public class PieceWorker extends Employee {
   private double wage;
   private int pieces;

   public PieceWorker(String first, String last, String SSN, Date birthDate, double wage, int pieces) {
      super(first, last, SSN, birthDate);
      this.wage = wage;
      this.pieces = pieces;
   }

   public double getWage() {return wage;}

   public int getPieces() {return pieces;}

   @Override
   public double earnings() {
      return getWage()*getPieces();
   }

   @Override                                                   
   public String toString() {                                  
      return String.format("%s: %s%n%s: $%,.2f; %s: %d",     
         "piece worker employee", super.toString(),              
         "wage", getWage(),                       
         "pieces", getPieces());              
   } 
}