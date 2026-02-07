

class StaticDemo {
    static int count;

    static {
        System.out.println("From Static Block");
        count = 100;
    }
    static void display() {
        System.out.println("Static Method Called");
        System.out.println("Value of count: " + count);
    }

    public static void main(String[] args) {

        System.out.println("Inside main method");
        display();
        count = 200;

        System.out.println("Updated value of count: " + count);
    }
}
