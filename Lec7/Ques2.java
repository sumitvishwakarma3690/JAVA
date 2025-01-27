import java.util.*;

// A function to multiply 2 numbers and return the product
public class Ques2 {
    public static int calculateProduct(int a, int b) {
    return a * b;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Product of two numbers a and b is: " + calculateProduct(a, b));
    }
}
