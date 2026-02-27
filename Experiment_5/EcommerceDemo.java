package Experiment_5;
import Experiment_5.Ecommerce.*;


public class EcommerceDemo {

    public static void main(String[] args) {

        Product p1 = new Product("Laptop", 50000);
        Customer c1 = new Customer("Viraj", 101);

        Order order1 = new Order(p1, c1, 2);

        System.out.println("----- E-Commerce System -----");

        p1.displayProduct();
        System.out.println();

        c1.displayCustomer();
        System.out.println();

        order1.placeOrder();
    }
}