import java.util.Scanner;

public class Detention {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);

        System.out.println("Hi Bart. I can write lines for you.\nWhat do you want me to write?");
        String message = myScan.nextLine();

        for (int i = 1; i < 100; i++) {
            System.out.println(message);
        }
        
        myScan.close();
    }
}
