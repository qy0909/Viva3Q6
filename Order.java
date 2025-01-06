package viva3;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products; // List to store products in the order

    // Constructor
    public Order() {
        this.products = new ArrayList<>(); // Initialize the products list
    }

    // Accessor method to get products
    public List<Product> getProducts() {
        return products;
    }

    // Add a product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove a product from the order
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Calculate the total price of the order
    public double calculateTotal() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice(); // Add price of each product
        }
        return total; // Return the total
    }
}