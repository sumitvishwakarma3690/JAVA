import java.util.*;

// Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows : 
	// 1 : + (Addition) a + b
    // 2 : - (Subtraction) a - b
    // 3 : * (Multiplication) a * b
    // 4 : / (Division) a / b
    // 5 : % (Modulo or remainder) a % b
    // Calculate the result according to the operation given and display it to the user.
    
class problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();


        int sum = a + b;
        System.out.println("The sum is:"+sum);
        int sub = a - b;
        System.out.println("The sub is:"+sub);
        int mul = a * b;
        System.out.println("The mul is:"+mul);
        int div = a / b;
        System.out.println("The div is:"+div);
        int modu = a % b;
        System.out.println("The modu is:"+modu);
    
}
}