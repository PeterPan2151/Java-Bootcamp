import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scan.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("• There are two players, you and the computer.");
        System.out.println("• The dealer will give each player one card.");
        System.out.println("• Then, the dealer will draw five cards (the river)");
        System.out.println("• The player with the most river matches wins!");
        System.out.println("• If the matches are equal, everyone's a winner!\n");
        System.out.println("• Ready? Type anything if you are.");

        System.out.println("Here's your card:");
        String playersCard = randomCard();
        System.out.println(playersCard + "\n");
        System.out.println("Here's the computer's card:");
        String computersCard = randomCard();
        System.out.println(computersCard);

        int yourMatches = 0;
        int computerMatches = 0;
        System.out.println("Now, the dealer will draw five cards. Press enter to continue.");
        System.out.println("The dealer will draw a card every time the user presses enter.");
        scan.nextLine();

        for (int i = 1; i < 6; i++) {
            String randomCard = randomCard();
            if (randomCard.equals(playersCard)) {
                yourMatches++;
            } else if ( randomCard.equals(computersCard)) {
                computerMatches++;
            }
            System.out.println("Card " + i + ": \n");
            System.out.println(randomCard);
            scan.nextLine();
        }
        
        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches: " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println("You win!    ");
        } else if (computerMatches > yourMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("everyone wins!");
        }

         scan.close();
    }


    public static String randomCard() {
        String card;
        int randomNumebr = (int) (Math.random() * 13) + 1;
        switch (randomNumebr) {
            case 1:
                card = "   _____\n"+
                   "  |A _  |\n"+ 
                   "  | ( ) |\n"+
                   "  |(_'_)|\n"+
                   "  |  |  |\n"+
                   "  |____V|\n";
                break;
            case 2:
                card = "   _____\n"+              
                    "  |2    |\n"+ 
                    "  |  o  |\n"+
                    "  |     |\n"+
                    "  |  o  |\n"+
                    "  |____Z|\n";
                break;
            case 3:
                card = "   _____\n" +
                  "  |3    |\n"+
                  "  | o o |\n"+
                  "  |     |\n"+
                  "  |  o  |\n"+
                  "  |____E|\n";
                break;
            case 4:
                card = "   _____\n" +
                   "  |4    |\n"+
                   "  | o o |\n"+
                   "  |     |\n"+
                   "  | o o |\n"+
                   "  |____h|\n";
                
                break;
            case 5:
                card = "   _____ \n" +
                    "  |5    |\n" +
                    "  | o o |\n" +
                    "  |  o  |\n" +
                    "  | o o |\n" +
                    "  |____S|\n";
                
                break;
            case 6:
                card =  "   _____ \n" +
                    "  |6    |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  | o o |\n" +
                    "  |____6|\n";
                
                break;
            case 7:
                card = "   _____ \n" +
                    "  |7    |\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |____7|\n";
                
                break;
            case 8:
                card = "   _____ \n" +
                    "  |8    |\n" +
                    "  |o o o|\n" +
                    "  | o o |\n" +
                    "  |o o o|\n" +
                    "  |____8|\n";
                
                break;
            case 9:
                card = "   _____ \n" +
                    "  |9    |\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |____9|\n";
                
                break;
            case 10:
                card = "   _____ \n" +
                    "  |10  o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |o o o|\n" +
                    "  |___10|\n";
                
                break;
            case 11:
                card = "   _____\n" +
                    "  |J  ww|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o% |\n"+ 
                    "  | | % |\n"+ 
                    "  |__%%[|\n";
                
                break;
            case 12:
                card = "   _____\n" +
                    "  |Q  ww|\n"+ 
                    "  | o {(|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%O|\n";
                
                break;
            case 13:
                card = "   _____\n" +
                    "  |K  WW|\n"+ 
                    "  | o {)|\n"+ 
                    "  |o o%%|\n"+ 
                    "  | |%%%|\n"+ 
                    "  |_%%%>|\n";
                
                break;
            default:
                card = "";
                break;
        }
        return card;
    }

}
