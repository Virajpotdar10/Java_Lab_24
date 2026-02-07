public class StackQueue{
    public static void main(String[] args) {
    System.out.println("Stack Implementation:");

        int stack[] = new int[5];
        int top = -1;

        stack[++top] = 10;
        stack[++top] = 20;
        stack[++top] = 30;

        System.out.println("Stack Elements:");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i]);
        }

        System.out.println("Popped Element: " + stack[top--]);
        System.out.println();
        System.out.println("Queue Implementation:");

        int queue[] = new int[5];
        int front = 0;
        int rear = -1;
        queue[++rear] = 100;
        queue[++rear] = 200;
        queue[++rear] = 300;

        System.out.println("Queue Elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(queue[i]);
        }

        System.out.println("Removed Element: " + queue[front++]);
    }
}
