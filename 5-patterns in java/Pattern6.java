public class Pattern6 {
    public static void main(String[] args) {

        // Print half pyramid pattern with numbers where n = 5;
        int n = 5; 

        // outer loop 
        for(int i=1; i<=n; i++) {
            // inner loop 
            for(int j=1; j<=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
