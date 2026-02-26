import java.util.Scanner;

// Step 1: Abstract Class
abstract class Shape {

    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();   // abstract method
}


// Step 2: Rectangle Class
class Rectangle extends Shape {

    Rectangle(double l, double b) {
        super(l, b);
    }

    void area() {
        double result = dim1 * dim2;
        System.out.println("Area of Rectangle = " + result);
    }
}


// Step 3: Triangle Class
class Triangle extends Shape {

    Triangle(double base, double height) {
        super(base, height);
    }

    void area() {
        double result = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle = " + result);
    }
}


// Step 4: Main Class
public class ShapeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Rectangle input
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double b = sc.nextDouble();

        Shape rect = new Rectangle(l, b);

        // Triangle input
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Shape tri = new Triangle(base, height);

        System.out.println("\n--- Areas ---");
        rect.area();
        tri.area();

        sc.close();
    }
}
