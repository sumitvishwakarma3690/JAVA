public class Pattern5 {
    public static void main(String[] args) {

        // Print inverted half pyramid pattern with stars where n = 4 rotated by 180deg
        int n = 4;
        
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop

            // for spaces 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }
            // for stars
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
