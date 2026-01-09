package Practice;
import java.util.Scanner;

// Sum of the Two Numbers

public class addition{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        // int a =10;
        // int b=20;
        // int sum=a+b;
        // System.out.println(sum);
        System.out.print("Enter first Number:");
        int a =s.nextInt();
        System.out.print("Enter Second Number:");
        int b =s.nextInt();
        int c = a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + c);
        s.close();
    }
}







