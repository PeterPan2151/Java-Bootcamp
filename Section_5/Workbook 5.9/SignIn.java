import java.util.Scanner;

public class SignIn {
    public static void main(String[] args) {
        String username = "Samantha";
        String password = "Java <3";
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWelcome to Javagram! Sign in below\n");
        System.out.print("- Username: ");
        String inputUser = scan.nextLine();
        System.out.print("- Password: ");
        String inputPassword = scan.nextLine();

        while (!inputUser.equals(username) || !inputPassword.equals(password)) {
            System.out.println("\nIncorrect, please try again!\n");
            System.out.print("- Username: ");
            inputUser = scan.nextLine();
            System.out.print("- Password: ");
            inputPassword = scan.nextLine();
        }

        System.out.println("Sign in succesful. Welcome!");
        scan.close();
    }
}
