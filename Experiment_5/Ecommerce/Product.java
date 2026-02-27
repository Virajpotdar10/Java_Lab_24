package Experiment_5.Ecommerce;

public class Product {

    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }
}