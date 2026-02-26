// import java.util.*;

// class BankAc {
//     double balance;

//     void deposit(double amt) {
//         balance = balance + amt;
//         System.out.println("Amount Credited: " + amt);
//         System.out.println("Balance: " + balance);
//     }

//     void withdraw(double amt) {
//         balance = balance - amt;
//         System.out.println("Withdrawn: " + amt);
//         System.out.println("Balance: " + balance);
//     }
// }

// class SavingAc extends BankAc {

//     void withdraw(double amt) {
//         if (balance - amt >= 100) {   
//             balance = balance - amt;
//             System.out.println("Withdrawn: " + amt);
//             System.out.println("Balance: " + balance);
//         } else {
//             System.out.println("Minimum balance of 100 must be maintained.");
//         }
//     }
// }

// public class BankTest {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         SavingAc saving = new SavingAc();

//         while (true) {
//             System.out.println("\n---- Bank Account ----");
//             System.out.println("1. Deposit");
//             System.out.println("2. Withdraw");
//             System.out.println("3. Exit");
//             System.out.print("Enter choice: ");
//             int choice = sc.nextInt();

//             switch (choice) {
//                 case 1:
//                     System.out.print("Enter amount to deposit: ");
//                     double amt = sc.nextDouble();
//                     saving.deposit(amt);
//                     break;

//                 case 2:
//                     System.out.print("Enter amount to withdraw: ");
//                     double amount = sc.nextDouble();
//                     saving.withdraw(amount);
//                     break;

//                 case 3:
//                     System.out.println("Exiting...");
//                     sc.close();
//                     return;   

//                 default:
//                     System.out.println("Invalid choice!");
//             }
//         }
//     }
// }


import java.util.*;

class Student{
    int rn;
    int getRollNo(){
        return rn;
    }

}
class Test extends Student{ 
    float sub1,sub2;
    void getMarks(int s1,int s2){
        sub1=s1;
        sub2=s2;
    }
    

}
class Result extends Test{
    
    Result(int s1,int s2){
        super(s1,s2);
    }
    
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);




    }