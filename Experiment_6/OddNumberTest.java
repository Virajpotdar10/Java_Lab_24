import java.util.Scanner;

// Custom Exception
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

public class OddNumberTest {

    // Method that checks number
    static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is Odd!");
        } else {
            System.out.println("Number is Even.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}