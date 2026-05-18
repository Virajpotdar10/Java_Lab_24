package Experiment_2;
import java.util.Scanner;

public class StackQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int stack[] = new int[5];
        int top = -1;
        int queue[] = new int[5];
        int front = 0;
        int rear = -1;

        int choice;
        do {
            System.out.println("\n1. Push (Stack)");
            System.out.println("2. Pop (Stack)");
            System.out.println("3. Enqueue (Queue)");
            System.out.println("4. Dequeue (Queue)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1: // Push
                    if (top == stack.length - 1) {
                        System.out.println("Stack Overflow");
                    } else {
                        System.out.print("Enter value to push: ");
                        int val = sc.nextInt();
                        stack[++top] = val;
                        System.out.println("Pushed Successfully");
                    }
                    break;

                case 2: // Pop
                    if (top == -1) {
                        System.out.println("Stack Underflow");
                    } else {
                        System.out.println("Popped Element: " + stack[top--]);
                    }
                    break;

                case 3: // Enqueue
                    if (rear == queue.length - 1) {
                        System.out.println("Queue Overflow");
                    }
                    else {
                        System.out.print("Enter value to enqueue: ");
                        int val = sc.nextInt();
                        queue[++rear] = val;
                        System.out.println("Enqueued Successfully");
                    }
                    break;

                case 4: // Dequeue
                    if (front > rear) {
                        System.out.println("Queue Underflow");
                    } else {
                        System.out.println("Removed Element: " + queue[front++]);
                    }
                    break;

                case 5:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}