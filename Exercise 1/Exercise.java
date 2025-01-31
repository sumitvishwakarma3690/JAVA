import java.util.*;

class Exercise {
    // https://docs.google.com/document/d/1eEv8JMCr_ZBoE5JSsZxdT5Zq53vq388-EIbE_mi7QME/edit?tab=t.0 link to access the questions that are given to this exercise.

    public static double average(int a, int b, int c) {
        return (a + b + c ) / 3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        System.out.println("Enter number a "+ a);
        int b = sc.nextInt();
        System.out.println("Enter number b "+ a);
        int c = sc.nextInt();
        System.out.println("Enter number c "+ a);
        System.out.println("The average of entered no is " + average(a,b,c));
    }
}