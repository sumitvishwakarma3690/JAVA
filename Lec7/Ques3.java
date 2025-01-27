import java.util.*;

// Fuction to find the factorial of a number.
public class Ques3 {
    public static void factorial(int n) {
        // loop
        if(n < 0) {
            System.out.println("Factorial of negative number is not possible.");
            return;
        }
        int factorial = 1;

        for(int i=n; i>=1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        factorial(n);
    }
}
