package viva3;

public class Customer {
    private String name;          // Customer name
    private String email;         // Customer email
    private String shippingAddress; // Customer shipping address

    // Constructor to initialize customer details
    public Customer(String name, String email, String shippingAddress) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
    }

    // Accessor methods
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    // Override toString to display customer details
    @Override
    public String toString() {
        return "Invoice for " + name + "\nShipping Address: " + shippingAddress;
    }
}