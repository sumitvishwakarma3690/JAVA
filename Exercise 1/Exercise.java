import java.util.*;

// Enter 3 numbers from the user & make a function to print their average.

class Exercise {
    // https://docs.google.com/document/d/1eEv8JMCr_ZBoE5JSsZxdT5Zq53vq388-EIbE_mi7QME/edit?tab=t.0 link to access the questions that are given to this exercise.

    public static double average(double a, double b, double c) {
        return (a + b + c ) / 3;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println("The number a "+ a);
        double b = sc.nextDouble();
        System.out.println("The number b "+ b);
        double c = sc.nextDouble();
        System.out.println("The number c "+ c);
        System.out.println("The average of entered no is " + average(a,b,c));
    }
}