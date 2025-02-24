public class Pattern7 {
    public static void main(String[] args) {

        // Print Inverted Half pyramid with numbers pattern where n= 5;
        int n = 5;

        //outer loop 
        for(int i=1; i<=n; i++) {
            // inner loop 
            for(int j=1; j<=n-i+1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
