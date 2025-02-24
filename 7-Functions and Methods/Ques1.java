import java.util.*;

// A function to add 2 numbers and return the sum
public class Ques1 {
    public static int calculateSum(int a, int b) {
    return a + b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculateSum(a, b);
        System.out.println("Sum of two numbers a and b is: " + sum);
    }
}
