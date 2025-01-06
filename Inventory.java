package viva3;
import java.util.HashMap;

public class Inventory {
    private HashMap<Product, Integer> productStock; // Store products with their quantities

    // Constructor to initialize the inventory
    public Inventory() {
        productStock = new HashMap<>();
    }

    // Add a product to the inventory with a given quantity
    public void addProduct(Product product, int qty) {
        productStock.put(product, qty);
    }

    // Check if a product is available with the specified quantity
    public boolean isAvailable(Product product, int qty) {
        Integer stock = productStock.get(product);
        return stock != null && stock >= qty; // Return true only if stock is sufficient
    }

    // Update stock after an order is processed
    public void updateStock(Product product, int qty) {
        if (isAvailable(product, qty)) {
            int currentStock = productStock.get(product);
            productStock.put(product, currentStock - qty); // Reduce stock in inventory
            product.reduceStock(qty); // Also update the stock in the product object
        }
    }
}