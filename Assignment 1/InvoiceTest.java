// Joshua Potter, jop13
// Assignment 1b (ex. 3.12)
// InvoiceTest.java

public class InvoiceTest {
    public static void main(String args[]) {
        // create Invoice objects using both constructors
        Invoice invoice01 = new Invoice();
        Invoice invoice02 = new Invoice("0001", "Part #1", 1, 100.00);
        Invoice invoice03 = new Invoice("0002", "Part #2", -12, -200);

        // dump Invoice object values
        System.out.printf("Invoice 01 (Default Constructor)%n");
        System.out.println("-----");
        dumpInvoice("", invoice01);

        System.out.printf("%nInvoice 02 (Correct Constructor)%n");
        System.out.println("-----");
        dumpInvoice("", invoice02);

        System.out.printf("%nInvoice 03 (Negative Values in Constructor)%n");
        System.out.println("-----");
        dumpInvoice("", invoice03);

        // set new values for Invoice object
        invoice03.setItemPrice(50);
        invoice03.setPartDescription("Labor");
        invoice03.setPartNumber("0003");
        invoice03.setQuantity(10);

        // dump updated Invoice object values
        System.out.printf("%nInvoice 03 (Set Method Tests)%n");
        System.out.println("-----");
        dumpInvoice("NEW: ", invoice03);
    } 

    public static void dumpInvoice(String str, Invoice myInvoice) {
        // prints out Invoice object values with a string in the front of each print statement
        System.out.printf("%spart_number: %s%n", str, myInvoice.getPartNumber());
        System.out.printf("%spart_description: %s%n", str, myInvoice.getPartDescription());
        System.out.printf("%squantity: %d%n", str, myInvoice.getQuantity());
        System.out.printf("%sitem_price: %.2f%n", str, myInvoice.getItemPrice());
        System.out.printf("%sinvoice_amount: %.2f%n", str, myInvoice.getInvoiceAmount());
    }
}