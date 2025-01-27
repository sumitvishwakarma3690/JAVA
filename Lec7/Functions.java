import java.util.*;

// Functions 
// Print a given name in a function
class Functions{
    public static void printmyName(String name) {
        System.out.println(" My name is "+ name);
        return;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printmyName(name); // function ko call kia
    }
}

