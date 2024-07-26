package org.example;

public class Product {
    private double productCost;
    private int quantity;
    private String productName;

    public Product(String productName, double productCost, int quantity) {
        this.productName = productName;
        this.productCost = productCost;
        this.quantity = quantity;
    }

    public void totalCost() {
        double total = productCost * quantity;
        System.out.println("Total cost: " + quantity + " units of " + productName + " is: $ " + total);
    }

    public void printProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Quantity: " + quantity);
    }
}
