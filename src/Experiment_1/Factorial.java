package src.Experiment_1;
import java.util.*;

class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int size = sc.nextInt();
        System.out.print("Performing Factorial:");
        int fact = 1;
        for (int i = 1; i <= size; i++) {
            fact *= i;
        }
        System.out.println(fact);
        sc.close();

    }
}


// import java.util.*;

// class Factorial{
//     public static void main(String[] arg){
//     Scanner sc= new Scanner(System.in);
//     System.out.println("Enter the number:");
//     int val = sc.nextInt();
//     int fact =1;
//     for (int i=1; i<=val;i++){
//         fact*=i;
//     }
//     System.out.println(fact);
// }
// }