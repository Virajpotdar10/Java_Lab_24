import java.util.Scanner;

class Student {

    int roll_no;

    void setRollNo(int r) {
        roll_no = r;
    }

    void displayRollNo() {
        System.out.println("Roll Number: " + roll_no);
    }
}

class Test extends Student {

    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    void displayMarks() {
        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

class Result extends Test {

    int total;

    void calculateResult() {
        total = sub1 + sub2;
    }

    void displayResult() {
        displayRollNo();
        displayMarks();
        System.out.println("Total Marks: " + total);
    }
}

public class MultiLevelDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        r.setRollNo(roll);

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        r.setMarks(m1, m2);

        r.calculateResult();
        System.out.println("\n--- RESULT ---");
        r.displayResult();

        sc.close();
    }
}
