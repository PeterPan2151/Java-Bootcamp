import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Let's play Rock Paper Scissors.");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.\n");
        System.out.println("Are you ready? Write 'yes' if you are.");

    //Task 1: See if the user wants to play. 
        String wantsToPlay = scan.nextLine();
        if (wantsToPlay.equals("yes")) {
            System.out.println("Great!");

            System.out.println("rock - paper - scissors, shoot!");
            String userChoice = scan.nextLine();

            if (validChoice(userChoice)) {
                String comChioce = computerChoice();
            }

        } else {
            System.out.println("Darn, some other time...!  ");
        }

    /*Task 2: Set up the game
    

       • if the answer is yes: 
             – get the result (can only be done after task 4)
             – print everything (can only be done after task 5).     
    */
              

        scan.close();
    }


    /**
     * Function name: computerChoice - picks randomly between rock paper and scissors
     * @return a choice (String).
     * 
     * Inside the function:
     *   1. Picks a random number between 0 and 2.
     *   2. if 0: returns the choice 'rock'
     *      if 1: returns the choice 'paper'
     *      if 2: returns the choice 'scissors'
     */
    public static String computerChoice() {
        int choice = (int) (Math.random() * 3);
        switch (choice) {
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "scissors";
            default:
                return "";
        }
    }




    //Task 4  – Write a function that compares the choices and returns the result.

    /**
     * Function name: result - It returns the result of the game.
     *  @param yourChoice (String)
     *  @param computerChoice (String) 
     *  @return result (String) 

     * Inside the function:
     *   
     *   1. result is "You win!" if:
     *
     *       You: "rock"      Computer: "scissors"
     *       You: "paper"     Computer: "rock"
     *       You: "scissors"  Computer: "paper"
     *
     *   2. result is "You lose" if:
     * 
     *       Computer: "rock"      You: "scissors"
     *       Computer: "paper"     You: "rock"
     *       Computer: "scissors"  You: "paper"
     *
     *   3. result is "It's a tie" if: Your choice equals computer choice.
     * 
     * 
     *   4. Otherwise, print "INVALID CHOICE" and exit the program.
     *
     *
     */
    public static String result(String yourChoice, String computerChoice) {
        String result = "";
        switch (yourChoice) {
            case "rock":
                break;
            case "paper":
                break;
            case "scissors":
                break;
            default:
                System.out.println("Invalid choice");
                System.exit(0);
        }
        return result;
      }
 
     //Task 5  – Write a function that prints your choice, the computer's, and the result.

    /**
     * Name: printResult - It prints everything (your choice, computer choice, result)
     * @param yourChoice (String)
     * @param computerChoice (String)
     * @param result (String)
     * 
     * Inside the function:
     * 
     *  1. prints everything:
     *      – prints: You chose:          <your choice>
     *      – prints: The computer chose: <computer choice>
     *      – prints: <result>
     */

    
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
