public class Pattern3 {
    public static void main(String[] args) {

        // Print the Numbers Pyramid where n = 5;
        int n =5;

        for(int i=1; i<=n; i++) {
            //spaces 
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            //numbers --> print row no, row no times
            for(int j=1; j<=i; j++) {
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
