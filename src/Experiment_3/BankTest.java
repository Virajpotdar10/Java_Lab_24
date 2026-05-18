import java.util.*;

class BankAc {
    double balance;

    void deposit(double amt) {
        balance += amt;
        System.out.println("Deposited: " + amt + " | Balance: " + balance);
    }

    void withdraw(double amt) {
        balance -= amt;
        System.out.println("Withdrawn: " + amt + " | Balance: " + balance);
    }
}

class SavingAc extends BankAc {

    void withdraw(double amt) {
        if (balance - amt >= 100)
            super.withdraw(amt);
        else
            System.out.println("Minimum balance of 100 required.");
    }
}

public class BankTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SavingAc saving = new SavingAc();
        int ch;

        do {
            System.out.println("\n1.Deposit  2.Withdraw  3.Exit");
            System.out.print("Choice: ");
            ch = sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.print("Amount: ");
                    saving.deposit(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Amount: ");
                    saving.withdraw(sc.nextDouble());
                    break;

                case 3:
                    System.out.println("Bye!");
                    break;

                default:
                    System.out.println("Invalid!");
            }
        } while (ch != 3);
    }
}