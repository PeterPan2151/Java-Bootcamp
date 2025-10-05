import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExampleOne {
    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("greetings.txt");
            Scanner scanner = new Scanner(file);
            System.out.println(scanner.nextLine());
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // greetings.txt
    }

}