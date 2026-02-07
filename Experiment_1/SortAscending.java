import java.util.Scanner;

public class SortAscending {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];

        System.out.println("Enter 10 numbers:");

        
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = i + 1; j < 10; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // Output
        System.out.println("Numbers in Ascending Order:");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}
