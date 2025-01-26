public class Pattern8 {
    public static void main(String[] args) {

        // Print the Floyd's Triangle pattern where n = 5;
        int n = 5; 
        int number = 1;

        //outer loop 
        for(int i=1; i<=n; i++) {
            // inner loop 
            for(int j=1; j<=i; j++) {
                System.out.print(number+" ");
                number++; // number = number + 1;
            }
            System.out.println();
        }
    }
}
