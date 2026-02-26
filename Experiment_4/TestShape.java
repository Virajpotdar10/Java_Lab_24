package Experiment_4;

import java.util.Scanner;

// Step 1: Create Shape Interface
interface Shape {
    void area();
}


// Step 2: Rectangle class implementing Shape
class Rectangle implements Shape {

    double length, breadth;

    Rectangle(double l, double b) {
        length = l;
        breadth = b;
    }

    public void area() {
        double result = length * breadth;
        System.out.println("Area of Rectangle = " + result);
    }
}


// Step 3: Triangle class implementing Shape
class Triangle implements Shape {

    double base, height;

    Triangle(double b, double h) {
        base = b;
        height = h;
    }

    public void area() {
        double result = 0.5 * base * height;
        System.out.println("Area of Triangle = " + result);
    }
}


// Step 4: Test Class
public class TestShape {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Shape r = new Rectangle(l, b);

        // Triangle input
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Shape t = new Triangle(base, height);

        System.out.println("\n--- Areas ---");
        r.area();
        t.area();

        sc.close();
    }
}
