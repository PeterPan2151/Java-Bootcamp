import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Hi Timmy! Choose a number to count to: ");
        int num = scan.nextInt();

        if (num <= 0) {
            System.out.println("invalid number");
            System.exit(0);
        }

        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }

        scan.close();
    }
}
