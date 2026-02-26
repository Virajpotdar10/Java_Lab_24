 package Experiment_4;

// import java.util.Scanner;

// class Student {

//     int rollNo;

//     void setRollNo(int r) {
//         rollNo = r;
//     }

//     int getRollNo() {
//         return rollNo;
//     }
// }

// class Test extends Student {

//     int sub1, sub2;

//     void setMarks(int m1, int m2) {
//         sub1 = m1;
//         sub2 = m2;
//     }

//     void getMarks() {
//         System.out.println("Subject 1 Marks: " + sub1);
//         System.out.println("Subject 2 Marks: " + sub2);
//     }
// }

// interface Sports {

//     int sMarks = 20;   
//     void set();        
// }

// class Result extends Test implements Sports {

//     int total;

//     public void set() {
//         total = sub1 + sub2 + sMarks;
//     }

//     void display() {
//         System.out.println("\n----- RESULT -----");
//         System.out.println("Roll Number: " + getRollNo());
//         getMarks();
//         System.out.println("Sports Marks: " + sMarks);
//         System.out.println("Total Marks: " + total);
//     }
// }


// Step 5: Test Application
// 

import java.util.*;

class Student{
    int rn;
    public void setRollNo(int r){
        rn=r;
    }

    public int getRollNo(){
        return rn;
    }

}
class Test extends Student{
    Student S =new Student();
    int Sub1,Sub2;
    public void setMark(int S1,int S2){
        Sub1=S1;
        Sub2=S2;
    }
    public int getMark(){
        return Sub1+Sub2;
    }
}
interface Sports{

}

class ResultDemo{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Test t=new Test();
        System.out.print("Enter your roll no:");
        int roll=sc.nextInt();
        t.setRollNo(roll);
        System.out.print("Your roll no is :"+t.getRollNo());
        System.out.print("Enter Sub1 :");
        int Sub1=sc.nextInt();
        System.out.print("Enter Sub2 :");
        int Sub2=sc.nextInt();
        t.setMark(Sub1,Sub2);
        System.out.print("Total:"+t.getMark());

        sc.close();
    } 
}