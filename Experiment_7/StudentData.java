import java.io.*;
import java.util.Scanner;

public class StudentData {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // Writing data to file
            FileOutputStream fos = new FileOutputStream("student.txt");
            DataOutputStream dos = new DataOutputStream(fos);

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Weight: ");
            float weight = sc.nextFloat();
            sc.nextLine();

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            System.out.print("Enter Phone Number: ");
            long phone = sc.nextLong();

            dos.writeUTF(name);
            dos.writeInt(age);
            dos.writeFloat(weight);
            dos.writeUTF(city);
            dos.writeLong(phone);

            dos.close();

            // Reading data from file
            FileInputStream fis = new FileInputStream("student.txt");
            DataInputStream dis = new DataInputStream(fis);

            System.out.println("\nStudent Information:");

            System.out.println("Name: " + dis.readUTF());
            System.out.println("Age: " + dis.readInt());
            System.out.println("Weight: " + dis.readFloat());
            System.out.println("City: " + dis.readUTF());
            System.out.println("Phone: " + dis.readLong());

            dis.close();

        } catch (IOException e) {
            System.out.println("Error in file operation");
        }

        sc.close();
    }
}