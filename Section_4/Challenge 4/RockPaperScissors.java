import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

        String wantsToPlay = scan.nextLine();
        if (wantsToPlay.equals("yes")) {
            System.out.println("Great!");

            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();

            if (validChoice(userChoice)) {
                String comChoice = computerChoice();
                String result = result(userChoice, comChoice);
                printResult(userChoice, comChoice, result);
            }

        } else {
            System.out.println("Darn, some other time...!  ");
        }
        scan.close();
    }

    /**
     * Function name: computerChoice - picks randomly between rock paper and
     * scissors
     * 
     * @return a choice (String).
     * 
     *         Inside the function:
     *         1. Picks a random number between 0 and 2.
     *         2. if 0: returns the choice 'rock'
     *         if 1: returns the choice 'paper'
     *         if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 0:
                return "rock";
            case 1:
                return "paper";
            case 2:
                return "scissors";
            default:
                return "";
        }
    }

    /**
     * Function name: result - It returns the result of the game.
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @return result (String)
     * 
     *         Inside the function:
     * 
     *         1. result is "You win!" if:
     *
     *         You: "rock" Computer: "scissors"
     *         You: "paper" Computer: "rock"
     *         You: "scissors" Computer: "paper"
     *
     *         2. result is "You lose" if:
     * 
     *         Computer: "rock" You: "scissors"
     *         Computer: "paper" You: "rock"
     *         Computer: "scissors" You: "paper"
     *
     *         3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *         4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        switch (yourChoice) {
            case "rock":
                if (computerChoice.equals("scissors")) {
                    result = "You win!";
                } else if (computerChoice.equals("paper")) {
                    result = "You lose";
                } else {
                    result = "It's a tie";
                }
                break;
            case "paper":
                if (computerChoice.equals("rock")) {
                    result = "You win!";
                } else if (computerChoice.equals("scissors")) {
                    result = "You lose";
                } else {
                    result = "It's a tie";
                }
                break;
            case "scissors":
                if (computerChoice.equals("paper")) {
                    result = "You win!";
                } else if (computerChoice.equals("rock")) {
                    result = "You lose";
                } else {
                    result = "It's a tie";
                }
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        return result;
    }

    /**
     * Name: printResult - It prints everything (your choice, computer choice,
     * result)
     * 
     * @param yourChoice     (String)
     * @param computerChoice (String)
     * @param result         (String)
     * 
     *                       Inside the function:
     * 
     *                       1. prints everything:
     *                       – prints: You chose: <your choice>
     *                       – prints: The computer chose: <computer choice>
     *                       – prints: <result>
     */
    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("you chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);
    }

    /**
     * Function name: validChoice
     * 
     * 
     * 
     * @param choice (string)
     * @return choice (String)
     */
    public static boolean validChoice(String choice) {
        return (choice.equals("rock") || choice.equals("paper") || choice.equals("scissors"));
    }

}
