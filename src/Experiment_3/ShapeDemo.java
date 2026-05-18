import java.util.*;

abstract class Shape {
    double dim1, dim2;

    Shape(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract void area();
}

class Rectangle extends Shape {

    Rectangle(double l, double b) {
        super(l, b);
    }

    void area() {
        System.out.println("Area of Rectangle = " + (dim1 * dim2));
    }
}

class Triangle extends Shape {
    Triangle(double base, double height) {
        super(base, height);
    }

    void area() {
        System.out.println("Area of Triangle = " + (0.5 * dim1 * dim2));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Rectangle Length: ");
        double l = sc.nextDouble();

        System.out.print("Rectangle Breadth: ");
        double b = sc.nextDouble();

        System.out.print("Triangle Base: ");
        double base = sc.nextDouble();

        System.out.print("Triangle Height: ");
        double height = sc.nextDouble();

        Shape rect = new Rectangle(l, b);
        Shape tri = new Triangle(base, height);

        rect.area();
        tri.area();
    }
}
