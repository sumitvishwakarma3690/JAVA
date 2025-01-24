import java.util.*;

public class Ques2 {
    public static void main(String args[]) {

        // Print the table of a number input by the user.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i=1; i<11; i++) {
            System.out.println(n * i);
        }
    }
    
}
