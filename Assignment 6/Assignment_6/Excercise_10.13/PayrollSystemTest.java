// Fig. 10.9: PayrollSystemTest.java
// Employee hierarchy test program.

import java.util.Scanner;

public class PayrollSystemTest {
   public static void main(String[] args) {
      // create user input
      int currentMonth;
      Scanner input = new Scanner(System.in);

      // create subclass objects
      SalariedEmployee salariedEmployee =
         new SalariedEmployee("John", "Smith", "111-11-1111", new Date(1,1,1990), 800.00);
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee("Karen", "Price", "222-22-2222", new Date(2,25,1995), 16.75, 40);
      CommissionEmployee commissionEmployee =
         new CommissionEmployee("Sue", "Jones", "333-33-3333", new Date(3,5,1989), 10000, .06);
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee("Bob", "Lewis", "444-44-4444", new Date(5,20,1956), 5000, .04, 300);

      // get current month
      do {
         System.out.println("What is the current month? (1-12): ");
         currentMonth = input.nextInt();
         if(currentMonth < 1 || currentMonth > 12) {
            System.out.println("Invalid month, please try again.");
         }
      } while(currentMonth < 1 || currentMonth > 12);

      System.out.printf("Employees processed individually: ");

      System.out.printf("%n%s%n%s: $%,.2f%n%n", 
         salariedEmployee, "earned", salariedEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         hourlyEmployee, "earned", hourlyEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n",
         commissionEmployee, "earned", commissionEmployee.earnings());
      System.out.printf("%s%n%s: $%,.2f%n%n", 
         basePlusCommissionEmployee, 
         "earned", basePlusCommissionEmployee.earnings());

      // create four-element Employee array
      Employee[] employees = new Employee[4]; 

      // initialize array with Employees        
      employees[0] = salariedEmployee;          
      employees[1] = hourlyEmployee;            
      employees[2] = commissionEmployee;        
      employees[3] = basePlusCommissionEmployee;

      System.out.printf("Employees processed polymorphically:%n%n");

      // generically process each element in array employees
      for (Employee currentEmployee : employees) {
         System.out.println(currentEmployee); // invokes toString

         // determine whether element is a BasePlusCommissionEmployee
         if (currentEmployee instanceof BasePlusCommissionEmployee) {
            // downcast Employee reference to 
            // BasePlusCommissionEmployee reference
            BasePlusCommissionEmployee employee = 
               (BasePlusCommissionEmployee) currentEmployee;

            employee.setBaseSalary(1.10 * employee.getBaseSalary());

            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f%n",
               employee.getBaseSalary());
         } 

         if(currentMonth == currentEmployee.getBirthDate().getMonth()) {
            System.out.printf("earned $%,.2f (w/ +$100)%n%n", currentEmployee.earnings()+100);
         } else {
            System.out.printf("earned $%,.2f%n%n", currentEmployee.earnings());
         }
      } 

      // get type name of each object in employees array
      for (int j = 0; j < employees.length; j++) {      
         System.out.printf("Employee %d is a %s%n", j,  
            employees[j].getClass().getName());         
      }                                                 

      input.close();
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
