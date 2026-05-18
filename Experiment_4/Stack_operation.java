// Stack Operations using Interface: Create an interface Stack with a variable size and 
// abstract methods push(), pop(), display(), overflow(), and underflow(). Implement a 
// subclass IntegerStack that implements the Stack interface. Create a test class to check the 
// working of all methods in the IntegerStack class.


import java.util.Scanner;

interface Stack {

    void push(int value);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {

    int arr[];
    int top = -1;
    int size;

    IntegerStack(int s) {
        size = s;
        arr = new int[size];
    }

    public void push(int value) {

        if (top == size - 1) {
            overflow();
        } 
        else {
            arr[++top] = value;
            System.out.println(value + " pushed");
        }
    }

    public void pop() {

        if (top == -1) {
            underflow();
        } 
        else {
            System.out.println(arr[top--] + " popped");
        }
    }

    public void display() {

        if (top == -1) {
            System.out.println("Stack is Empty");
        } 
        else {

            System.out.println("Stack Elements:");

            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public void overflow() {
        System.out.println("Stack Overflow");
    }

    public void underflow() {
        System.out.println("Stack Underflow");
    }
}

public class Stack_operation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Stack Size: ");
        int n = sc.nextInt();

        IntegerStack s = new IntegerStack(n);

        int ch, value;

        do {

            System.out.println("\n1.Push");
            System.out.println("2.Pop");
            System.out.println("3.Display");
            System.out.println("4.Exit");

            System.out.print("Enter Choice: ");
            ch = sc.nextInt();

            switch (ch) {

                case 1:

                    System.out.print("Enter Value: ");
                    value = sc.nextInt();

                    s.push(value);
                    break;

                case 2:

                    s.pop();
                    break;

                case 3:

                    s.display();
                    break;

                case 4:

                    System.out.println("Program End");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (ch != 4);

        sc.close();
    }
}