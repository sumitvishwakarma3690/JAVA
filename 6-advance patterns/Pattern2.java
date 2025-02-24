public class Pattern2 {
    public static void main(String[] args) {

        // Print the solid rhombus pattern where n =5; 
        int n =5;

        for(int i=1; i<=n; i++) {
            //spaces 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //stars 
            for(int j=1; j<=5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
