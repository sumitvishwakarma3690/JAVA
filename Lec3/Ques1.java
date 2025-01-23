import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {

     // Ques: 1)a = b -> Equal 2)a > b -> a is greater 3)a < b -> a is lesser.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("Equal");
            
        } else if(a > b) {
            System.out.println("a is greater");
            
        }
        else {
            System.out.println("a is lesser");
        }
    }
}
