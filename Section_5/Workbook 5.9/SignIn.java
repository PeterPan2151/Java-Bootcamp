import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String enteredUsername = scan.nextLine();
        System.out.print("- Password: ");
        String enteredPassword = scan.nextLine();

        while (!enteredPassword.equals(password) || !enteredUsername.equals(username)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            enteredUsername = scan.nextLine();
            System.out.print("- Password: ");
            enteredPassword = scan.nextLine();
            
        }
        System.out.println("Sign in succesfull. Welcome");

        scan.close();
        
    }
}
