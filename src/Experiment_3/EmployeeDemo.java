import java.util.*;

// Base Class
class Employee {
    String name, address, jobTitle;
    double salary;

    Employee(String n, String a, String j, double s) {
        name = n;
        address = a;
        jobTitle = j;
        salary = s;
    }

    void calculateBonus() {
        System.out.println("Bonus: " + salary * 0.10);
    }

    void performanceReport() {
        System.out.println("Performance: Good");
    }

    void manageProject() {
        System.out.println("Managing general tasks.");
    }

    void display() {
        System.out.println("\nName: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    void calculateBonus() {
        System.out.println("Manager Bonus: " + salary * 0.20);
    }

    void manageProject() {
        System.out.println("Manager is managing the entire project.");
    }
}


class Developer extends Employee {
    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }

    void calculateBonus() {
        System.out.println("Developer Bonus: " + salary * 0.15);
    }

    void manageProject() {
        System.out.println("Developer is working on coding tasks.");
    }
}

class Programmer extends Employee {
    Programmer(String n, String a, double s) {
        super(n, a, "Programmer", s);
    }

    void calculateBonus() {
        System.out.println("Programmer Bonus: " + salary * 0.12);
    }

    void manageProject() {
        System.out.println("Programmer is debugging and testing.");
    }
}


public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1.Manager  2.Developer  3.Programmer");
        System.out.print("Choice: ");
        int ch = sc.nextInt();
        sc.nextLine();

        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.print("Salary: ");
        double salary = sc.nextDouble();

        Employee emp;

        switch (ch) {
            case 1:
                emp = new Manager(name, address, salary);
                break;
            case 2:
                emp = new Developer(name, address, salary);
                break;
            case 3:
                emp = new Programmer(name, address, salary);
                break;
            default:
                System.out.println("Invalid!");
                return;
        }

        emp.display();
        emp.calculateBonus();
        emp.performanceReport();
        emp.manageProject();
    }
}