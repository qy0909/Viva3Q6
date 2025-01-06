package viva3;

public class Product {
    private String name;  // Name of the product
    private double price; // Price of the product
    private int stock;    // Stock count of the product

    // Constructor to initialize product details
    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Method to reduce stock
    public void reduceStock(int qty) {
        if (qty <= stock) {
            stock -= qty; // Reduce the stock only if sufficient quantity is available
        }
    }

    // Override toString to display product details
    @Override
    public String toString() {
        return name + ": RM" + String.format("%.2f", price);
    }
}