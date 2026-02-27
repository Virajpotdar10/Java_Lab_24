package Experiment_6;
import java.util.Scanner;
import Experiment_6.ExceptionHandlingdemo.*;

public class MainProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Calculator calc = new Calculator();

        try {
            int result = calc.divide(a, b);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}