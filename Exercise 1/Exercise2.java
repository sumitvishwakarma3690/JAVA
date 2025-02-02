import java.util.*;

// Write a function to print the sum of all odd numbers from 1 to n.
public class Exercise2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("n = ");
        int n = input.nextInt();
        int sum = 0;
        
        for (int i = 1; i <= n; i++) {       
            if (i % 2 != 0) {
                sum++;
            }
        }
        
        System.out.println(sum);
    }
}

