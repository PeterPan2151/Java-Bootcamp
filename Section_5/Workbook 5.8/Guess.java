import java.util.Scanner;

public class Guess  {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int correctNumber = randomNumber();
        System.out.println(correctNumber);
        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        int guess = scan.nextInt();

        while (guess != correctNumber) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
        }

        System.out.println("You goit it!");
        scan.close();
    }


    public static int randomNumber() {
        return (int) (Math.random() * 5) + 1;
    }

}
