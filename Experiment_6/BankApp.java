package Experiment_6;

import java.util.Scanner;

// Custom Exception for Low Balance
class LowBalanceException extends Exception {
    public LowBalanceException(String message) {
        super(message);
    }
}

// Custom Exception for Negative Number
class NegativeNumberException extends Exception {
    public NegativeNumberException(String message) {
        super(message);
    }
}

// BankAccount Class
class BankAccount {

    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void balanceEnquiry() {
        System.out.println("Current Balance: " + balance);
    }

    void deposit(double amount) throws NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot deposit negative amount!");
        }
        balance += amount;
        System.out.println("Amount Deposited Successfully.");
    }

    void withdraw(double amount) throws LowBalanceException, NegativeNumberException {
        if (amount < 0) {
            throw new NegativeNumberException("Cannot withdraw negative amount!");
        }
        if (amount > balance) {
            throw new LowBalanceException("Insufficient Balance!");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn Successfully.");
    }
}

// Main Class
public class BankApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Balance: ");
        double initialBalance = sc.nextDouble();

        BankAccount acc = new BankAccount(initialBalance);

        try {
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance Enquiry");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double dep = sc.nextDouble();
                    acc.deposit(dep);
                    acc.balanceEnquiry();
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double wd = sc.nextDouble();
                    acc.withdraw(wd);
                    acc.balanceEnquiry();
                    break;

                case 3:
                    acc.balanceEnquiry();
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } catch (LowBalanceException | NegativeNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}