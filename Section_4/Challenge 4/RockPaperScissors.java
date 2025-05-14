import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");
 
        String wantsToPlay = scan.nextLine();
        
        switch (wantsToPlay) {
            case "yes":
                System.out.println("Great!");
                System.out.println("Rock - paper - scissors, shoot!");
                String playersChoice = scan.nextLine();
                String comChoice = computChoice();
                String result = result(playersChoice, comChoice);
                printResult(playersChoice, comChoice, result);
                break;

            case "no":
                System.out.println("Darn, some other time...!");
                System.exit(0);
                
            default:
                System.out.println("Invalid option");
                break;
        }      
        scan.close();
    }


    public static String computChoice() {
        int randomNumber = (int)(Math.random() * 3);
        String computerMove = "";
        switch (randomNumber) {
            case 0:
                computerMove = "rock";
                break;
            case 1:
                computerMove = "paper";
                break;
            case 2:
                computerMove = "scissors";
                break;
        }
        return computerMove;
    }


    public static String result(String yourChoice, String computerChoice) {
        if (yourChoice.equals("rock") && computerChoice.equals("scissors") || yourChoice.equals("paper") && computerChoice.equals("rock") || yourChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "You win!";
        } else if (yourChoice.equals("scissors") && computerChoice.equals("rock") || yourChoice.equals("rock") && computerChoice.equals("paper") || yourChoice.equals("paper") && computerChoice.equals("scissors")) {
            return "You lose";
        } else if(yourChoice.equals(computerChoice)) {
            return "It's a tie!";
        }
         else {
            return "Invalid Choice";
        }

    }


    public static void printResult(String yourChoice, String computerChoice, String result) {
        System.out.println("You chose: " + yourChoice);
        System.out.println("The computer chose: " + computerChoice);
        System.out.println(result);

    }

}
