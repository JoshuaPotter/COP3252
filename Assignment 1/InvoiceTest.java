// Joshua Potter, jop13
// Assignment 1b (ex. 3.12)
// InvoiceTest.java

import java.util.Scanner;

public class InvoiceTest {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        Invoice invoice01 = new Invoice();
        Invoice invoice02 = new Invoice("0001", "Part #1", 1, 100.00);

        dumpInvoice("(invoice01) Initial ", invoice01);
        dumpInvoice("(invoice02) Initial ", invoice02);

        input.close();
    } 

    public static void dumpInvoice(String str, Invoice myInvoice) {
        System.out.printf("%spart_number: %s%n", str, myInvoice.getPartNumber());
        System.out.printf("%spart_description: %s%n", str, myInvoice.getPartDescription());
        System.out.printf("%squantity: %d%n", str, myInvoice.getQuantity());
        System.out.printf("%sitem_price: %.2f%n", str, myInvoice.getItemPrice());
    }
}