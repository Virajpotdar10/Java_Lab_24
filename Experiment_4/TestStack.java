package Experiment_4;

import java.util.Scanner;

interface Stack {

    int size = 5;   // interface variable

    void push(int value);
    void pop();
    void display();
    void overflow();
    void underflow();
}

class IntegerStack implements Stack {

    int arr[] = new int[size];
    int top = -1;

    public void push(int value) {
        if (top == size - 1) {
            overflow();
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack");
        }
    }

    public void pop() {
        if (top == -1) {
            underflow();
        } else {
            System.out.println(arr[top--] + " popped from stack");
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
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

public class TestStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack s = new IntegerStack();

        int choice, value;

        do {
            System.out.println("\n--- STACK MENU ---");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value to push: ");
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
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
