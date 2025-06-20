// Importing necessary Java package for user input
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        String continueCalculator;
        
        while (true) {
            System.out.println("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Enter the second number: ");
            double num2 = scanner.nextDouble();
            System.out.println("Choose an operation (+, -, *, /): ");
            scanner.nextLine();
            String operation = scanner.nextLine();
            double result = 0;
            
            
            switch(operation){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num1 == 0 || num2 == 0) {
                        System.out.println("Operation not valid");
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    break;
            }
            
            System.out.println("Result: " + result);
            
            System.out.println("Do you want to perform another calculation? (yes/no): ");
            continueCalculator = scanner.nextLine();
            
            if (continueCalculator.equals("no")) {
                break;
            }
            
        }

        System.out.println("Calculator session ended. Goodbye!");
        scanner.close();
    }
}
