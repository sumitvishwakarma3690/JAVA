class Pattern1 {
    public static void main(String args[]) {

        // Print solid rectangle pattern with stars where n = 4(rows) and m = 5(columns)
        int n = 4;
        int m = 5;

        //outer loop
        for (int i=1; i<=n; i++) {
            // inner loop
            for(int j=1; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
       }
    }
}