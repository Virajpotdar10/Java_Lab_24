// Implement a Java program to print the area of a rectangle by creating a class named 
// 'Area' that has two methods. The first method, named 'setDim', takes the length and 
// breadth of the rectangle as parameters. The second method, named 'getArea', returns the 
// area of the rectangle. The length and breadth of the rectangle are entered through the 
// keyboard. 



import java.util.Scanner;

class Area {
    double length;
    double breadth;

    public void setDim(double l, double b) {
        length = l;
        breadth = b;
    }

    public double getArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area rect = new Area();

        System.out.print("Enter length of rectangle: ");
        double len = sc.nextDouble();

        System.out.print("Enter breadth of rectangle: ");
        double br = sc.nextDouble();

        rect.setDim(len, br);
        System.out.println("Area of Rectangle: " + rect.getArea());

        sc.close();
    }
}
