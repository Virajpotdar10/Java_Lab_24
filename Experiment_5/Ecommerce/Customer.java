package Experiment_5.Ecommerce;

public class Customer {

    String customerName;
    int customerId;

    public Customer(String customerName, int customerId) {
        this.customerName = customerName;
        this.customerId = customerId;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer ID: " + customerId);
    }
}