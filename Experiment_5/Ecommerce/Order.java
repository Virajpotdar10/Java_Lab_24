package Experiment_5.Ecommerce;

public class Order {

    Product product;
    Customer customer;
    int quantity;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public double calculateTotalCost() {
        return product.getPrice() * quantity;
    }

    public void placeOrder() {
        System.out.println("Order Placed Successfully!");
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + calculateTotalCost());
    }
}