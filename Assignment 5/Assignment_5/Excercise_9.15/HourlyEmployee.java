// Joshua Potter, jop13
// Ex. 9.15, HourlyEmployee.java

public class HourlyEmployee extends Employee {
   private double hours; // hours worked
   private double wages; // wages per hour

   public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber,
         double hours, double wages) {
      // implicit constructor

      // superclass constructor
      super(firstName, lastName, socialSecurityNumber);

      // check if arguments are valid
      if (hours < 0.0 || hours > 168.0) {
         throw new IllegalArgumentException("Hours must be >= 0.0 or < 168.0");
      }

      if (wages < 0.0) {
         throw new IllegalArgumentException("Wages must be >= 0.0");
      }

      // assign values if arguments are valid
      this.hours = hours;
      this.wages = wages;
   }

   // return hours
   public double getHours() {
      return hours;
   }

   // return wages
   public double getWages() {
      return wages;
   }

   // set hours 
   public void setHours(double hours) {
      // check if argument is valid
      if (hours < 0.0 || hours > 168.0) {
         throw new IllegalArgumentException("Hours must be >= 0.0 or < 168.0");
      }
      this.hours = hours;
   }

   public void setWages(double wages) {
      if (wages < 0.0) {
         throw new IllegalArgumentException("Wages must be >= 0.0");
      }
      this.wages = wages;
   }

   public double earnings() {
      return wages * hours;
   }

   @Override
   public String toString() {
      
   }

}