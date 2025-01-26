public class Pattern4 {
    public static void main(String args[]) {

        // Print inverted half pyramid pattern with stars where n = 4;
        int n = 4; 
        
        // outer loop
        for(int i=n; i>=1; i--) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
         }
    }
}
