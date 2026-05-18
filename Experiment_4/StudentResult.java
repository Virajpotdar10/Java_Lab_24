package Experiment_4;
import java.util.Scanner;

// Student class
class Student {

    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

// Test class inherits Student
class Test extends Student {

    int sub1, sub2;

    void setMarks(int s1, int s2) {
        sub1 = s1;
        sub2 = s2;
    }

    void getMarks() {

        System.out.println("Subject 1 Marks: " + sub1);
        System.out.println("Subject 2 Marks: " + sub2);
    }
}

// Sports interface
interface Sports {

    int sMarks = 20;

    void set();
}

// Result class
class Result extends Test implements Sports {

    int total;

    public void set() {

        total = sub1 + sub2 + sMarks;

        System.out.println("\n--- RESULT ---");

        System.out.println("Roll No: " + getRollNo());

        getMarks();

        System.out.println("Sports Marks: " + sMarks);

        System.out.println("Total Marks: " + total);
    }
}

// Main class
public class StudentResult {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Result r = new Result();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Subject 1 Marks: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Subject 2 Marks: ");
        int m2 = sc.nextInt();

        r.setRollNo(roll);

        r.setMarks(m1, m2);

        r.set();

        sc.close();
    }
}