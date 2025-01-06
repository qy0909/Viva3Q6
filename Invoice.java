package viva3;

public class Invoice {
    private Order order;      // The order associated with the invoice
    private Customer customer; // The customer details

    // Constructor to initialize invoice
    public Invoice(Order order, Customer customer) {
        this.order = order;
        this.customer = customer;
    }

    // Override toString to format and display the invoice
    @Override
    public String toString() {
        String invoice = customer + "\n\nProducts:\n";
        for (Product product : order.getProducts()) {
            invoice += "- " + product + "\n"; // List each product
        }
        invoice += "\nTotal: RM" + String.format("%.2f", order.calculateTotal());
        return invoice;
    }
}
