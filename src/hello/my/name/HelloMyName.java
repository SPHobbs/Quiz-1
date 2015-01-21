
package hello.my.name;
import java.util.Scanner;
public class HelloMyName {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your username.");
        String username = keyboard.next();
        System.out.println("Enter your password.");
        String password = keyboard.next();
        System.out.println("Hello " + username +", Welcome to CSC200 class! and Your password is " + password + ".");
    }    
}