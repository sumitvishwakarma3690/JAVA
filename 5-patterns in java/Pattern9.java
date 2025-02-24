public class Pattern9 {
    public static void main(String[] args) {

        // Print the 0-1 traingle pattern where n = 5;
        int n = 5; 

        // outer loop
        for(int i=1; i<=n; i++) {
            // inner loop 
            for(int j=1; j<=i; j++) {
                int sum = i+j;
                if(sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                }
                System.out.println();
            }
        }
    }

