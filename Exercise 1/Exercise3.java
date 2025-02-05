// import java.util.*;


//Write a function which takes in 2 numbers and returns the greater of those two.

// public class Exercise3 {

//    public static int getGreater(int a, int b) {
//       if(a > b) {
//           return a;
//       } else {
//           return b;
//       }
//    }
//    public static void main(String args[]) {
//       Scanner sc = new Scanner(System.in);
//       int a = sc.nextInt();
//       int b = sc.nextInt();
//       System.out.println(getGreater(a, b));
// }

// }

public class Exercise3 {
   public static int greaterNumber(int num1, int num2) {
       return (num1 > num2) ? num1 : num2;
   }

   public static void main(String[] args) {
       System.out.println(greaterNumber(15, 7)); // Output: 15
   }
}
