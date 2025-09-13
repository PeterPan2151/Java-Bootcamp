import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String wantsToPlay = scan.nextLine();

        /*
         * Task 2: Set up the game
         * – print everything (can only be done after task 5).
         */
        if (wantsToPlay.equals("yes")) {
            System.out.println("Great");
            System.out.println("rock - paper - scissors, shoot!");
            String playerChoice = scan.nextLine();
            String comChoice = computerChoice();

            String winner = result(playerChoice, comChoice);
            printResult(playerChoice, comChoice, winner);
        } else {
            System.out.println("Darn, some other time...!");
        }

        scan.close();
    }

    public static String computerChoice() {
        int randNumber = (int) (Math.random() * 3);
        if (randNumber == 0) {
            return "rock";
        } else if (randNumber == 1) {
            return "paper";
        } else {
            return "scissors";
        }
    }

    public static String result(String userChoice, String computerChoice) {
        if (userChoice.equals("rock") && computerChoice.equals("scissors")
                || userChoice.equals("paper") && computerChoice.equals("rock")
                || userChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You won!";
        } else if (computerChoice.equals("rock") && userChoice.equals("scissors")
                || computerChoice.equals("paper") && userChoice.equals("rock")
                || computerChoice.equals("scissors") && userChoice.equals("paper")) {
            return "You lose";
        } else if (userChoice.equals(computerChoice)) {
            return "It's a tie!";
        } else {
            return "INVALID CHOICE";
        }

    }

    public static void printResult(String userChoice, String computerChoice, String result) {
        System.out.println("You chose: " + userChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

}
