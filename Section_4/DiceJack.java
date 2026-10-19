import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        int totalRoll = roll1 + roll2 + roll3;

        System.out.println("Enter three numbers between 1 and 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        int totalSum = num1 + num2 + num3;
        
        boolean firstResult = areLessThanOne(num1, num2, num3);
        boolean secondResult = areGreaterThanSix(num1, num2, num3);

        if (firstResult || secondResult) {
            System.out.println("You entered an invalid number");
            System.exit(0);
        }

        System.out.println("Your sum is: " + totalSum);
        System.out.println("Computers sum: " + totalRoll);

        boolean win = userWon(totalSum, totalRoll);
        if (win) {
            System.out.println("You won");
        } else {
            System.out.println("You didnt win");
        }

        scan.close();
    }


    public static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }


    public static boolean areLessThanOne(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }


    public static boolean areGreaterThanSix(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }


    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls < 5));
    }
}
