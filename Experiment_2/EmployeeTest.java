
// Create a class called Employee that includes three pieces of information as instance 
// variables: first name, last name, and monthly salary. Your class should have a constructor 
// that initializes the three instance variables. Provide a setter and getter method for each 
// instance variable. If the monthly salary is not positive, set it to 0.0. Write a test application 
// named EmployeeTest that demonstrates the Employee class's capabilities. Create two 
// Employee objects and display each object's yearly salary. Then give each Employee a 
// 10% raise and display each Employee's yearly salary again. 

import java.util.Scanner;

class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String f, String l, double s) {
        firstName = f;
        lastName = l;
        if (s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double s) {
        if (s > 0)
            monthlySalary = s;
        else
            monthlySalary = 0;
    }
}

public class EmployeeTest{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first name of employee: ");
        String f1 = sc.nextLine();
        System.out.print("Enter last name of employee: ");
        String l1 = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        double s1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter first name of employee: ");
        String f2 = sc.nextLine();
        System.out.print("Enter last name of employee: ");
        String l2 = sc.nextLine();
        System.out.print("Enter monthly salary: ");
        double s2 = sc.nextDouble();
        sc.nextLine();

        Employee e1 = new Employee(f1, l1, s1);
        Employee e2 = new Employee(f2, l2, s2);

        System.out.println(e1.getFirstName() + " yearly salary: " + (e1.getMonthlySalary() * 12));
        System.out.println(e2.getFirstName() + " yearly salary: " + (e2.getMonthlySalary() * 12));
        System.out.println("After 10% Raise in Salary ");
        e1.setMonthlySalary(e1.getMonthlySalary()*1.10);
        e2.setMonthlySalary(e2.getMonthlySalary()*1.10);
        System.out.println(e1.getFirstName()+ e1.getLastName()+"\n New Amount: "+(e1.getMonthlySalary()*12));
        System.out.println(e2.getFirstName()+ e2.getFirstName()+"\n New Amount: "+(e2.getMonthlySalary()*12));
        sc.close();
    }
}
