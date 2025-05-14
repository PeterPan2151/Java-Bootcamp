import java.util.Scanner;

public class DiceJack {
    public static void main(String[] args) {
    Scanner myScan = new Scanner(System.in);

        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();
        int totalSumRolls = roll1 + roll2 + roll3;
        
        System.out.println("Enter 3 numbersbetween 1 and 6: ");
        int num1 = myScan.nextInt();
        int num2 = myScan.nextInt();
        int num3 = myScan.nextInt();
        int sumNumbers = num1 + num2 + num3;

        boolean firstResult = isLessThan1(num1, num2, num3);
        boolean secondRedult = isHigherThan6(num1, num2, num3);

        if (firstResult || secondRedult) {
            System.out.println("You entered a number out of range");
            System.exit(0);
        }

        System.out.println("Total of dice rolls: " + totalSumRolls);
        System.out.println("Total of numbers: " + sumNumbers);

        if (userWon(sumNumbers, totalSumRolls)) {
            System.out.println("Congratulations, you won");
        } else {
            System.out.println("You lost");
        }

        myScan.close();
        
    }


    public static boolean isLessThan1(int num1, int num2, int num3) {
        return (num1 < 1 || num2 < 1 || num3 < 1);
    }


    public static boolean isHigherThan6(int num1, int num2, int num3) {
        return (num1 > 6 || num2 > 6 || num3 > 6);
    }


    public static boolean userWon(int sumNumbers, int sumDiceRolls) {
        return (sumNumbers > sumDiceRolls && (sumNumbers - sumDiceRolls) < 3);
    }


    public static int rollDice() {
        double randomNumber = Math.random() * 6;
        randomNumber += 1;
        return (int) randomNumber;
    }
}