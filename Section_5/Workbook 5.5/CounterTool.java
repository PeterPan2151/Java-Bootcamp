import java.util.Scanner;

public class CounterTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("I hear you like to count by threes\n");
        System.out.println("Jimmy: It depends.");
        System.out.println("Oh, ok...");

        System.out.print("\t1. Pick a number to count by: ");
        int step = scan.nextInt();
        System.out.print("\t2. Pick a number to start counting from: ");
        int start = scan.nextInt();
        System.out.print("\t3. Pick a number to count to: ");
        int stop = scan.nextInt();

        for (int i = start; i <= stop; i += step){
            System.out.print(i + " ");
        }

        scan.close();
    }
}
