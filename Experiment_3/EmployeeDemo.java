import java.util.Scanner;

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
        double bonus = salary * 0.10;
        System.out.println("Bonus: " + bonus);
    }

    void performanceReport() {
        System.out.println("Performance: Good");
    }

    void manageProject() {
        System.out.println("Managing general tasks.");
    }

    void display() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: " + salary);
    }
}


// Manager Class
class Manager extends Employee {

    Manager(String n, String a, double s) {
        super(n, a, "Manager", s);
    }

    void calculateBonus() {
        double bonus = salary * 0.20;
        System.out.println("Manager Bonus: " + bonus);
    }

    void manageProject() {
        System.out.println("Manager is managing the entire project.");
    }
}


// Developer Class
class Developer extends Employee {

    Developer(String n, String a, double s) {
        super(n, a, "Developer", s);
    }

    void calculateBonus() {
        double bonus = salary * 0.15;
        System.out.println("Developer Bonus: " + bonus);
    }

    void manageProject() {
        System.out.println("Developer is working on coding tasks.");
    }
}


// Programmer Class
class Programmer extends Employee {

    Programmer(String n, String a, double s) {
        super(n, a, "Programmer", s);
    }

    void calculateBonus() {
        double bonus = salary * 0.12;
        System.out.println("Programmer Bonus: " + bonus);
    }

    void manageProject() {
        System.out.println("Programmer is debugging and testing.");
    }
}


// Main Class
public class EmployeeDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Employee Type:");
        System.out.println("1. Manager");
        System.out.println("2. Developer");
        System.out.println("3. Programmer");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();

        Employee emp = null;

        switch (choice) {
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
                System.out.println("Invalid choice");
                System.exit(0);
        }

        emp.display();
        emp.calculateBonus();
        emp.performanceReport();
        emp.manageProject();

        sc.close();
    }
}
 
