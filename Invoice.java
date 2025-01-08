package viva3;

import java.util.Map;

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
        StringBuilder invoice = new StringBuilder();

        // Add customer details
        invoice.append(customer).append("\n\n");

        // Add order details
        invoice.append("Products:\n");
        for (Map.Entry<Product, Integer> entry : order.getProducts().entrySet()) {
            Product product = entry.getKey();
            int quantity = entry.getValue();
            invoice.append("- ")
                    .append(product.getName())
                    .append(": RM")
                    .append(String.format("%.2f", product.getPrice()))
                    .append("\n");
        }

        // Add total
        invoice.append("\n").append(order).append("\nTotal: RM")
                .append(String.format("%.2f", order.calculateTotal()));

        return invoice.toString();
    }
}
