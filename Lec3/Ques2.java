import java.util.*;

public class Ques2 {
    public static void main(String[] args) {

        // Print the greeting system whose click the button 1,2,3 Hello Namaste Assalamvalekum.

        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        
        // Solution Using if else if 
        // if(button == 1) {
        //     System.out.println("Hello");
        // }
        // else if(button == 2) {
        //     System.out.println("Namaste");
        // }
        // else if(button == 3){
        //     System.out.println("Assalamvalekum");
        // }
        // else{
        //     System.out.println("Invalid Button");
        // }

        // Solution using Switch case
        switch (button) {
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Assalamvalekum");
                break;
        
            default:
                System.out.println("Invalid Button");
                break;
        }
    }
}
