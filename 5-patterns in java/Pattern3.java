public class Pattern3 {
    public static void main(String args[]) {

        // Print half pyramid pattern with stars where n = 4;
        int n = 4;

        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
