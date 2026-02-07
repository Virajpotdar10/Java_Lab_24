import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[2][2];
        int b[][] = new int[2][2];
        int result[][] = new int[2][2];

        System.out.println("Enter first matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                a[i][j] = sc.nextInt();

        System.out.println("Enter second matrix:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                b[i][j] = sc.nextInt();

        System.out.println("1. Addition");
        System.out.println("2. Multiplication");
        System.out.println("3. Transpose of First Matrix");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1: // Addition
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[i][j] + b[i][j];
                break;

            case 2: // Multiplication
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        for (int k = 0; k < 2; k++)
                            result[i][j] += a[i][k] * b[k][j];
                break;

            case 3: // Transpose
                for (int i = 0; i < 2; i++)
                    for (int j = 0; j < 2; j++)
                        result[i][j] = a[j][i];
                break;

            default:
                System.out.println("Invalid choice");    
            }
            sc.close();

        System.out.println("Result:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++)
                System.out.print(result[i][j] + " ");
            System.out.println();
        }
    }
}
