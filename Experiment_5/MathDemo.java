package Experiment_5;

import Experiment_5.MathOperation.*;

import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        double number = sc.nextDouble();

        FloorOperation f = new FloorOperation();
        RoundOperation r = new RoundOperation();
        CeilOperation c = new CeilOperation();

        System.out.println("Floor Value: " + f.getFloor(number));
        System.out.println("Round Value: " + r.getRound(number));
        System.out.println("Ceil Value: " + c.getCeil(number));

        sc.close();
    }
}