// Joshua Potter, jop13
// Assignment 1b (ex. 3.12)
// Invoice.java

public class Invoice {
    private String part_number;
    private String part_description;
    private int quantity;
    private double item_price;

    // default constructor
    public Invoice() {    }

    // constructor
    public Invoice(String part_number, String part_description, int quantity, double item_price) {
        this.part_number = part_number;
        this.part_description = part_description;
        
        if(quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;

        if(item_price < 0) {
            item_price = 0.0;
        }
        this.item_price = item_price;
    }

    // set methods
    public void setPartNumber(String part_number) {
        this.part_number = part_number;
    }
    public void setPartDescription(String part_description) {
        this.part_description = part_description;
    }
    public void setQuantity(int quantity) {
        if(quantity < 0) {
            quantity = 0;
        }
        this.quantity = quantity;
    }
    public void setItemPrice(double item_price) {
        if(item_price < 0) {
            item_price = 0.0;
        }
        this.item_price = item_price;
    }

    // get methods
    public String getPartNumber() {
        return part_number;
    }
    public String getPartDescription() {
        return part_description;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getItemPrice() {
        return item_price;
    }
    public double getInvoiceAmount() {
        return (quantity * item_price);
    }
}